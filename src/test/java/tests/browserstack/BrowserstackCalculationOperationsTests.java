package tests.browserstack;

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
import tests.simulator.SimulatorTestBase;

import static com.codeborne.selenide.Selenide.$;
import static java.lang.String.format;

@Feature("Calculation screen")
@Owner("allure8")
@Tag("browserstack")
public class BrowserstackCalculationOperationsTests extends BrowserstackTestBase {

    @CsvSource(value = {
            "1, 1"
    })
    @ParameterizedTest
    @AllureId("14273")
    @Story("Calculations")
    @DisplayName("Addition")
    void additionOfTwoNumbersTest(int number1, int number2) {

        Integer result = number1 + number2;

        char[] digitsOfNumber1 = String.valueOf(number1).toCharArray();
        for (int i = 0; i < digitsOfNumber1.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber1[i]))).click();
        }

        $(MobileBy.id("com.candl.athena:id/plus")).click();

        char[] digitsOfNumber2 = String.valueOf(number2).toCharArray();
        for (int i = 0; i < digitsOfNumber2.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber2[i]))).click();
        }

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
    void subtractionOfTwoNumbersTest(int number1, int number2) {

        Integer result = number1 - number2;

        char[] digitsOfNumber1 = String.valueOf(number1).toCharArray();
        for (int i = 0; i < digitsOfNumber1.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber1[i]))).click();
        }

        $(MobileBy.id("com.candl.athena:id/minus")).click();

        char[] digitsOfNumber2 = String.valueOf(number2).toCharArray();
        for (int i = 0; i < digitsOfNumber2.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber2[i]))).click();
        }

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
    void multiplicationOfTwoNumbersTest(int number1, int number2) {

        Integer result = number1 * number2;

        char[] digitsOfNumber1 = String.valueOf(number1).toCharArray();
        for (int i = 0; i < digitsOfNumber1.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber1[i]))).click();
        }

        $(MobileBy.id("com.candl.athena:id/mul")).click();

        char[] digitsOfNumber2 = String.valueOf(number2).toCharArray();
        for (int i = 0; i < digitsOfNumber2.length; i++) {
            $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber2[i]))).click();
        }

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
    void divisionOfTwoNumbersTest(float number1, float number2) {

        Float result = number1 / number2;

        char[] digitsOfNumber1 = String.valueOf(number1).toCharArray();
        for (int i = 0; i < digitsOfNumber1.length; i++) {
            if (digitsOfNumber1[i] == '.') {
                $(MobileBy.id("com.candl.athena:id/dot")).click();
            } else {
                $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber1[i]))).click();
            }
        }

        $(MobileBy.id("com.candl.athena:id/div")).click();

        char[] digitsOfNumber2 = String.valueOf(number2).toCharArray();
        for (int i = 0; i < digitsOfNumber2.length; i++) {
            if (digitsOfNumber1[i] == '.') {
                $(MobileBy.id("com.candl.athena:id/dot")).click();
            } else {
                $(MobileBy.id(format("com.candl.athena:id/digit%s", digitsOfNumber2[i]))).click();
            }
        }

        $(MobileBy.id("com.candl.athena:id/equal")).click();

        $(MobileBy.id("com.candl.athena:id/layout_input_holder"))
                .$(MobileBy.className("android.widget.EditText"))
                .shouldHave(Condition.text(result.toString()));
    }
}
