import config.WebConfig;
import org.aeonbits.owner.ConfigFactory;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;

public class JobSearch extends TestBase{

    private static final WebConfig webConfig = ConfigFactory.create(WebConfig.class, System.getProperties());

    @Test
    @DisplayName("Проверка перехода через вкладку Работа в IT")
    void tabWorkInIT() {

        step("Открытие страницы gradle clean", () -> {
            open("/career");
        });
        step("Нажимаем на вкладку Работа в IT", () -> {
            $(".cbdWmaCAy").$(byText("Работа в IT")).click();
        });
        step("Проверяем, что страница успешно открыта", () -> {
            $("[role=\"main\"]").shouldHave(text("Работа в ИТ Тинькофф"));
        });
    }
}
