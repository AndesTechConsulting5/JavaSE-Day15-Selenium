package org.andestech.learning.rfb19.g4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utils {

    public static void searchTest(WebDriver webDriver) throws InterruptedException
    {
        webDriver.get("http://google.com");
        WebElement element = webDriver.findElement(By.name("q"));
        element.sendKeys("12 milliards");
        element.submit();
        Thread.sleep(2000);
    }

}
