package ru.ssau.tk.forev.OOPpractice.String;

import java.util.Objects;

public class Strings {

    public static void main(String[] args) {
        printComparisonValuesTwoStrings();
        studyingShieldingSymbols();
    }

    public static char[] outputEachCharacterString(String string) {
        char[] charactersString = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charactersString[i] = string.charAt(i);
        }
        return charactersString;
    }

    public static void getByteArrayAndOutput(String string) {
        byte[] byteString = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(byteString[i]);
        }
    }

    public static void printComparisonValuesTwoStrings() {
        String string = "Каждый новый день мы строим планы на будущее. Но у будущего свои планы.";
        String secondString = new String(string);
        System.out.println(string == secondString);//выводит false,потому что оператор == сравнивает не свойства объектов, а ссылки.Т.е string и secondString указывают на два разных объекта.
        System.out.println(string.equals(secondString));//вывод true, т.к эти строки имеют одно и тоже же значение. Метод equals сравнивает значения.
    }

    public static boolean returnValueIsPalindrome(String string) {
        for (int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != string.charAt(string.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static boolean compareContentsOfStrings(String firstString, String secondString) {
        if (!Objects.equals(null, secondString) && !Objects.equals(firstString, null) && !firstString.equals(secondString) && firstString.equalsIgnoreCase(secondString)) {
            return true;
        }
        return false;
    }

    public static void studyingShieldingSymbols() {
        int i = 0;
        System.out.println("Символ\t№" + ++i);//Символ	№1 : \t-знак табуляции, т. е. отступит вправо на некоторое колочество позиций.. .
        System.out.println("Символ\b№" + ++i);//Симво№2 :    \b- Позволяет удалить последний символ в строке вывода,т.е пробел
        System.out.println("Символ\n№" + ++i);//Символ   №3: \n- Символ перехода на новую строку;
        System.out.println("Символ\r№" + ++i);//№4 : \r- Позволяет вернуть курсор к началу строки вывода и отображать новую информацию так, как будто ранее в этой строке ничего не было.
        // т.е он удалили "Символ" и вывел как новую информацию в виде только "№4"
        System.out.println("Символ\'№" + ++i);//Символ'№5 :   \'- Экранировать одинарную кавычку
        System.out.println("Символ\"№" + ++i);//Символ"№6 :   \"- Символ двойной кавычки;
        System.out.println("Символ\\№" + ++i);//Символ\№7 :   \\- Cимвол обратной косой черты (\).
        //System.out.println("Символ\№" + ++i); illegal escape character in string literal
        //System.out.println("Символ\t  №" + ++i);//Символ   8 - решила просто проверить, что он отступит вправо на 3 позиции
    }

    public static int returnCharacterIndexFirstLineBeginningSecond(String firstString, String secondString) {
        return firstString.indexOf(secondString);
    }

    public static int returnsIndexValueSecondRowInSecondHalfFirstRow(String firstString, String secondString) {
        return firstString.indexOf(secondString, firstString.length() / 2);
    }

    public static int returnsIndexValueLastOccurrenceSecondString(String firstString, String secondString) {
        return firstString.lastIndexOf(secondString, firstString.length() / 2);
    }

    public static int toReturnQuantityOfLines(String[] arrayStrings, String prefix, String postfix) {
        int l = 0;
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].startsWith(prefix) && arrayStrings[i].endsWith(postfix)) {
                l++;
            }
        }
        return l;
    }

    public static int returnNumberOfRowsIgnoringSpaceCharacters(String[] arrayStrings, String prefix, String postfix) {
        int l = 0;
        for (int i = 0; i < arrayStrings.length; i++) {
            if (arrayStrings[i].trim().startsWith(prefix) && arrayStrings[i].trim().endsWith(postfix)) {
                l++;
            }
        }
        return l;
    }

    public static String replaceAllInFirstString(String string, String regex, String replacement) {
        for (int i = 0; i < 100 && string.contains(regex); i++) {
            string = string.replaceAll(regex, replacement);
        }
        return string;
    }

    public static String getSubstring(String string, int from, int to) {
        if (from < 0) {
            from = 0;
        } else if (to > string.length()) {
            to = string.length();
        }
        if (to <= from) {
            return "";
        }
        return string.substring(from, to);
    }

    public static void printsStringInputObjectToConsole(Object object) {
        System.out.println("Описание объекта: " + object);
    }

    public static String[] splitStringBySpaceCharacter(String string) {
        String[] newString = string.split(" ");
        for (int i = 0; i < newString.length; i++) {
            if (!newString[i].isEmpty()) {
                newString[i] = newString[i].substring(0, 1).toUpperCase() + newString[i].substring(1);
            }
        }
        return newString;
    }
}
