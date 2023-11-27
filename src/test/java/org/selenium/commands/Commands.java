package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Commands extends Base {
    @Test
    public void verifySwagLabsUserName() {
        driver.get("https://www.saucedemo.com/");
        WebElement userNameField = driver.findElement(By.id("user-name"));
        userNameField.sendKeys("standard_user");
        WebElement passwordField = driver.findElement(By.id("password"));
        passwordField.sendKeys("secret_sauce");
        WebElement loginButton = driver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement swagLogo = driver.findElement(By.className("app_logo"));
        String actualSwagLogoTxt = swagLogo.getText();
        String expectedSwagLogoText = "Swag Labs";
        Assert.assertEquals(actualSwagLogoTxt, expectedSwagLogoText, "Invalid logo text fount in login page");

    }

    @Test
    public void verifyDemoWebShopUserLogin() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement loginField = driver.findElement(By.className("ico-login"));
        loginField.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("chinnu.obsqura@gmail.com");
        WebElement passwordField = driver.findElement(By.id("Password"));
        passwordField.sendKeys("chinnu123");
        WebElement loginButton = driver.findElement(By.className("login-button"));
        loginButton.click();
        WebElement actualUserEmailElement = driver.findElement(By.className("account"));
        String actualUserEmailId = actualUserEmailElement.getText();
        String expectedUserEmailId = "chinnu.obsqura@gmail.com";
        Assert.assertEquals(actualUserEmailId, expectedUserEmailId, "Invalid User ");
    }
    @Test
    public void verifyDemoToursRegistration(){
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName= driver.findElement(By.name("firstName"));
        firstName.sendKeys("Chinnu");
        WebElement lastName= driver.findElement(By.name("lastName"));
        lastName.sendKeys("lalu");
        WebElement phnNumber=driver.findElement(By.name("phone"));
        phnNumber.sendKeys("7510829330");
        WebElement email=driver.findElement(By.id("userName"));
        email.sendKeys("chinnu.obsqura@gmail.com");
        WebElement address=driver.findElement(By.name("address1"));
        address.sendKeys("Kuttikattil");
        WebElement city=driver.findElement(By.name("city"));
        city.sendKeys("Kottayam");
        WebElement state=driver.findElement(By.name("state"));
        state.sendKeys("Kerala");
        WebElement postelCode=driver.findElement(By.name("postalCode"));
        postelCode.sendKeys("686632");
        WebElement userName=driver.findElement(By.id("email"));
        userName.sendKeys("chinnu.obsqura@gmail.com");
        WebElement password=driver.findElement(By.name("password"));
        password.sendKeys("chinnu123");
        WebElement confirmPass=driver.findElement(By.name("confirmPassword"));
        confirmPass.sendKeys("chinnu123");
        WebElement submitButton=driver.findElement(By.name("submit"));
        submitButton.click();
    }



}
