package any.ru;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class TestStac {

    @BeforeAll
    static void setup() {
        Configuration.startMaximized = true;
        Configuration.holdBrowserOpen = true;
    }

    @Test
    void authorization() {
        String baseUrl = "http://192.168.7.218/test/login";
        String org = "Шебекинская ЦРБ Тест";
        String login = "st_terapevt";
        String password = "s123";

        open(baseUrl);
        $(By.name("loginInput")).setValue(login);
        $(By.name("passwordInput")).setValue(password);
        $(By.name("organisationInput")).setValue(org);
        $(By.xpath("//span[text()=' Шебекинская ЦРБ Тест ']")).click();
        $(By.xpath("//button[text()=' Войти ']")).click();
    }
}
