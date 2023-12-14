package tasks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class DemoQAFormTests {


    @Test
    void demoQA00() {

        Configuration.holdBrowserOpen = true;
        Configuration.browserSize = "1920x1080";

        open("https://demoqa.com/automation-practice-form");

        executeJavaScript("$('footer').remove();");
        executeJavaScript("$('#fixedban').remove();");

        $("input[id='firstName']").setValue("John");
        $("input[id='lastName']").setValue("Doe");
        $("input[id='userEmail']").setValue("a@b.com");
        $("label[for='gender-radio-1']").click();
        $("input[id='userNumber']").setValue("1234567890");
        $("input[id='dateOfBirthInput']").click();
        $("select.react-datepicker__year-select").selectOption("2000");
        $("select.react-datepicker__month-select").selectOption("March");
        $(".react-datepicker__day--007").click();

        $("#subjectsInput").click();
        $("#subjectsInput").sendKeys("Hindi");
        $("#subjectsInput").pressEnter();

        $x("//label[contains(text(),'Music')]/../input").click();

        $("[id='uploadPicture']").uploadFromClasspath("test_passport.png");

        $("[id='currentAddress']").setValue("Some address");

        $("#state").click();
        $(byText("NCR")).click();

        $("#city").click();
        $(byText("Delhi")).click();

        $("#submit").click();

        $x("//td[contains(text(),'Student Name')]/../td[2]").shouldHave(Condition.text("John Doe"));

    }
}
