package ru.ssau.tk.forev.OOPpractice.Person;

public class Check1 {
    /*
    Сначала на консоли выводится Ignat, т.к. копия ссылки на объект переопределяется методом checkAnotherPerson()
    новым объектом person, причем только во время работы метода.Потом выводится Arkadiy, т.к.
    идет обращение к исходному объекту.
     */
    public static void main(String[] args) {

        Person person = new Person();
        person.setFirstName("Arkadiy");
        checkAnotherPerson(person);
        System.out.println(person.getFirstName());
    }

    private static void checkAnotherPerson(Person person) {
        person = new Person();
        person.setFirstName("Ignat");
        System.out.println(person.getFirstName());
    }
}
