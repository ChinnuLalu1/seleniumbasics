package org.selenium.testngcommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class HomePageTest extends Base {
    @Test
    public void verifyHomePageTitle(){
        driver.get("https://demowebshop.tricentis.com/");
        String actualTitle= driver.getTitle();
        String expectedTitle="Demo Web Shop";
        Assert.assertEquals(actualTitle,expectedTitle,"It is not a valid title");
    }
    @Test
    public void verifyCommunityPollSelection(){
        driver.get("https://demowebshop.tricentis.com/");
        List<WebElement>communityPollElements=driver.findElements(By.xpath("//li[@class='answer']//label"));
        for(int i=0;i<communityPollElements.size();i++){
            String communityPollElementText=communityPollElements.get(i).getText();
            if(communityPollElementText.equals("Poor")){
                communityPollElements.get(i).click();
            }
        }
        WebElement pollElement= driver.findElement(By.xpath("//input[@id='pollanswers-3']"));
        boolean isPollElementSelected=pollElement.isSelected();
        Assert.assertTrue(isPollElementSelected,"Check box is not selected");
    }
}
