package snippets;

// Это шпаргалка с намёками для тех кто только учится

import com.codeborne.selenide.Configuration; // Импорт класса Селенидовоской конфигурации
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test; // Импорт аннотации @Test

public class AovSnippets {

    @BeforeAll // Аннотация для кода который выполнится перед всеми тестами (лучше в базовый тестовый класс)
    static void ConfigurationSnippets() {

        // Блок Configuration

        Configuration.browserSize = "1920x1080"; // Выставление браузеру размера окна 1920x1080 -- чтобы было больше места

        Configuration.pageLoadStrategy = "eager"; // Энергичная стратегия загрузки страницы если просто загрузка тормозит. Командует не ждать загрузки того что долго грузится.

        Configuration.holdBrowserOpen = true; // Оставлять браузер открытым после заверешения теста. Нужно когда делаешь эксперименты в коде, а вообще -- нет.

        Configuration.baseUrl = "https://guru.qahacking.ru"; // Используется если несколько тестов на один и тот же адрес.

    }

    @Test  // Аннотация которую нужно ставить над тестом
    void SelenideSnippets() {

    }
}
