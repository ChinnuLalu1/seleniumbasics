package org.selenium.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPageTest extends Base {
    @Test
    public void verifyRegisterPageTitle(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement registerButton= driver.findElement(By.xpath("//a[@class='ico-register']"));
        registerButton.click();
        String actualTitle= driver.getTitle();
        String expectedTitle="Demo Web Shop. Register";
        Assert.assertEquals(actualTitle,expectedTitle,"It is not a valid title");
    }
    @Test
    public void verifyUserRegister(){
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement genderButton= driver.findElement(By.xpath("//input[@id='gender-male']"));
        genderButton.click();
        WebElement firstName= driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("Jino");
        WebElement lastName= driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Lalu");
        WebElement email= driver.findElement(By.xpath("//input[@id='Email']"));
        email.sendKeys("jinolalu@gmail.com");
        WebElement password= driver.findElement(By.xpath("//input[@id='Password']"));
        password.sendKeys("jinolalu");
        WebElement confirmPassword= driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
        confirmPassword.sendKeys("jinolalu");
        WebElement registerButtton= driver.findElement(By.xpath("//input[@id='register-button']"));
        registerButtton.click();
        WebElement actualMsgElement= driver.findElement(By.xpath("//div[@class='result']"));
        String actualMsg= actualMsgElement.getText();
        String expectedMsg="Your registration completed";
        Assert.assertEquals(actualMsg,expectedMsg,"Invalid Message");

    }
}
