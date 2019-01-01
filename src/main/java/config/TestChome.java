package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olga-UI on 12/29/18.
 */
public class TestChome {



    public void testChrome() throws InterruptedException{

        System.setProperty("webdriver.chrome.driver","/Users/olga-UI/Documents/Workplase_Selenium/driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.quit();


    }
}
