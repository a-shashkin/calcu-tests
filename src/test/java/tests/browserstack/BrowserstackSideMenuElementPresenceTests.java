package tests.browserstack;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;
import tests.simulator.SimulatorTestBase;

import static com.codeborne.selenide.Selenide.$;

public class BrowserstackSideMenuElementPresenceTests extends BrowserstackTestBase {

    @Test
    void sideMenuElementPresenceTest() {

        $(MobileBy.id("com.candl.athena:id/hamburger_image")).click();
        $(MobileBy.id("com.candl.athena:id/logo")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/premium_btn")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/settings_btn_layout")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/themes_btn_layout")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/upgrade_btn")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/send_feedback_btn")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/open_about_btn")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/ad_label")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/cross_promotion_pc")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/cross_promotion_egg")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/cross_promotion_steak")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/cross_promotion_chess")).shouldBe(Condition.visible);
    }
}
