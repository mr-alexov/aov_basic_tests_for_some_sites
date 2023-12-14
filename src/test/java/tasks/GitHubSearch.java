package tasks;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class GitHubSearch {

    @Test
    void githubSearch() {
        Configuration.holdBrowserOpen = true;

        open("https://github.com/");

        $("[data-target='qbsearch-input.inputButtonText']").click();
        $("[id='query-builder-test']").setValue("selenide").pressEnter();
    }
}
