package ru.ssau.tk.forev.OOPpractice.String;

import static org.testng.Assert.*;
import static ru.ssau.tk.forev.OOPpractice.String.Strings.printsStringInputObjectToConsole;

import org.testng.annotations.Test;
import ru.ssau.tk.forev.OOPpractice.Matrix_2_31.Matrix;
import ru.ssau.tk.forev.OOPpractice.Person.Person;
import ru.ssau.tk.forev.OOPpractice.Points.NamedPoint;
import ru.ssau.tk.forev.OOPpractice.Points.Point;

public class StringsTest {

    @Test
    public void testOutputEachCharacterString() {
        String string = "Когда человеку кажется, что всё идёт наперекосяк, в его жизнь пытается войти нечто чудесное.";
        char[] chars = Strings.outputEachCharacterString(string);
        for (int i = 0; i < chars.length; i++) {
            System.out.println(chars[i]);
        }
    }

    @Test
    public void testGetByteArrayAndOutput() {
        String string = "В жизни нет ничего лучше собственного опыта.";
        String secondString = "Everything that suddenly changes our lives is not an accident";
        Strings.getByteArrayAndOutput(string);
        Strings.getByteArrayAndOutput(secondString);
    }

    @Test
    public void testReturnValueIsPalindrome() {
        String string = "казак";
        assertTrue(Strings.returnValueIsPalindrome(string));
        String secondString = "жизнь";
        assertFalse(Strings.returnValueIsPalindrome(secondString));
        String thirdString = "топот";
        assertTrue(Strings.returnValueIsPalindrome(thirdString));
    }

    @Test
    public void testCompareContentsOfStrings() {
        String firstString = "работа";
        String secondString = "РАБОТА";
        String thirdString = "работа";
        String fourString = "отдых";
        String fiveString = "ОТДЫХ";
        assertTrue(Strings.compareContentsOfStrings(firstString, secondString));
        assertFalse(Strings.compareContentsOfStrings(firstString, thirdString));
        assertFalse(Strings.compareContentsOfStrings(null, secondString));
        assertFalse(Strings.compareContentsOfStrings(firstString, null));
        assertFalse(Strings.compareContentsOfStrings(firstString, fourString));
        assertTrue(Strings.compareContentsOfStrings(fourString, fiveString));
    }

    @Test
    public void testReturnCharacterIndexFirstLineBeginningSecond() {
        String firstString = "Ставьте перед собой большие цели – по ним тяжелее промазать";
        String secondString = "цели";
        assertEquals(Strings.returnCharacterIndexFirstLineBeginningSecond(firstString, secondString), 28);
        String thirdString = "Ставьте";
        assertEquals(Strings.returnCharacterIndexFirstLineBeginningSecond(firstString, thirdString), 0);
        String fourString = "мир";
        assertEquals(Strings.returnCharacterIndexFirstLineBeginningSecond(firstString, fourString), -1);
        String fiveString = "cтавьте";
        assertEquals(Strings.returnCharacterIndexFirstLineBeginningSecond(firstString, fiveString), -1);
    }

    @Test
    public void testReturnsIndexValueSecondRowInSecondHalfFirstRow() {
        String firstString = "шиншила";
        String secondString = "ши";
        assertEquals(Strings.returnsIndexValueSecondRowInSecondHalfFirstRow(firstString, secondString), 3);
        String thirdString = "до-до-до";
        String fourString = "до";
        assertEquals(Strings.returnsIndexValueSecondRowInSecondHalfFirstRow(thirdString, fourString), 6);
        String fiveString = "ка";
        assertEquals(Strings.returnsIndexValueSecondRowInSecondHalfFirstRow(thirdString, fiveString), -1);
        String sixString = "оратор";
        String sevenString = "ор";
        assertEquals(Strings.returnsIndexValueSecondRowInSecondHalfFirstRow(sixString, sevenString), 4);
    }

