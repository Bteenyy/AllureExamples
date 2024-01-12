import io.qameta.allure.Feature;
import io.qameta.allure.Owner;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static io.qameta.allure.Allure.step;

public class AllureExampleTest {
    @Test
    @DisplayName("Успешная авторизация на сайте Derray.com")
    @Owner("SR")
    public void successfulAuth() {
        step("Открыть сайт Deeray.com");
        step("Нажать на кнопку `Вход` в хэдере");
        step("Заполнить поле 'Email' верным значением");
        step("Заполнить поле 'Пароль' верным значением");
        step("Нажать кнопку `Войти`");
        step("Убедиться, что авторизовались успешно");
    }
    @Test
    @DisplayName("Попытка авторизации на сайте Derray.com путем ввода неверного пароля")
    @Owner("SR")
    public void unsuccessfulAuth() {
        step("Открыть сайт Deeray.com");
        step("Нажать на кнопку `Вход` в хэдере");
        step("Заполнить поле 'Email' верным значением");
        step("Заполнить поле 'Пароль' неверным значением");
        step("Нажать кнопку `Войти`");
        step("Проверить, что появилась запись 'Ошибка авторизации'");
    }
}
