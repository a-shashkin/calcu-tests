package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class CalcScreenElementPresenceTests extends TestBase {

    @Test
    void calculationDisplayPresenceTest() {

        $(MobileBy.id("com.candl.athena:id/layout_display")).shouldHave(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/display")).shouldBe(Condition.visible);
        $(MobileBy.id("com.candl.athena:id/display_to_history_arrow")).shouldBe(Condition.visible);
    }
}
