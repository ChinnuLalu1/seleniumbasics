package org.selenium.testngcommands;

import org.Constans.Constans;
import org.Constans.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.selenium.utilities.ExcelUtility;
import org.selenium.utilities.RandomDataUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;

public class RegisterPageTest extends Base {
    @Test
    public void verifyRegisterPageTitle() {
        WebElement registerButton = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerButton.click();
        String actualTitle = driver.getTitle();
        ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.REGISTRATION_PAGE);
        String expectedTitle = data.get(0);
        Assert.assertEquals(actualTitle, expectedTitle, Messages.TITLE_MISMATCH);
    }

    @Test
    public void verifyUserRegister() {
        String fistName = RandomDataUtility.getFirstName();
        String lastName = RandomDataUtility.getLastName();
        String emailId = fistName + "." + lastName + "@yahoo.com";
        String password = fistName + "." + lastName;
        WebElement registerField = driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerField.click();
        WebElement genderButton = driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderButton.click();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys(fistName);
        WebElement lastNameData = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastNameData.sendKeys(lastName);
        WebElement email = driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys(emailId);
        WebElement passwordData = driver.findElement(By.xpath("//input[@id='Password']"));
        passwordData.sendKeys(password);
        WebElement confirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys(password);
        WebElement registerButton = driver.findElement(By.xpath("//input[@id='register-button']"));
        registerButton.click();
        WebElement actualMsgElement = driver.findElement(By.xpath("//div[@class='result']"));
        String actualMsg = actualMsgElement.getText();
        ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.REGISTRATION_PAGE);
        String expectedMsg = data.get(1);
        Assert.assertEquals(actualMsg, expectedMsg, Messages.USER_REGISTRATION_FAILED);

    }
}
