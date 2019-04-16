package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.remote.DesiredCapabilities;


import java.io.File;
import java.net.URL;

public class Caps {

    @Test
    public static AndroidDriver<AndroidElement> Capabilities() throws Exception {
        File file = new File("scr");
        File fs = new File(file,"1555164991318-debug.apk");
        DesiredCapabilities cap = new DesiredCapabilities();
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Android Device");
        cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        cap.setCapability(MobileCapabilityType.APP, fs.getAbsolutePath());
        cap.setCapability("appPackage", "com.VoDrive");
        cap.setCapability("appActivity", "com.VoDrive.common.SplashScreenActivity");
        cap.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "120");
        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        AndroidDriver<AndroidElement> driver = new AndroidDriver<AndroidElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap);
        return driver;
    }
}
