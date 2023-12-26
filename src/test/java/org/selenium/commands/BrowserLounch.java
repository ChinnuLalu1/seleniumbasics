package org.selenium.commands;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.io.File;
import java.io.IOException;

public class BrowserLounch {

    WebDriver driver;
    public void initializeBrowser(String browser){
        if (browser.equals("Chrome")) {
            driver = new ChromeDriver();
        } else if(browser.equals("Edge")) {
            driver = new EdgeDriver();
        } else if (browser.equals("Firefox")) {
            driver=new FirefoxDriver();
        } else{
            throw new RuntimeException("Invalid Browser Received");
        }
        driver.manage().window().maximize();
    }
    public void closeBrowser()
    {
        driver.close();
    }
    @BeforeMethod
    public void setUp(){
        initializeBrowser("Chrome");
    }
    @AfterMethod
    public void tearDown(ITestResult result) throws IOException {
        if(result.getStatus()==ITestResult.FAILURE){
            takeScreenShot(result);
        }
        closeBrowser();
    }
    public void takeScreenShot(ITestResult result) throws IOException {
        TakesScreenshot takesreenshot=(TakesScreenshot) driver;
        File screenShort=takesreenshot.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(screenShort,new File("./SreenShort/"+result.getName()+".png"));
    }
}
