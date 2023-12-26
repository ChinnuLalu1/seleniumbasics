package org.selenium.commands;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.*;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;

public class Commands extends BrowserLounch {
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
    public void validateTotalNumberOfTagsInTheApplecation() {
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> inputNames = driver.findElements(By.tagName("input"));
        int inputSize = inputNames.size();
        System.out.println("Total Number of Input Tags is : " + inputSize);

    }

    @Test
    public void verifyNavigationommands() {
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
    public void verifyIsSelected() {
        boolean isMaleSelected;
        driver.get("https://demowebshop.tricentis.com/register");
        WebElement radioButtonMale = driver.findElement(By.xpath("//input[@id='gender-male']"));
        isMaleSelected = radioButtonMale.isSelected();
        Assert.assertFalse(isMaleSelected, "The radio button is selected");
        System.out.println("Male Element Before Selected " + isMaleSelected);
        radioButtonMale.click();
        isMaleSelected = radioButtonMale.isSelected();
        Assert.assertTrue(isMaleSelected, "radio button is not selected");
        System.out.println("Male Element After Selected " + isMaleSelected);

    }

    @Test
    public void verifyIsEnabled() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscibeButton = driver.findElement(By.xpath("//input[@id='newsletter-subscribe-button']"));
        boolean isSubscribeButtonIsEnabled = subscibeButton.isEnabled();
        Assert.assertTrue(isSubscribeButtonIsEnabled, "Subscribe button is not enabled");
    }

