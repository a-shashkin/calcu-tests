package tests.simulator;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import io.qameta.allure.AllureId;
import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import io.qameta.allure.Story;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static com.codeborne.selenide.Selenide.$;

@Feature("Calculation screen")
@Owner("allure8")
@Tag("simulator")
public class SimulatorCalculationOperationsTests extends SimulatorTestBase {

    @CsvSource(value = {
            "1, 1"
    })
    @ParameterizedTest
    @AllureId("14273")
    @Story("Calculations")
    @DisplayName("Addition")
    void additionOfTwoNumbersTest(Integer number1, Integer number2) {

        Integer result = number1 + number2;

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number1.toString());
        $(MobileBy.id("com.candl.athena:id/plus")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number2.toString());
        $(MobileBy.id("com.candl.athena:id/equal")).click();

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text(result.toString()));
    }

    @CsvSource(value = {
            "2, 1"
    })
    @ParameterizedTest
    @AllureId("14274")
    @Story("Calculations")
    @DisplayName("Subtraction")
    void subtractionOfTwoNumbersTest(Integer number1, Integer number2) {

        Integer result = number1 - number2;

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number1.toString());
        $(MobileBy.id("com.candl.athena:id/minus")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number2.toString());
        $(MobileBy.id("com.candl.athena:id/equal")).click();

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text(result.toString()));
    }

    @CsvSource(value = {
            "2, 2"
    })
    @ParameterizedTest
    @AllureId("14275")
    @Story("Calculations")
    @DisplayName("Multiplication")
    void multiplicationOfTwoNumbersTest(Integer number1, Integer number2) {

        Integer result = number1 * number2;

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number1.toString());
        $(MobileBy.id("com.candl.athena:id/mul")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number2.toString());
        $(MobileBy.id("com.candl.athena:id/equal")).click();

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text(result.toString()));
    }

    @CsvSource(value = {
            "4, 2"
    })
    @ParameterizedTest
    @AllureId("14276")
    @Story("Calculations")
    @DisplayName("Division")
    void divisionOfTwoNumbersTest(Float number1, Float number2) {

        Float result = number1 / number2;

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number1.toString());
        $(MobileBy.id("com.candl.athena:id/div")).click();
        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .setValue(number2.toString());
        $(MobileBy.id("com.candl.athena:id/equal")).click();

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text(result.toString()));
    }
}
