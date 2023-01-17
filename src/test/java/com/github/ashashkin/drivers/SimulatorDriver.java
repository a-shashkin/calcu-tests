package com.github.ashashkin.drivers;

import com.codeborne.selenide.WebDriverProvider;
import com.github.ashashkin.config.SimulatorConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SimulatorDriver implements WebDriverProvider {

    static SimulatorConfig config = ConfigFactory.create(SimulatorConfig.class);

    public static URL getAppiumServerURL() {
        String url = System.getProperty("simulatorURL", config.simulatorURL());
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        String device = System.getProperty("simulatorDevice", config.simulatorDevice());
        String osVersion = System.getProperty("simulatorOSVersion", config.simulatorOSVersion());
        String platformName = System.getProperty("simulatorPlatformName", config.simulatorPlatformName());
        String locale = System.getProperty("simulatorLocale", config.simulatorLocale());
        String language = System.getProperty("simulatorLanguage", config.simulatorLanguage());
        String appPackage = System.getProperty("simulatorAppPackage", config.simulatorAppPackage());
        String appActivity = System.getProperty("simulatorAppActivity", config.simulatorAppActivity());
        String app = System.getProperty("simulatorAppPath", config.simulatorAppPath());

        desiredCapabilities.setCapability("platformName", platformName);
        desiredCapabilities.setCapability("deviceName", device);
        desiredCapabilities.setCapability("version", osVersion);
        desiredCapabilities.setCapability("locale", locale);
        desiredCapabilities.setCapability("language", language);
        desiredCapabilities.setCapability("appPackage", appPackage);
        desiredCapabilities.setCapability("appActivity", appActivity);
        desiredCapabilities.setCapability("app",
                getAbsolutePath(app));

        return new AndroidDriver(getAppiumServerURL(), desiredCapabilities);
    }

    private String getAbsolutePath(String filePath) {

        File file = new File(filePath);
        assertTrue(file.exists(), filePath + " not found");

        return file.getAbsolutePath();
    }
}
