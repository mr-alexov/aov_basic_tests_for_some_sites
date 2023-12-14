package practice;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class DemoBlazeTest {

    @Test
    void demoBlaze01() {

        Configuration.holdBrowserOpen = true;

        open();

        open("https://www.demoblaze.com/");

        sleep(3000);

        // $("div.card").click();

        $$("div.card").get(8).click();

        $("a.btn-success").click();

        open("https://www.demoblaze.com/cart.html");

        $("tbody#tbodyid").shouldHave(Condition.text("Sony vaio i7"));

        $x("//tbody[@id='tbodyid']//td[3]").shouldHave(Condition.text("790"));

        $("tbody#tbodyid").$("td",2).shouldHave(Condition.text("790"));

        $("tbody#tbodyid").$("td a").click();

        $("tbody#tbodyid").shouldNotHave(Condition.text("Sony vaio i7"));

        $("tbody#tbodyid").$("td").shouldNot(Condition.exist);

    }

    @Test
    void demoBlaze02() {

        Configuration.holdBrowserOpen = true;

        open();

        open("https://www.demoblaze.com/");

        sleep(3000);

        String productName = $("div.card  h4").getText();

        String productPrice = $("div.card  h5").getText();

        $("div.card").click();

        $("a.btn-success").click();

        open("https://www.demoblaze.com/cart.html");

        $("tbody#tbodyid").shouldHave(Condition.text(productName));


    }
}
