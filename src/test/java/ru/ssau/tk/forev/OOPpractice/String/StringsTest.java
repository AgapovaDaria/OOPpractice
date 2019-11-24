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

    @Test
    public void testBytesArray() {
        String string = "В жизни нет ничего лучше собственного опыта.";
        String secondString = "Everything that suddenly changes our lives is not an accident";
        Strings.bytesArray(string);
        Strings.bytesArray(secondString);
    }

    @Test
    public void testPalindrome() {
        String string = "казак";
        assertTrue(Strings.palindrome(string));
        String secondString = "жизнь";
        assertFalse(Strings.palindrome(secondString));
        String thirdString = "топот";
        assertTrue(Strings.palindrome(thirdString));
    }

    @Test
    public void testStringComparisonAndCaseSensitive() {
        String firstString = "работа";
        String secondString = "РАБОТА";
        String thirdString = "работа";
        String fourString = "отдых";
        String fiveString = "ОТДЫХ";
        assertTrue(Strings.stringComparisonAndCaseSensitive(firstString, secondString));
        assertFalse(Strings.stringComparisonAndCaseSensitive(firstString, thirdString));
        assertFalse(Strings.stringComparisonAndCaseSensitive(null, secondString));
        assertFalse(Strings.stringComparisonAndCaseSensitive(firstString, null));
        assertFalse(Strings.stringComparisonAndCaseSensitive(firstString, fourString));
        assertTrue(Strings.stringComparisonAndCaseSensitive(fourString, fiveString));
    }

    @Test
    public void testIndexOccurrenceOfSecondRowInFirst() {
        String firstString = "Ставьте перед собой большие цели – по ним тяжелее промазать";
        String secondString = "цели";
        assertEquals(Strings.indexOccurrenceOfSecondRowInFirst(firstString, secondString), 28);
        String thirdString = "Ставьте";
        assertEquals(Strings.indexOccurrenceOfSecondRowInFirst(firstString, thirdString), 0);
        String fourString = "мир";
        assertEquals(Strings.indexOccurrenceOfSecondRowInFirst(firstString, fourString), -1);
        String fiveString = "cтавьте";
        assertEquals(Strings.indexOccurrenceOfSecondRowInFirst(firstString, fiveString), -1);
    }
}