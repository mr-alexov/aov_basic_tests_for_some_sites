package practice;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class AutomationPracticeShopTests {

    @Test
    void test01() {

        Configuration.holdBrowserOpen = true;

        Configuration.browserSize = "1920x1080";

        open("https://www.automationexercise.com/");

        executeJavaScript("$('footer').remove();");

        $(".product-image-wrapper .choose a").scrollIntoView(true);

        $(".product-image-wrapper .choose a").click();


    }
}
