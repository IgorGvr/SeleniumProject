package config;


import org.openqa.selenium.HasCapabilities;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;

public class TestCapabilities {

    public void startTest() {

       WebDriver driver;
       //System.setProperty("webdriver.chrome.driver","/Users/olga-UI/Documents/Workplase_Selenium/driver/chromedriver");

     /*   // старая схема
        FirefoxOptions options = new FirefoxOptions().setLegacy(true);
        DesiredCapabilities caps = new DesiredCapabilities();
        caps.setCapability(FirefoxDriver.MARIONETTE, false);
        WebDriver driver = new FirefoxDriver(caps);
     */

     /*   WebDriver driver = new FirefoxDriver();//1
        FirefoxOptions options = new FirefoxOptions().setLegacy(false);//2
        WebDriver driver = new FirefoxDriver(options);
        DesiredCapabilities caps = new DesiredCapabilities();  //3
        caps.setCapability(FirefoxDriver.MARIONETTE, true);
        WebDriver driver = new FirefoxDriver(caps);

      */


    }

}
