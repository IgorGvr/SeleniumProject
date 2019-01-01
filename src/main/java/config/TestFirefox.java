package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestFirefox {

     public void testFirefox() throws InterruptedException{

        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/Users/olga-UI/Documents/Workplase_Selenium/driver/geckodriver");
        driver = new FirefoxDriver();
        String baseUrl = "https://www.google.com/";
        driver.get(baseUrl);


        driver.findElement(By.name("q")).sendKeys("Hello");
        driver.findElement(By.name("btnK")).click();
        Thread.sleep(2000);
        driver.quit();

    }
}
