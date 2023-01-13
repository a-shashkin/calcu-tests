package tests.browserstack;

import com.codeborne.selenide.Condition;
import io.appium.java_client.MobileBy;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import tests.simulator.SimulatorTestBase;

import static com.codeborne.selenide.Selenide.$;

public class BrowserstackCalculationOperationsTests extends BrowserstackTestBase {

    @CsvSource(value = {
            "1, 1"
    })
    @ParameterizedTest
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
    void divisionOfTwoNumbersTest(Integer number1, Integer number2) {

        Integer result = number1 / number2;

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
