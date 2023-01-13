package tests.simulator;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import drivers.SimulatorDriver;
import helpers.Attach;
import io.appium.java_client.MobileBy;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

import static com.codeborne.selenide.Selenide.closeWebDriver;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.logevents.SelenideLogger.addListener;
import static com.codeborne.selenide.Selenide.$;

public class SimulatorTestBase {

    @BeforeAll
    public static void setup() {
        addListener("AllureSelenide", new AllureSelenide());

        Configuration.browser = SimulatorDriver.class.getName();
        Configuration.startMaximized = false;
        Configuration.browserSize = null;
        Configuration.timeout = 10000;
    }

    @BeforeEach
    public void startDriver() {
        open();
        if ($(MobileBy.id("com.candl.athena:id/view_pager")).is(Condition.visible)) {
            $(MobileBy.id("com.candl.athena:id/quick_tips_skip_text")).click();
        }
    }

    @AfterEach
    public void afterEach() {
        Attach.screenshotAs("Last screenshot");
        Attach.pageSource();
        closeWebDriver();
    }
}
