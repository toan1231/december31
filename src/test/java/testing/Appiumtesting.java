package testing;

import org.openqa.selenium.By;
import utilities.AppiumDriverEx;
import utilities.ConfigurationReader;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import org.testng.annotations.Test;

import java.net.MalformedURLException;


public class Appiumtesting {
    static AppiumDriver<MobileElement> driver;


    @Test
    public static void test1() throws MalformedURLException, InterruptedException {

        AppiumDriver driver=AppiumDriverEx.getAppiumDriver();
//        driver.findElementByAccessibilityId("input-email").click();
//       // driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
//        driver.findElementByAccessibilityId("input-email")
//                .sendKeys("chauthai");
//        driver.findElementByAccessibilityId("input-password").click();
//        Thread.sleep(8000);
//        driver.findElementByAccessibilityId("input-password").sendKeys(ConfigurationReader.getProperty("ui-config.properties","password"));
//                                                          System.out.println(ConfigurationReader.getProperty("ui-config.properties","password"));
//        System.out.println(ConfigurationReader.getProperty("ui-config.properties","password"));

driver.findElement(By.xpath("\t\n" +
        "//android.widget.Button[@content-desc=\"Home\"]/android.widget.TextView[1]")).isDisplayed();
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.Button[@content-desc=\"Webview\"]/android.widget.TextView[1]")).isDisplayed();
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.Button[@content-desc=\"Forms\"]/android.widget.TextView[2]")).isDisplayed();
        driver.findElement(By.xpath("\t\n" +
                "//android.widget.Button[@content-desc=\"Swipe\"]/android.widget.TextView[1]")).isDisplayed();
        //I click on LogIn
        driver.findElementByAccessibilityId("Login").click();
        //I click on signUp
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-sign-up-container\"]/android.view.ViewGroup/android.widget.TextView")).click();
        //I click on email box to place the cursor on
        driver.findElementByAccessibilityId("input-email").click();
        //I sendkeys
        driver.findElementByAccessibilityId("input-email")
                .sendKeys(ConfigurationReader.getProperty("ui-config.properties","email"));
        //I click on password box
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]"));
        //I sendkeys for password box
        driver.findElement
                (By.xpath("//android.widget.EditText[@content-desc=\"input-password\"]")).
                sendKeys(ConfigurationReader.getProperty("ui-config.properties","password"));
        //I click on confirm password and sendkey
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]")).click();
        driver.findElement(By.xpath("//android.widget.EditText[@content-desc=\"input-repeat-password\"]"))
                .sendKeys(ConfigurationReader.getProperty("ui-config.properties","password"));
        //I click on confirm key
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc=\"button-SIGN " +
                "UP\"]/android.view.ViewGroup/android.widget.TextView")).click();



    }
}





