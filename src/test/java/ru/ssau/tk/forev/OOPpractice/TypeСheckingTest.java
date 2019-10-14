package ru.ssau.tk.forev.OOPpractice;

import org.testng.annotations.Test;
import ru.ssau.tk.forev.OOPpractice.Person.Person;


public class TypeСheckingTest {

    @Test
    public void printType() {
        TypeСhecking.printType(-9223372036854775808L);//Постфикс L обозначает литералы типа long
        TypeСhecking.printType( 1.4e-45f); /* При использовании типа float требуется указывать суффикс f так
        как без него типом литерала будет считаться double */
        TypeСhecking.printType( 1.4e-45);
        TypeСhecking.printType( true);
        TypeСhecking.printType( (byte) 127 );// приводим к типу byte явно, из-за особенностей арифметики Java
        TypeСhecking.printType( (short)-32768);// приводим к типу short явно, из-за особенностей арифметики Java
        TypeСhecking.printType( 10 );
        TypeСhecking.printType( null );
        TypeСhecking.printType("Hello" );
        TypeСhecking.printType('k');
        TypeСhecking.printType(new Person());
    }
}