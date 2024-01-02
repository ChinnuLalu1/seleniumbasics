package org.selenium.testngcommands;

import org.Constans.Constans;
import org.Constans.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.selenium.dataprovider.DataProviders;
import org.selenium.utilities.ExcelUtility;
import org.selenium.utilities.RandomDataUtility;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class LoginPageTest extends Base {
    @Test
    public void verifyLoginPageTitle() {
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginField.click();
        String actualLoginPageTitle = driver.getTitle();
        ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.LOGIN_PAGE);
        String expectedLoginPageTitle = data.get(0);
        Assert.assertEquals(actualLoginPageTitle, expectedLoginPageTitle, Messages.TITLE_MISMATCH);
    }

    @Test
    public void verifyUserLogin() {
        String firstName = RandomDataUtility.getFirstName();
        String lastName = RandomDataUtility.getLastName();
        String emailId = firstName + "." + lastName;
        String password = firstName + "." + lastName;
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginField.click();
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys(emailId);
        WebElement passwordData = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordData.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
    }
    @Test(dataProvider ="InvalidUserCredentials", dataProviderClass = DataProviders.class)
    public void verifyUserLoginWithInvalidCredentials(String userName, String password){
        WebElement loginField = driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginField.click();
        WebElement emailField = driver.findElement(By.xpath("//input[@id='Email']"));
        ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.LOGIN_PAGE);
        emailField.sendKeys(userName);
        WebElement passwordField = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordField.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
        WebElement actualMsgElement = driver.findElement(By.xpath("//span[text()='Login was unsuccessful. Please correct the errors and try again.']"));
        String actualMsgText = actualMsgElement.getText();
        String expectedMsgText = data.get(3);
        Assert.assertEquals(actualMsgText,expectedMsgText,Messages.LOGIN_FAILED_WARNING_MSG_NOT_FOUND);
    }
}
