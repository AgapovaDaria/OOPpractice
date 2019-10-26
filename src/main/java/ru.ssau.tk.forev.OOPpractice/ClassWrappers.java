package ru.ssau.tk.forev.OOPpractice;

public class ClassWrappers {

    static Integer boxing(int i) {
        return new Integer(i);
    }

    static Boolean boxing(boolean b) {
        return new Boolean(b);
    }

    static Short boxing (short s) {
        return new Short(s);
    }

    static Double boxing (double d) {
        return new Double(d);
    }

    static Float boxing (float f) {
        return new Float(f);
    }

    static Long boxing (long l){
        return new Long(l);
    }

    static Character boxing (char c) {
        return new Character(c);
    }

    static Byte boxing (byte byt) {
        return new Byte(byt);
    }

    static int unboxing(Integer i) {
        return i.intValue();
    }

    static boolean unboxing(Boolean b) {
        return b.booleanValue();
    }

    static short unboxing(Short s) {
        return s.shortValue();
    }

    static double unboxing(Double d) {
        return d.doubleValue();
    }

    static float unboxing(Float f) {
        return f.floatValue();
    }

    static long unboxing(Long l) {
        return l.longValue();
    }

    static char unboxing(Character c) {
        return c.charValue();
    }

    static byte unboxing(Byte byt){
        return byt.byteValue();
    }

    static Integer autoBoxing(int p) {
        return p;
    }

    static Boolean autoBoxing(boolean p) {
        return p;
    }

    static Short autoBoxing(short p) {
        return p;
    }

    static Double autoBoxing(double p) {
        return p;
    }

    static Float autoBoxing(float p) {
        return p;
    }

    static Long autoBoxing(long p) {
        return p;
    }

    static Character autoBoxing(char p) {
        return p;
    }

    static Byte autoBoxing(byte p) {
        return p;
    }

    static int autoUnboxing(Integer i) {
        return i;
    }

    static boolean autoUnboxing(Boolean b) {
        return b;
    }

    static short autoUnboxing(Short s) {
        return s;
    }

    static double autoUnboxing(Double d) {
        return d;
    }

    static float autoUnboxing(Float f) {
        return f;
    }

    static long autoUnboxing(Long l) {
        return l;
    }

    static char autoUnboxing(Character c) {
        return c;
    }

    static byte autoUnboxing(Byte byt){
        return byt;
    }
}
