package config;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Created by olga-UI on 12/28/18.
 */
public class LoginPassword {

    public LoginPassword() throws InterruptedException {

        WebDriver driver;
        System.setProperty("webdriver.chrome.driver", "D:\\Workplace\\chromedriver.exe");
        driver = new ChromeDriver();
        String baseURL = "http://localhost/litecart/admin/login.php";
        driver.get(baseURL);


        driver.findElement(By.name("username")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin");
        Thread.sleep(2000);
        driver.findElement(By.name("login")).click();

        Thread.sleep(2000);
        driver.quit();

    }
}
