package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olga-UI on 12/28/18.
 */
public class LoginPassword {

    public LoginPassword(){

        try {
            WebDriver driver;
            System.setProperty("webdriver.chrome.driver", "/Users/olga-UI/Documents/Workplase_Selenium/driver/chromedriver");
            driver = new ChromeDriver();
            String baseURL = "https://www.netflix.com/";
            driver.get(baseURL);

            driver.findElement(By.xpath("//a[@class='authLinks signupBasicHeader']")).click();
            Thread.sleep(2000);


            driver.findElement(By.id("id_userLoginId")).sendKeys("admin@gmail.com");
            Thread.sleep(2000);

            driver.findElement(By.name("password")).sendKeys("12qwxax");
            Thread.sleep(2000);

            driver.findElement(By.xpath("//button[contains(text(),'Sign In')]")).click();

            Thread.sleep(2000);
            driver.quit();
        }catch(InterruptedException e){

        }

    }
}