    @Test
    public void verifyIsDisplayed() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement voteButton = driver.findElement(By.xpath("//input[@id='vote-poll-1']"));
        boolean isVoteButtonDisplayed = voteButton.isDisplayed();
        Assert.assertTrue(isVoteButtonDisplayed, "Vote button is not displayed");
    }

    @Test
    public void verifyCommunityPoll() {
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement> communityPollElements = driver.findElements(By.xpath("//label[starts-with(@for,'pol')]//parent::li"));
        for (int i = 0; i < communityPollElements.size(); i++) {
            //System.out.println(communityPollElements.get(i).getText());
            String pollElementText = communityPollElements.get(i).getText();
            if (pollElementText.equals("Poor")) {
                communityPollElements.get(i).click();
            }
        }
    }

    @Test
    public void verifyValuesFromeDropDown() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDropDown);
        //select.selectByVisibleText("INDIA");
        //select.selectByIndex(23);
        select.selectByValue("AMERICAN SAMOA");
        WebElement getCountryName = select.getFirstSelectedOption();
        System.out.println(getCountryName.getText());

    }

    @Test
    public void verifyTotalNumbrOfDropDownValues() {
        driver.get("https://demo.guru99.com/test/newtours/register.php");
        WebElement countryDropDown = driver.findElement(By.xpath("//select[@name='country']"));
        Select select = new Select(countryDropDown);
        List<WebElement> dropdownElementsList = select.getOptions();
        System.out.println(dropdownElementsList.size());

    }

    @Test
    public void verifyMultiSelectDropDown() {
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        WebElement multiSelect = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
        Select select = new Select(multiSelect);
        boolean selectedValue = select.isMultiple();
        System.out.println(selectedValue);
        select.selectByVisibleText("Browser Commands");
        select.selectByVisibleText("Switch Commands");
        List<WebElement> selectedValues = select.getAllSelectedOptions();
        for (WebElement e : selectedValues) {
            System.out.println(e.getText());
        }
        select.deselectByVisibleText("Switch Commands");
    }

    @Test
    public void verifyFileUpload() {
        driver.get("https://demo.guru99.com/test/upload/");
        WebElement chooseFileField = driver.findElement(By.xpath("//input[@id='uploadfile_0']"));
        chooseFileField.sendKeys("C:\\Users\\Chinnu Lalu\\IdeaProjects\\seleniumbasics\\src\\main\\resources\\Selenium Notes.docx");
        WebElement acceptField = driver.findElement(By.xpath("//input[@id='terms']"));
        acceptField.click();
        WebElement submitField = driver.findElement(By.xpath("//button[@id='submitbutton']"));
        submitField.click();
    }

    @Test
    public void verifySimpleAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("alertButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        String clickText = alert.getText();
        System.out.println(clickText);
        alert.accept();
    }

    @Test
    public void validateConfirmationAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("confirmButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        String clickText = alert.getText();
        System.out.println(clickText);
        alert.dismiss();
        WebElement clickCancelElement = driver.findElement(By.id("confirmResult"));
        String actualMsg = clickCancelElement.getText();
        String expectedMsg = "You selected Cancel";
        Assert.assertEquals(actualMsg, expectedMsg, "You selected not canceled");

    }

    @Test
    public void ValidatePromptAlert() {
        driver.get("https://demoqa.com/alerts");
        WebElement clickButton = driver.findElement(By.id("promtButton"));
        clickButton.click();
        Alert alert = driver.switchTo().alert();
        String textMsg = alert.getText();
        System.out.println(textMsg);
        alert.sendKeys("chinnu");
        alert.accept();
        WebElement promptAlertMsgElement = driver.findElement(By.id("promptResult"));
        String actualResultMsg = promptAlertMsgElement.getText();
        String expectedResultMsg = "You entered chinnu";
        Assert.assertEquals(actualResultMsg, expectedResultMsg, "You ented message is not valid");
    }

    @Test
    public void verifyCustomerDelete() {
        driver.get("https://demo.guru99.com/test/delete_customer.php");
        WebElement customerId = driver.findElement(By.xpath("//input[@name='cusid']"));
        customerId.sendKeys("123");
        WebElement submitButton = driver.findElement(By.xpath("//input[@name='submit']"));
        submitButton.click();
        Alert alert = driver.switchTo().alert();
        String actualTextMsg = alert.getText();
        String expectedTextMsg = "Do you really want to delete this Customer?";
        Assert.assertEquals(actualTextMsg, expectedTextMsg, "You are not a customer");
        alert.accept();
        String actualTextAfterAccept = alert.getText();
        String expectedAfterAccept = "Customer Successfully Delete!";
        Assert.assertEquals(actualTextAfterAccept, expectedAfterAccept, "Customer not deleted");
        alert.accept();

    }

    @Test
    public void verifyMultipleWindowHandling() {
        driver.get("https://demo.guru99.com/popup.php");
        String parentWindowHandledId = driver.getWindowHandle();
        System.out.println(parentWindowHandledId);
        WebElement clickButton = driver.findElement(By.xpath("//a[@target='_blank']"));
        clickButton.click();
        Set<String> windowHandlesId = driver.getWindowHandles();
        System.out.println(windowHandlesId);
        Iterator<String> value = windowHandlesId.iterator();
        while (value.hasNext()) {
            String handleId = value.next();
            if (!handleId.equals(parentWindowHandledId)) {
                driver.switchTo().window(handleId);
                WebElement email = driver.findElement(By.xpath("//input[@name='emailid']"));
                email.sendKeys("chinnu.obsqura@gmail.com");
                WebElement submit = driver.findElement(By.xpath("//input[@name='btnLogin']"));
                submit.click();
                driver.close();
            }
        }
        driver.switchTo().window(parentWindowHandledId);
    }

    @Test
    public void verifyFrams() {
        driver.get("https://demoqa.com/frames");
        List<WebElement> iframeTags = driver.findElements(By.tagName("iframe"));
        int size = iframeTags.size();
        System.out.println("Total no of iframes in the webpage is " + size);
        //driver.switchTo().frame(3);
        //driver.switchTo().frame("frame1");
        WebElement frame = driver.findElement(By.id("frame1"));
        driver.switchTo().frame(frame);
        WebElement frameText = driver.findElement(By.id("sampleHeading"));
        System.out.println("iframe text = " + frameText.getText());
        driver.switchTo().defaultContent();
    }

    @Test
    public void verifyRightClick() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement rightClickButton = driver.findElement(By.xpath("//span[@class='context-menu-one btn btn-neutral']"));
        Actions action = new Actions(driver);
        action.contextClick(rightClickButton).build().perform();
    }

    @Test
    public void verifyDoubleClick() {
        driver.get("https://demo.guru99.com/test/simple_context_menu.html");
        WebElement doubleClickButton = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
        Actions action = new Actions(driver);
        action.doubleClick(doubleClickButton).build().perform();
        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();
        System.out.println(alertText);
        alert.accept();

    }

    @Test
    public void verifyDragAndDrop() {
        driver.get("https://demoqa.com/droppable");
        WebElement dragElement = driver.findElement(By.xpath("//div[@id='draggable']"));
        WebElement dropElement = driver.findElement(By.xpath("//div[@id='droppable']"));
        Actions action = new Actions(driver);
        action.dragAndDrop(dragElement, dropElement).build().perform();
    }

    @Test
    public void dragAndDropsOffset() {
        driver.get("https://demoqa.com/dragabble");
        WebElement dragBox = driver.findElement(By.id("dragBox"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(dragBox, 150, 150).build().perform();
    }

    @Test
    public void verifyMouseOver() {
        driver.get("https://demoqa.com/menu/");
        WebElement selectMainItemButton = driver.findElement(By.xpath("//a[text()='Main Item 2']"));
        Actions actions = new Actions(driver);
        actions.moveToElement(selectMainItemButton).build().perform();
        WebElement subLinButton = driver.findElement(By.xpath("//a[text()='SUB SUB LIST »']"));
        actions.doubleClick(subLinButton).build().perform();
    }

    @Test
    public void verifyJavaScriptClicksAndSendkeys() {
        driver.get("https://demowebshop.tricentis.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("document.getElementById('newsletter-email').value='test@test.com'");
        js.executeScript("document.getElementById('newsletter-subscribe-button').click()");
    }

    @Test
    public void verifyVerticalScroll() {
        driver.get("https://demowebshop.tricentis.com/");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollTo(0,document.body.scrollHeight) ");
    }

    @Test
    public void verifyTakeScreenShort() {
        driver.get("https://demowebshop.tricentis.com/");
        String actualTiltle = driver.getTitle();
        System.out.println(actualTiltle);
        String expectedTitle = "Demo Web Shop";
        Assert.assertEquals(actualTiltle, expectedTitle, "Invalid Title");

    }

    @Test
    public void verifyWait() throws InterruptedException {
        driver.get("https://demoqa.com/alerts");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
        WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        //Thread.sleep(6000);
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();

    }

    @Test
    public void verifyFluentWait() {
        driver.get("https://demoqa.com/alerts");
        FluentWait wait = new FluentWait(driver);
        wait.withTimeout(Duration.ofSeconds(20));
        wait.pollingEvery(Duration.ofSeconds(2));
        wait.ignoring(NoSuchElementException.class);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("timerAlertButton")));
        WebElement clickButton = driver.findElement(By.id("timerAlertButton"));
        clickButton.click();
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void verifyDiffBetweenFindElementAndFindElements() {
        driver.get("https://demowebshop.tricentis.com/");
        WebElement subscribeButton = driver.findElement(By.id("newsletter-subscribe-button"));
        System.out.println("WebElement on match " + subscribeButton);
        List<WebElement> communityPoll = driver.findElements(By.xpath("//[@class='answer']//label"));
        int size = communityPoll.size();
        System.out.println("Size of list on match " + size);
        //onZero match
        List<WebElement> communityPollOnZeroMatch = driver.findElements(By.xpath("//li[@class='answer123']//label"));
        int sizeOnZeroMatch = communityPollOnZeroMatch.size();
        System.out.println("Size of list on zero match " + sizeOnZeroMatch);
        //WebElement subscribeButtonOnZeroMatch = driver.findElement(By.id("newsletter-subscribe-button123"));
        //on OnePlus match
        WebElement communityPollOnOnePlusMatch = driver.findElement(By.xpath("//[@class='answer']//label"));
        communityPollOnOnePlusMatch.click();
    }
    @Test
    public void verifyDiffBetweenCloseAndQuit(){
        driver.get("https://demo.guru99.com/popup.php");
        WebElement clickHereButton= driver.findElement(By.linkText("Click Here"));
        clickHereButton.click();
    }
}



