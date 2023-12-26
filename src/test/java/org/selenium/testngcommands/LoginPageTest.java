package org.selenium.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPageTest extends Base {
    @Test
    public void verifyLoginPageTitle(){
        driver.get("https://demowebshop.tricentis.com/login");
        String actualLoginPageTitle= driver.getTitle();
        String expectedLoginPageTitle="Demo Web Shop. Login";
        Assert.assertEquals(actualLoginPageTitle,expectedLoginPageTitle,"Not a valid title");
    }
    @Test
    public void verifyUserLogin(){
        driver.get("https://demowebshop.tricentis.com/login");
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("jinolalu@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("jinolalu");
        WebElement loginButton=driver.findElement(By.xpath("//input[@class='button-1 login-button']"));
        loginButton.click();
    }
}
