package ru.ssau.tk.forev.OOPpractice;

public class TypeСhecking {

    static void printType(byte kind ) {
        System.out.println("byte");
    }

    static void printType(char kind) {
        System.out.println("char");
    }

    static void printType(short kind) {
        System.out.println("short");
    }

    static void printType(int kind) {
        System.out.println("int");
    }

    static void printType(long kind) {
        System.out.println("long");
    }

    static void printType(float kind) {
        System.out.println("float");
    }

    static void printType(double kind) {
        System.out.println("double");
    }

    static void printType(boolean kind) {
        System.out.println("boolean");
    }

    static void printType(Object kind) {
        if (kind == null) {
            System.out.println("null");
        }
        else {
            System.out.println(kind.getClass().getSimpleName());
        }
    }
}
