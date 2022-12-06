package ru.charushnikov.checkusersofwindows;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static ru.charushnikov.checkusersofwindows.service.CheckUserService.checkUser;

public class CheckUserServiceTest {
    @Test
    void shouldReturnTrueWhenCheckCorrectUserName() {
        String result = checkUser("Танюша");
        assertTrue("Пользователь Танюша есть".equals(result));
    }

    @Test
    void shouldReturnTrueWhenCheckIncorrectUserName() {
        String result = checkUser("Keks");
        assertTrue("Пользователя Keks нет".equals(result));
    }
}
