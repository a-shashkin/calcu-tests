package tests.simulator;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

@Feature("Side menu")
@Owner("allure8")
@Tag("simulator")
public class SimulatorSideMenuElementPresenceTests extends SimulatorTestBase {

    @Test
    @AllureId("14268")
    @Story("Presence of elements")
    @DisplayName("Presence of menu elements")
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
