package org.slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserLaunch {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.seleniumeasy.com//");
        driver.manage().window().maximize();
        String pagetitle=driver.getTitle();
        System.out.println(pagetitle);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String  handled=driver.getWindowHandle();
        System.out.println(handled);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
