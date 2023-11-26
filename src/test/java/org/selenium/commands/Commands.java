package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends Base {
    @Test
    public void verifySwagLabsUserName(){
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField= driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        WebElement passwordField=driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton=driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement swagLogo=driver.findElement(By.className("app_logo"));
        String actualSwagLogoTxt = swagLogo.getText();
        String expectedSwagLogoText= "Swag Labs";
        Assert.assertEquals(actualSwagLogoTxt,expectedSwagLogoText,"Invalid logo text fount in login page");

    }

    public void verifyDemoWebShopUserLogin(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement loginField=driver.findElement(By.className("ico-login"));
        loginField.click();
        WebElement emailField=driver.findElement(By.id("Email"));
        emailField.sendKeys("chinnu.obsqura@gmail.com");
        WebElement passwordField= driver.findElement(By.id("Password"));
        passwordField.sendKeys("chinnu123");
        WebElement loginButton=driver.findElement(By.className("button-1 login-button"));
        loginButton.click();
        String actualUrl=driver.getCurrentUrl();
        String expectedUrl="https://demowebshop.tricentis.com/";
        Assert.assertEquals(actualUrl,expectedUrl,"Invalid URL found");
    }

}