    @Test
    public void testReturnsIndexValueLastOccurrenceSecondString() {
        String firstString = "оратор";
        String secondString = "ор";
        assertEquals(Strings.returnsIndexValueLastOccurrenceSecondString(firstString, secondString), 0);
        String thirdString = "до-до-до-до";
        String fourString = "до";
        String fiveString = "ка";
        assertEquals(Strings.returnsIndexValueLastOccurrenceSecondString(thirdString, fourString), 3);
        assertEquals(Strings.returnsIndexValueLastOccurrenceSecondString(thirdString, fiveString), -1);
    }

    @Test
    public void testToReturnQuantityOfLines() {
        assertEquals(Strings.toReturnQuantityOfLines(new String[]{"abpcd", "ablcd", "abucd", "abccd"}, "ab", "cd"), 4);
        assertEquals(Strings.toReturnQuantityOfLines(new String[]{"abkdi", "abbdi", "absdi", "abfdi"}, "ab", "di"), 4);
    }

    @Test
    public void testReturnNumberOfRowsIgnoringSpaceCharacters() {
        assertEquals(Strings.returnNumberOfRowsIgnoringSpaceCharacters(new String[]{" abpcd ", " ablcd ", " abucd ", " abccd "}, "ab", "cd"), 4);
        assertEquals(Strings.returnNumberOfRowsIgnoringSpaceCharacters(new String[]{" abkdi", " abbdi", " absdi", " abfdi"}, "ab", "di"), 4);
    }

    @Test
    public void testReplaceAllInFirstString() {
        assertEquals(Strings.replaceAllInFirstString("ороророро", "оро", "ро"), "роррро");
        assertEquals(Strings.replaceAllInFirstString("спать, спать, спать нужно постоянно", "спать", "работать"), "работать, работать, работать нужно постоянно");
    }

    @Test
    public void testGetSubstring() {
        String string = "abpcd";
        assertEquals(Strings.getSubstring(string, -5, 5), string.substring(0, 5));
        assertEquals(Strings.getSubstring(string, 1, 6), string.substring(1, 5));
        assertEquals(Strings.getSubstring(string, 1, 1), "");
        assertEquals(Strings.getSubstring(string, 1, 3), "bp");
    }

    @Test
    public void testPrintsStringInputObjectToConsole() {
        printsStringInputObjectToConsole(new Person("James", "Hawkins"));
        printsStringInputObjectToConsole(new Point(2, 3, 7));
        printsStringInputObjectToConsole(new NamedPoint(8, 1, 10, "First"));
        Matrix firstMatrix = new Matrix(2, 2);
        firstMatrix.setAt(1, 1, 10);
        firstMatrix.setAt(1, 2, 10);
        firstMatrix.setAt(2, 1, 10);
        firstMatrix.setAt(2, 2, 10);
        printsStringInputObjectToConsole(firstMatrix);
    }

    @Test
    public void testSplitStringBySpaceCharacter() {
        String string = "мы потому не говорим, что думаем в режиме  умолчания";
        String[] arrayString = Strings.splitStringBySpaceCharacter(string);
        assertEquals(arrayString[0], "Мы");
        assertEquals(arrayString[1], "Потому");
        assertEquals(arrayString[2], "Не");
        assertEquals(arrayString[3], "Говорим,");
        assertEquals(arrayString[4], "Что");
        assertEquals(arrayString[5], "Думаем");
        assertEquals(arrayString[6], "В");
        assertEquals(arrayString[7], "Режиме");
        assertEquals(arrayString[8], "");
        String secondString = "если вы что-то боитесь сделать в жизни, то это как раз и есть то, что вам необходимо сделать в первую очередь.";
        String[] secondArrayString = Strings.splitStringBySpaceCharacter(secondString);
        for (String a : secondArrayString) {
            System.out.println(a);
        }
    }

    @Test
    public void testUnionInRow() {
        String[] string = new String[]{"В семье бывает всякое", "случается и счастье."};
        assertEquals(Strings.unionInRow(string), "В семье бывает всякое, случается и счастье.");
        String[] secondString = new String[]{"Кто может", "делает", "кто не может", "подвергает критике того", "кто может."};
        assertEquals(Strings.unionInRow(secondString), "Кто может, делает, кто не может, подвергает критике того, кто может.");
    }
}