package tests.simulator;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

@Feature("Calculation screen")
@Owner("allure8")
public class SimulatorCalcScreenElementPresenceTests extends SimulatorTestBase {

    @Test
    @AllureId("14265")
    @Story("Presence of elements")
    @DisplayName("Presence of calculation display elements")
    void calculationDisplayPresenceTest() {

        $(MobileBy.id("com.candl.athena:id/layout_display")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/display")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/display_to_history_arrow")).shouldBe(Condition.visible);
    }

    @Test
    @AllureId("14266")
    @Story("Presence of elements")
    @DisplayName("Presence of buttons panel")
    void panelButtonsPresenceTest() {

        $(MobileBy.id("com.candl.athena:id/themes")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/del")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/clear")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/div")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/percent")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/leftParen")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/rightParen")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/mul")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit7")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit8")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit9")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/minus")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit4")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit5")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit6")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/plus")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit1")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit2")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit3")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/equal")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/toggle_sign")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/digit0")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/dot")).shouldBe(Condition.visible);
    }

    // If testing ads-free version, should disable this test.
    @Test
    @AllureId("14267")
    @Story("Presence of elements")
    @DisplayName("Presence of ads block in free version")
    void adsPresenceTest() {

        $(MobileBy.id("com.candl.athena:id/ads_bottom")).shouldBe(Condition.visible);
    }
}
