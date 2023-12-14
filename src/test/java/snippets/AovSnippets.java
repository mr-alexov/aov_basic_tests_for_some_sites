package snippets;

// Это шпаргалка с намёками для тех кто только учится

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration; // Импорт класса Селенидовоской конфигурации
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; // Импорт аннотации @Test

import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;

public class AovSnippets {

    @BeforeAll // Аннотация для кода который выполнится перед всеми тестами (лучше в базовый тестовый класс)
    static void ConfigurationSnippets() {

        // Блок Configuration

        Configuration.browserSize = "1920x1080"; // Выставление браузеру размера окна 1920x1080 -- чтобы было больше места

        Configuration.pageLoadStrategy = "eager"; // Энергичная стратегия загрузки страницы если просто загрузка тормозит. Командует не ждать загрузки того что долго грузится.

        Configuration.holdBrowserOpen = true; // Оставлять браузер открытым после заверешения теста. Нужно когда делаешь эксперименты в коде, а вообще -- нет.

        Configuration.baseUrl = "https://guru.qahacking.ru"; // Используется если несколько тестов на один и тот же адрес.

    }

    @Test
        // Аннотация которую нужно ставить над тестом
    void SelenideSnippets() {

        $("selector").click(); // Найти элемент по CSS селектору (и кликнуть)

        $x("XPath").click(); // Найти элемент по XPath (и кликнуть)

        $(byText("Text")).click(); // Найти элемент по тексту (и кликнуть)

        $("selector").click(); // click() -- кликнуть по найденному элементу

        $("selector").setValue("Value"); // Установить значение найденному элементу

        $("selector").sendKeys("Value"); // Ввести значение найденному элементу (может работать если setValue не работает)

        $("selector").selectOption("Value"); // Выбрать значение из элемента типа select

        $("selector").pressEnter(); // Отправить элементу нажатие клавиши Enter

        $("selector").uploadFromClasspath("test_passport.png"); // Загрузить файл в инпут соответствующего типа

        executeJavaScript("$('selector').remove();"); // Выполнить какой-то джаваскрипт; например удаление элемента

        $("selector").shouldHave(Condition.text("Text")); // Проверить что в элементе есть соответствующий текст

    }
}
