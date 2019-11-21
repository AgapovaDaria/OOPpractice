package ru.ssau.tk.forev.OOPpractice.String;

public class Strings {

    public static void main(String[] args) {
        stringComparison();
    }

    public static char[] charactersString(String string) {
        char[] charactersString = new char[string.length()];
        for (int i = 0; i < string.length(); i++) {
            charactersString[i] = string.charAt(i);
        }
        return charactersString;
    }

    public static void bytesArray(String string) {
        byte[] byteString = string.getBytes();
        for (int i = 0; i < string.length(); i++) {
            System.out.println(byteString[i]);
        }
    }

    public static void stringComparison() {
        String string = "Каждый новый день мы строим планы на будущее. Но у будущего свои планы.";
        String secondString = new String(string);
        System.out.println(string == secondString);//выводит false,потому что оператор == сравнивает не свойства объектов, а ссылки.Т.е string и secondString указывают на два разных объекта.
        System.out.println(string.equals(secondString));//вывод true, т.к эти строки имеют одно и тоже же значение. Метод equals сравнивает значения.
    }
}
