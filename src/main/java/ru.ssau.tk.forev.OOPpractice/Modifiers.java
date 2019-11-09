package ru.ssau.tk.forev.OOPpractice;
/*
                       Модификаторы объявления класса
--------------------------------------------------------------------------
-         - public - protected - private -  final -  abstract - strictfp -
- ------------------------------------------------------------------------
-public   -   no   -    no     -    no   -   yes  -    yes    -    yes   -
-protected-   no   -    no     -    no   -   yes  -    yes    -    yes   -
-private  -   no   -    no     -    no   -   yes  -    yes    -    yes   -
-final    -   yes  -    yes    -    yes  -   no   -    no     -    yes   -
-abstract -   yes  -    yes    -    yes  -   no   -    no     -    yes   -
-strictfp -   yes  -    yes    -    yes  -   yes  -    yes    -    no    -
--------------------------------------------------------------------------
public protected class TestMod { Ошибка: Illegal combination of modifiers: 'public' and 'protected'
public private class TestMod { Ошибка: Illegal combination of modifiers: 'public' and 'private'
public final class TestMod { final для класса это означает, что класс не сможет иметь подклассов, т.е. запрещено наследование.
public abstract class TestMod { Если класс объявлен абстрактным, его нельзя реализовать.
public strictfp class TestMod {strictfp - это модификатор ограничивающий точность вычислений с float и double по стандарту IEEE.
protected private class TestMod { Ошибка: Illegal combination of modifiers:'protected' and 'private'
final abstract class TestMod { Ошибка: Illegal combination of modifiers: 'final' and 'abstract'

                              Модификаторы полей класс
-------------------------------------------------------------------------------------
-          - public - protected - private - static -  final -  transient - volatile -
- -----------------------------------------------------------------------------------
-public    -   no   -    no     -    no   -  yes   -   yes  -    yes     -    yes   -
-protected -   no   -    no     -    no   -  yes   -   yes  -    yes     -    yes   -
-private   -   no   -    no     -    no   -  yes   -   yes  -    yes     -    yes   -
-static    -   yes  -    yes    -    yes  -  no    -   yes  -    yes     -    yes   -
-final     -   yes  -    yes    -    yes  -  yes   -   no   -    yes     -    no    -
-transient -   yes  -    yes    -    yes  -  yes   -   yes  -    no      -    yes   -
-volatile  -   yes  -    yes    -    yes  -  yes   -   no   -    yes     -    no    -
-------------------------------------------------------------------------------------
public protected int proInt = 1108;  Ошибка: Illegal combination of modifiers: 'public' and 'protected'
public private int proInt = 1108;  Ошибка: Illegal combination of modifiers: 'public' and 'private'
public transient int proInt = 1108; Cсылка на экземпляр объекта, который не требует сериализации или не может быть сериализован.
public volatile int proInt = 1108; Ключевое слово volatile указывается для поля для того, чтобы указать компилятору, что все операции
присвоения этой переменной и все операции чтения из неё должны быть атомарными.
protected private int proInt = 1108; Ошибка: Illegal combination of modifiers:'protected' and 'private'
final volatile int proInt = 1108; Ошибка: Illegal combination of modifiers:'final' and 'volatile'

                                                    Модификаторы методов класса
------------------------------------------------------------------------------------------------------------
-            - public - protected - private - static - final - abstract - strictfp - synchronized - native -
- ----------------------------------------------------------------------------------------------------------
-public      -   no   -    no     -    no   -   yes  -  yes  -   yes    -   yes    -     yes      -   yes  -
-protected   -   no   -    no     -    no   -   yes  -  yes  -   yes    -   yes    -     yes      -   yes  -
-private     -   no   -    no     -    no   -   yes  -  no -     yes    -   yes    -     yes      -   yes  -
-static      -   yes  -    yes    -    yes  -   no   -  no -     no     -   yes    -     yes      -   yes  -
-final       -   yes  -    yes    -    no   -   no-     no  -    no     -   yes    -     yes      -   yes  -
-abstract    -   yes  -    yes    -    yes  -   no   -  no  -    no     -   no     -     no       -   no   -
-strictfp    -   yes  -    yes    -    yes  -   yes  -  yes  -   no     -   no     -     yes      -   no   -
-synchronized-   yes  -    yes    -    yes  -   yes  -  yes  -   no     -   yes    -     no       -   yes  -
-native      -   yes  -    yes    -    yes  -   yes  -  yes  -   no     -   no     -     yes      -   no   -
--------------------------------------------------------------------------------------------------------
Synchronized (с англ. "синхронизированный") - это ключевое слово, которое позволяет заблокировать доступ к методу или
части кода, если его уже использует другой поток.
Модификатор native сигнализирует о том, что метод реализован в платформо-зависимом коде, часто на языке С.
Этот модификатор может быть применен только к методам, но не классам и переменным.
private final void prtLn() { - 'private' method declared 'final'
static final void prtLn() { 'static' method declared 'final'
static abstract void prtLn() { Ошибка: Illegal combination of modifiers: 'public' and 'protected'
final abstract  void prtLn() { Ошибка: Illegal combination of modifiers: 'final' and 'abstract'
abstract strictfp void prtLn() { Ошибка: Illegal combination of modifiers: 'abstract' and 'strictfp'
abstract synchronized void prtLn() { Ошибка: Illegal combination of modifiers: 'abstract' and 'synchronized'
abstract native void prtLn() {  Ошибка: Illegal combination of modifiers: 'abstract' and 'native'
strictfp native void prtLn() { Ошибка: Illegal combination of modifiers: 'strictfp' and 'native'
*/

class Modifiers {
    public abstract class TestMod {
        int proInt = 1108;

        public void prtLn() {
            System.out.println("proInt" + proInt);
        }
    }
}
