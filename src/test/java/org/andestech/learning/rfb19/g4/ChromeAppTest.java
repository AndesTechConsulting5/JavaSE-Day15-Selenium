package org.andestech.learning.rfb19.g4;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import static org.testng.Assert.assertTrue;

/**
 * Unit test for simple App.
 */
public class ChromeAppTest
{

    private WebDriver webDriver;
    private ChromeOptions chromeOptions;


    @BeforeClass
    public void init()
    {
        System.setProperty("webdriver.chrome.driver",
                "E:\\selenium_drivers\\chromedriver.exe");


        chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-fullscreen");

        webDriver = new ChromeDriver(chromeOptions);
        System.out.println("+++ Driver: " + webDriver);
    }


    @Test
    public void site01Test() throws InterruptedException
    {
        webDriver.get("http://google.com");
        assertTrue( true );
       // Thread.sleep(3000);

    }


    @AfterClass
    public void tearDown(){
        if(webDriver != null)
        {   webDriver.quit();
            //webDriver.close();
            System.out.println("--- Driver");
        }

    }

}
