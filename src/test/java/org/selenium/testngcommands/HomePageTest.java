package org.selenium.testngcommands;

import org.Constans.Constans;
import org.Constans.Messages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.selenium.automationcore.Base;
import org.selenium.utilities.ExcelUtility;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class HomePageTest extends Base {
    @Test
    public void verifyHomePageTitle() {
        String actualTitle = driver.getTitle();
        ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.HOME_PAGE);
        String expectedTitle = data.get(1);
        Assert.assertEquals(actualTitle, expectedTitle, Messages.TITLE_MISMATCH);
    }

    @Test
    public void verifyCommunityPollSelection() {
        List<WebElement> communityPollElements = driver.findElements(By.xpath("//li[@class='answer']//label"));
        for (int i = 0; i < communityPollElements.size(); i++) {
            String communityPollElementText = communityPollElements.get(i).getText();
            ArrayList<String> data = ExcelUtility.readData(Constans.TEST_DATA_EXCEL_PATH, Constans.HOME_PAGE);
            if (communityPollElementText.equals(data.get(2))) {
                communityPollElements.get(i).click();
            }
        }
        WebElement pollElement = driver.findElement(By.xpath("//input[@id='pollanswers-3']"));
        boolean isPollElementSelected = pollElement.isSelected();
        Assert.assertTrue(isPollElementSelected, Messages.CHECKBOX_SELECTION_FAILED);
    }

}
