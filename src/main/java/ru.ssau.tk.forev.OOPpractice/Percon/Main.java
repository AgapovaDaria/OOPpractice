package ru.ssau.tk.forev.OOPpractice.Percon;

public class Main {
    public static void main(String[] args) {

        Person onePeople = new Person("Kate", "Petrova", 6315);

        System.out.println(" Имя — " + onePeople.getFirstName());
        System.out.println(" Фамилия — " + onePeople.getLastName());
        System.out.println("Номер паспорта — " + onePeople.getPassportId());

        Person twoPeople = new Person("Victor", "Long", 8546);

        System.out.println(" Имя — " + twoPeople.getFirstName());
        System.out.println(" Фамилия — " + twoPeople.getLastName());
        System.out.println("Номер паспорта — " + twoPeople.getPassportId());

        Person threePeople = new Person("Lada", "Bukina", 1469);

        System.out.println(" Имя — " + threePeople.getFirstName());
        System.out.println(" Фамилия — " + threePeople.getLastName());
        System.out.println("Номер паспорта — " + threePeople.getPassportId());

        Person fourPeople = new Person("Pasha", "Volodin");

        System.out.println(" Имя — " + fourPeople.getFirstName());
        System.out.println(" Фамилия — " + fourPeople.getLastName());

        Person fivePeople = new Person(11548);

        System.out.println("Номер паспорта — " + fivePeople.getPassportId());
    }

}

