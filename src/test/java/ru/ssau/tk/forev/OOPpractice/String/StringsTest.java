package ru.ssau.tk.forev.OOPpractice.String;

import static org.testng.Assert.*;

import org.testng.annotations.Test;

public class StringsTest {

    @Test
    public void testCharactersString() {
        String string = "Когда человеку кажется, что всё идёт наперекосяк, в его жизнь пытается войти нечто чудесное.";
        char[] chars = Strings.charactersString(string);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }
}