package practice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class SobasednikTests {

    @Test
    void sobasednik01() {

        Configuration.holdBrowserOpen = true;

        Configuration.baseUrl = "https://guru.qahacking.ru";

        // https://guru01.qahacking.ru
        // https://guru02.qahacking.ru

        open("/index.php/magazin");
        $(".button_buy").click();
        $(".jshop.cart").shouldHave(Condition.text("Базовый курс тестирования ПО"));

    }

}
