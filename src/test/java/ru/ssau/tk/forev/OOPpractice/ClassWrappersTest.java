package ru.ssau.tk.forev.OOPpractice;

import org.testng.annotations.Test;
import static org.testng.Assert.*;


public class ClassWrappersTest {

    @Test
    @Deprecated
    public void test() {
        int i = 5;
        int i2 = 5;
        int i3 = 8;
        Integer I = ClassWrappers.boxing(i);
        Integer I4=8;
        Integer I5=8;
        Integer I1=10;
        int i1 = ClassWrappers.unboxing(I1);
        System.out.println(i + " " + I);
        System.out.println(i1 + " " + I1);
        System.out.println("i == i2"+" "+ (i == i2));
        System.out.println("i == i3"+" "+ (i == i3));
        System.out.println("i3 == I4"+" "+ (i3 == I4));
        System.out.println("I5 == I4"+" "+ (I5.equals(I4)));

        boolean b = false;
        Boolean B= ClassWrappers.boxing(b);
        Boolean B1= true;
        boolean b1= ClassWrappers.unboxing(B1);
        System.out.println(b + " " + B);
        System.out.println(b1 + " " + B1);

        short s= 32762;
        Short S= ClassWrappers.boxing(s);
        Short S1= 31780;
        short s1= ClassWrappers.unboxing(S1);
        System.out.println(s + " " + S);
        System.out.println(s1 + " " + S1);
        System.out.println("s == i"+" "+ (s == i));
        System.out.println("I1 == S1"+" "+ (I1.equals(S1)));
        /*для остальных типов аналогично*/

        Boolean condition;
        Boolean conditionNull = null;
}
}