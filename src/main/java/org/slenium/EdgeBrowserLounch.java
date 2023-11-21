package org.slenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class EdgeBrowserLounch {
    public static void main(String[] args) {
        WebDriver driver= new EdgeDriver();
        driver.get("https://demo.guru99.com//test//newtours//");
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
