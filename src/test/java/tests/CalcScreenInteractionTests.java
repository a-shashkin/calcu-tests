package tests;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;

public class CalcScreenInteractionTests extends TestBase {

    @Test
    void numberInteractionTest() {

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("1"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit2")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("2"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit3")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("3"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit4")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("4"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit5")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("5"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit6")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("6"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit7")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("7"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit8")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("8"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit9")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("9"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/digit0")).click();
        $(MobileBy.id("com.candl.athena:id/display"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("10"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();
    }

    @Test
    void mathOperationsInteractionTest() {

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/plus")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text("1 +"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/minus")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text("1 -"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/mul")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text("1 ×"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/div")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text("1 ÷"));
        $(MobileBy.id("com.candl.athena:id/clear")).click();
    }

    @Test
    void parenthesesInteractionTest() {

        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/plus")).click();
        $(MobileBy.id("com.candl.athena:id/leftParen")).click();
        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/plus")).click();
        $(MobileBy.id("com.candl.athena:id/digit1")).click();
        $(MobileBy.id("com.candl.athena:id/rightParen")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text("1 + (1 + 1)"));
    }

    @Test
    void themesInteractionTest() {

        $(MobileBy.id("com.candl.athena:id/themes")).click();
        $(MobileBy.id("com.candl.athena:id/toolbar_themes"))
                .$(MobileBy.className("android.widget.TextView"))
                .shouldHave(Condition.text("Themes"));
    }
}
