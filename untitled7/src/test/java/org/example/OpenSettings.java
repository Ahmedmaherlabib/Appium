package org.example;
import io.appium.java_client.android.AndroidDriver;

import org.junit.Test;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
public class OpenSettings {
    @Test
    public void openSetting() throws MalformedURLException {
        //0.0.0.0:4723
        DesiredCapabilities desiredCapabilities=new DesiredCapabilities();
        desiredCapabilities.setCapability("platformName","Android");
        desiredCapabilities.setCapability("platformVersion","11");
        desiredCapabilities.setCapability("deviceName","Pixel2");
        desiredCapabilities.setCapability("app","Settings");
        AndroidDriver driver=new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"),desiredCapabilities);
    }
}
