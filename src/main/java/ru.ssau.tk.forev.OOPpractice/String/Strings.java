package ru.ssau.tk.forev.OOPpractice.String;

public class Strings {

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
}
