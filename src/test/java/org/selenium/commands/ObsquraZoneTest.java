package org.selenium.commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ObsquraZoneTest extends Base{
@Test
    public void verifySingleInputField(){
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement msgField=driver.findElement(By.xpath("//input[@id='single-input-field']"));
        msgField.sendKeys("Hii Obsqura");
        WebElement showMsg=driver.findElement(By.xpath("//button[@id='button-one']"));
        showMsg.click();
        WebElement actualMsgElement=driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualMsg=actualMsgElement.getText();
        String expectedMsg="Your Message : Hii Obsqura";
        Assert.assertEquals(actualMsg,expectedMsg,"Invalid Message");
    }
    @Test
    public void verifyTwoInputFields(){
        driver.get("https://selenium.obsqurazone.com/simple-form-demo.php");
        WebElement value1=driver.findElement(By.xpath("//input[@id='value-a']"));
        value1.sendKeys("2");
        WebElement value2=driver.findElement(By.xpath("//input[@id='value-b']"));
        value2.sendKeys("4");
        WebElement totalButton=driver.findElement(By.xpath("//button[@id='button-two']"));
        totalButton.click();
        WebElement actualTotalElement=driver.findElement(By.xpath("//div[@id='message-two']"));
        String actualTotalMsg=actualTotalElement.getText();
        String expectedTotalMsg="Total A + B : 6";
        Assert.assertEquals(actualTotalMsg,expectedTotalMsg,"Invalid Total");
    }
    @Test
    public void verifyCheckBoxDemo(){
        driver.get("https://selenium.obsqurazone.com/check-box-demo.php");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='gridCheck']"));
        checkBox.click();
        boolean isCheckBoxSelected =checkBox.isSelected();
        //System.out.println(isCheckBoxSelected);
        Assert.assertTrue(isCheckBoxSelected,"The CheckBox is not Selected");
    }
    @Test
    public void verifyRadioButtonDemo(){
    boolean isButtonSelected;
        driver.get("https://selenium.obsqurazone.com/radio-button-demo.php");
        WebElement radioButtonFemale=driver.findElement(By.xpath("//input[@id='inlineRadio2']"));
        isButtonSelected=radioButtonFemale.isSelected();
        Assert.assertFalse(isButtonSelected,"Radio Button Already Selected");
        radioButtonFemale.click();
        WebElement showSelectedValue=driver.findElement(By.xpath("//button[@id='button-one']"));
        showSelectedValue.click();
        isButtonSelected=radioButtonFemale.isSelected();
        Assert.assertTrue(isButtonSelected,"Radio button is not selected ");
        System.out.println("After selected the show selected value is "+isButtonSelected);

    }
    @Test
    public void verifyForm_withValidations(){
    boolean isEnabledResultText;
        driver.get("https://selenium.obsqurazone.com/form-submit.php");
        WebElement firstName=driver.findElement(By.xpath("//input[@id='validationCustom01']"));
        firstName.sendKeys("Chinnu");
        WebElement lastName=driver.findElement(By.xpath("//input[@id='validationCustom02']"));
        lastName.sendKeys("Lalu");
        WebElement uName=driver.findElement(By.xpath("//input[@id='validationCustomUsername']"));
        uName.sendKeys("chinnuObsqura");
        WebElement city=driver.findElement(By.xpath("//input[@id='validationCustom03']"));
        city.sendKeys("Kottayam");
        WebElement state=driver.findElement(By.xpath("//input[@id='validationCustom04']"));
        state.sendKeys("Kerala");
        WebElement zip=driver.findElement(By.xpath("//input[@id='validationCustom05']"));
        zip.sendKeys("1234");
        WebElement checkBox=driver.findElement(By.xpath("//input[@id='invalidCheck']"));
        checkBox.click();
        WebElement submitButton=driver.findElement(By.xpath("//button[@class='btn btn-primary']"));
        submitButton.click();
        WebElement actualResultText=driver.findElement(By.xpath("//div[@id='message-one']"));
        String actualResult=actualResultText.getText();
        String expectedResultText="Form has been submitted successfully!";
        Assert.assertEquals(actualResult,expectedResultText,"Form submission unsuccessful");

    }
}
