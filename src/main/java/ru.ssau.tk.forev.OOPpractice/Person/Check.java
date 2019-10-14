package ru.ssau.tk.forev.OOPpractice.Person;

public class Check {
    /*
     В данном методе на консоль сначала выводится 10, это связано с переопределением переменной number,
     т.к мы вызываем метод checkInt() , внутри которого меняет значение переменной на 10 и выводим. Затем выводится Oleg,
     т.к передаётся копия ссылки на него, которая будет указывать на тот же объект. Затем выводится 5,
     так как метод checkInt() изменил не саму переменную number, а её копию, определенную только в методе =>
     выводится значение переменной которую мы задали изначально. Затем снова выводится Oleg,
     т. к. ссылка указывает на тот же объект, на который указывала копия ссылки.
     */
    public static void main(String[] args) {
        Person person = new Person();
        person.setFirstName("Arkadiy");
        int number = 5;
        checkInt(number);
        checkPerson(person);
        System.out.println(number);
        System.out.println(person.getFirstName());
    }

    private static void checkInt(int number) {
        number = 10;
        System.out.println(number);
    }

    private static void checkPerson(Person person) {
        person.setFirstName("Oleg");
        System.out.println(person.getFirstName());
    }
}
