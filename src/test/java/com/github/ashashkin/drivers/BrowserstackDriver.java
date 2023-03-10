package com.github.ashashkin.drivers;

import com.codeborne.selenide.WebDriverProvider;
import com.github.ashashkin.config.BrowserstackConfig;
import io.appium.java_client.android.AndroidDriver;
import org.aeonbits.owner.ConfigFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class BrowserstackDriver implements WebDriverProvider {

    static BrowserstackConfig config = ConfigFactory.create(BrowserstackConfig.class);

    public static URL getBrowserstackURL() {
        String url = System.getProperty("browserstackURL", config.browserstackURL());
        try {
            return new URL(url);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public WebDriver createDriver(DesiredCapabilities desiredCapabilities) {

        String username = System.getProperty("browserstackUsername", config.browserstackUsername());
        String key = System.getProperty("browserstackPassword", config.browserstackPassword());
        String app = System.getProperty("browserstackApp", config.browserstackApp());
        String device = System.getProperty("browserstackDevice", config.browserstackDevice());
        String osVersion = System.getProperty("browserstackOSVersion", config.browserstackOSVersion());
        String project = System.getProperty("browserstackProject", config.browserstackProject());
        String build = System.getProperty("browserstackBuild", config.browserstackBuild());
        String name = System.getProperty("browserstackName", config.browserstackName());

        // Set your access credentials
        desiredCapabilities.setCapability("browserstack.user", username);
        desiredCapabilities.setCapability("browserstack.key", key);

        // Set URL of the application under test
        desiredCapabilities.setCapability("app", app);

        // Specify device and os_version for testing
        desiredCapabilities.setCapability("device", device);
        desiredCapabilities.setCapability("os_version", osVersion);

        // Set other BrowserStack capabilities
        desiredCapabilities.setCapability("project", project);
        desiredCapabilities.setCapability("build", build);
        desiredCapabilities.setCapability("name", name);

        return new AndroidDriver(getBrowserstackURL(), desiredCapabilities);
    }
}
