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

public class LoginPageTest extends Base {
    @Test
    public void verifyLoginPageTitle(){
        String actualLoginPageTitle= driver.getTitle();
        ArrayList<String>data= ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH,Constans.LOGIN_PAGE);
        String expectedLoginPageTitle= data.get(0);
        Assert.assertEquals(actualLoginPageTitle,expectedLoginPageTitle,Messages.TITLE_MISMATCH);
    }
    @Test
    public void verifyUserLogin(){
        String firstName=RandomDataUtility.getFirstName();
        String lastName=RandomDataUtility.getLastName();
        String emailId=firstName+"."+lastName;
        String password=firstName+"."+lastName;
        WebElement loginField= driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginField.click();
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys(emailId);
        WebElement passwordData= driver.findElement(By.xpath("//input[@id='Password']"));
        passwordData.sendKeys(password);
        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
    }
}
