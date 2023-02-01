package utilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverEx {
    static AppiumDriver<MobileElement>driver=null;
    public static AppiumDriver<MobileElement> getAppiumDriver() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        //  cap.setCapability("deviceName", "emulator-5554");
        //  cap.setCapability("platformName", "Android");

        cap.setCapability("appPackage", "com.wdiodemoapp");
        cap.setCapability("appActivity", "com.wdiodemoapp.MainActivity");


        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AppiumDriver<MobileElement>(url, cap);
        Wait wait =new WebDriverWait(driver,20);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
       // driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
      //  driver.findElementByAccessibilityId("Login").click();


       return driver;
    }
    }

