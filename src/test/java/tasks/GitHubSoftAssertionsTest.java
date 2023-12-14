package tasks;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSoftAssertionsTest {

    @Test
    void ghSoftAssertions() {

        Configuration.browserSize = "1920x1080";
        Configuration.holdBrowserOpen = true;

        open("https://github.com/selenide/selenide");

        $("#wiki-tab").click();

        $("button.js-wiki-more-pages-link").click();

        $("[data-filterable-for='wiki-pages-filter']").shouldHave(Condition.text("SoftAssertions"));

        $("[data-filterable-for='wiki-pages-filter'] [href='/selenide/selenide/wiki/SoftAssertions']").click();

        // open("https://github.com/selenide/selenide/wiki/SoftAssertions");

        String testString = """
                @ExtendWith({SoftAssertsExtension.class})
                class Tests {
                  @Test
                  void test() {
                    Configuration.assertionMode = SOFT;
                    open("page.html");

                    $("#first").should(visible).click();
                    $("#second").should(visible).click();
                  }
                }""";

        // Первый вариант посложнее
        $("h4#user-content-3-using-junit5-extend-test-class")
                .sibling(0).shouldHave(Condition.text(testString));

        // Второй вариант попроще
        $(".markdown-body")
                .shouldHave(Condition.text(testString));

    }


}
