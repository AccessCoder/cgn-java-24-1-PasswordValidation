package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void checkLenght_shouldReturnTrue_whenCalledWithValidPassword(){
        //GIVEN
        String password = "gggggggg";
        //WHEN
        boolean actual = Main.checkLenght(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkLenght_shouldReturnFalse_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "g";
        //WHEN
        boolean actual = Main.checkLenght(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsDigit_shouldReturnTrue_whenCalledWithValidPassword(){
        //GIVEN
        String password = "5";
        //WHEN
        boolean actual = Main.containsDigit(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containsDigit_shouldReturnFalse_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "fd";
        //WHEN
        boolean actual = Main.containsDigit(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containUpperCase_shouldReturnTrue_whenCalledWithValidPassword(){
        //GIVEN
        String password = "Z";
        //WHEN
        boolean actual = Main.containsUpperCase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containUpperCase_shouldReturnFalse_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "w";
        //WHEN
        boolean actual = Main.containsUpperCase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containLowerCase_shouldReturnTrue_whenCalledWithValidPassword(){
        //GIVEN
        String password = "z";
        //WHEN
        boolean actual = Main.containsLowerCase(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void containLowerCase_shouldReturnFalse_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "W";
        //WHEN
        boolean actual = Main.containsLowerCase(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsBadPassword_shouldReturnFalse_whenCalledWithValidPassword(){
        //GIVEN
        String password = "W";
        //WHEN
        boolean actual = Main.containsBadPassword(password);
        //THEN
        assertFalse(actual);
    }

    @Test
    void containsBadPassword_shouldReturnTrue_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "Passwort123";
        //WHEN
        boolean actual = Main.containsBadPassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkPassword_shouldReturnTrue_whenCalledWithValidPassword(){
        //GIVEN
        String password = "StarkesPasswort12";
        //WHEN
        boolean actual = Main.checkPassword(password);
        //THEN
        assertTrue(actual);
    }

    @Test
    void checkPassword_shouldReturnFalse_whenCalledWithInvalidPassword(){
        //GIVEN
        String password = "Starkes";
        //WHEN
        boolean actual = Main.checkPassword(password);
        //THEN
        assertFalse(actual);
    }


}