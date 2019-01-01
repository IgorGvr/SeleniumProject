package config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestChome {


    public void testChrome() throws InterruptedException{


        System.setProperty("webdriver.chrome.driver", "D:\\Workplace\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        Thread.sleep(2000);
        driver.quit();




    }
}
