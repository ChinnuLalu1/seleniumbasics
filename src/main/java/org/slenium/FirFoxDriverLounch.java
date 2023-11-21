package org.slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FirFoxDriverLounch {
    public static void main(String[] args) {
        WebDriver driver=new FirefoxDriver();
        driver.get("https://www.saucedemo.com//");
        driver.manage().window().maximize();
        String pageTitle=driver.getTitle();
        System.out.println(pageTitle);
        String currentUrl=driver.getCurrentUrl();
        System.out.println(currentUrl);
        String  handled=driver.getWindowHandle();
        System.out.println(handled);
        String pageSource=driver.getPageSource();
        System.out.println(pageSource);
        driver.close();
    }
}
