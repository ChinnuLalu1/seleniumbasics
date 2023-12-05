package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

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
    public void verifyDemoToursRegistration() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement firstName = driver.findElement(By.name("firstName"));
        firstName.sendKeys("Chinnu");
        WebElement lastName = driver.findElement(By.name("lastName"));
        lastName.sendKeys("lalu");
        WebElement phnNumber = driver.findElement(By.name("phone"));
        phnNumber.sendKeys("7510829330");
        WebElement email = driver.findElement(By.id("userName"));
        email.sendKeys("chinnu.obsqura@gmail.com");
        WebElement address = driver.findElement(By.name("address1"));
        address.sendKeys("Kuttikattil");
        WebElement city = driver.findElement(By.name("city"));
        city.sendKeys("Kottayam");
        WebElement state = driver.findElement(By.name("state"));
        state.sendKeys("Kerala");
        WebElement postelCode = driver.findElement(By.name("postalCode"));
        postelCode.sendKeys("686632");
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("chinnu.obsqura@gmail.com");
        WebElement password = driver.findElement(By.name("password"));
        password.sendKeys("chinnu123");
        WebElement confirmPass = driver.findElement(By.name("confirmPassword"));
        confirmPass.sendKeys("chinnu123");
        WebElement submitButton = driver.findElement(By.name("submit"));
        submitButton.click();
    }

    @Test
    public void verifyLinkText() {
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement yourdestination = driver.findElement(By.linkText("your destination"));
        yourdestination.click();
    }

    @Test
    public void verifyPartialLinkText() {
        driver.get("https://demo.guru99.com/test/newtours/");
        WebElement destination = driver.findElement(By.partialLinkText("destination"));
        destination.click();
    }

    @Test
    public void validateDemoWebshopUserLogin() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[2]/a"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//*[@id=\"Email\"]"));
        email.sendKeys("chinnu.obsqura@gmail.com");
        WebElement password = driver.findElement(By.xpath("//*[@id=\"Password\"]"));
        password.sendKeys("chinnu123");
        WebElement loginButton = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[5]/input"));
        loginButton.click();
        WebElement actualEmailElement = driver.findElement(By.xpath("/html/body/div[4]/div[1]/div[1]/div[2]/div[1]/ul/li[1]/a"));
        String actualEmail = actualEmailElement.getText();
        String expectedEmail = "chinnu.obsqura@gmail.com";
        Assert.assertEquals(actualEmail, expectedEmail, "Invalid Email");
    }

    @Test
    public void vrifyWebShopUsrLogin() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement login = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(2) > a"));
        login.click();
        WebElement email = driver.findElement(By.cssSelector("#Email"));
        email.sendKeys("chinnu.obsqura@gmail.com");
        WebElement password = driver.findElement(By.cssSelector("#Password"));
        password.sendKeys("chinnu123");
        WebElement loginButton = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.master-wrapper-main > div.center-2 > div > div.page-body > div.customer-blocks > div.returning-wrapper > div.form-fields > form > div.buttons > input"));
        loginButton.click();
        WebElement actualEmailElement = driver.findElement(By.cssSelector("body > div.master-wrapper-page > div.master-wrapper-content > div.header > div.header-links-wrapper > div.header-links > ul > li:nth-child(1) > a"));
        String actualEmail = actualEmailElement.getText();
        String expectedEmail = "chinnu.obsqura@gmail.com";
        Assert.assertEquals(actualEmail, expectedEmail, "Invalid Email");

    }
    @Test
    public void validateTotalNumberOfTagsInTheApplecation(){
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> inputNames=driver.findElements(By.tagName("input"));
        int inputSize=inputNames.size();
        System.out.println("Total Number of Input Tags is : "+inputSize);

    }
    @Test
    public void vrifyNavigationommands() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement register = driver.findElement(By.xpath("//a[@class='ico-register']"));
        register.click();
        driver.navigate().back();
        driver.navigate().forward();
        WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
        firstName.sendKeys("chinnu");
        WebElement lastName = driver.findElement(By.xpath("//input[@id='LastName']"));
        lastName.sendKeys("Lalu");
        WebElement emailId = driver.findElement(By.xpath("//input[@id='Email']"));
        emailId.sendKeys("cchinnu.obsqura@gmail.com");
        driver.navigate().refresh();
        driver.navigate().to("http://google.com");
    }

    @Test
    public void verifyIsSelected(){
        boolean isMaleSelected;
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement radioButtonMale=driver.findElement(By.xpath("//input[@id='gender-male']"));
        isMaleSelected =radioButtonMale.isSelected();
        Assert.assertFalse(isMaleSelected,"The radio button is selected");
        System.out.println("Male Element Before Selected "+isMaleSelected);
        radioButtonMale.click();
        isMaleSelected=radioButtonMale.isSelected();
        Assert.assertTrue(isMaleSelected,"radio button is not selected");
        System.out.println("Male Element After Selected "+isMaleSelected);

    }
    public void verifyIsEnabled(){
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscibeButton=driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));

    }
}
