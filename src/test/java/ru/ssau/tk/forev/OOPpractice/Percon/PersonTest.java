package ru.ssau.tk.forev.OOPpractice.Percon;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class PersonTest {
    private Person firstPerson = new Person();
    private Person secondPerson = new Person();
    private Person thirdPerson = new Person();
    private Person fourthPerson = new Person(null, null);
    private Person fifthPerson = new Person();

    @Test
    public void test() {
        fifthPerson.setFirstName("Sophie");
        fifthPerson.setLastName("Sykes");
        fifthPerson.setPassportId(2087);
        assertEquals(fifthPerson.getFirstName(), "Sophie");
        assertEquals(fifthPerson.getLastName(), "Sykes");
        assertEquals(fifthPerson.getPassportId(), 2087);
    }

    @Test
    public void setFirstName() {
        firstPerson.setFirstName("Layla");
        secondPerson.setFirstName("Felix");
        thirdPerson.setFirstName(null);
        fourthPerson.setFirstName("Mia");

        assertEquals(firstPerson.getFirstName(), "Layla");
        assertEquals(secondPerson.getFirstName(), "Felix");
        assertEquals(fourthPerson.getFirstName(), "Mia");
        assertNull(thirdPerson.getFirstName(), null);
    }

    @Test
    public void setLastName() {
        firstPerson.setLastName("Adrian");
        secondPerson.setLastName("Black");


        assertEquals(firstPerson.getLastName(), "Adrian");
        assertEquals(secondPerson.getLastName(), "Black");
    }


    @Test
    public void setPassportId() {
        firstPerson.setPassportId(5312);
        secondPerson.setPassportId(8793);

        assertEquals(firstPerson.getPassportId(), 5312);
        assertEquals(secondPerson.getPassportId(), 8793);
    }

    @Test
    public void testFirstConstructor() {
        Person one = new Person("Michael ", "Dodson");
        assertEquals(one.getFirstName(), "Michael ");
        assertEquals(one.getLastName(), "Dodson");
    }

    @Test
    public void testSecondConstructor() {
        Person two = new Person(1628);
        assertEquals(two.getPassportId(), 1628);
    }

    @Test
    public void testConstructor() {
        Person three = new Person("Jeck", "Pit", 9510);
        assertEquals(three.getFirstName(), "Jeck");
        assertEquals(three.getLastName(), "Pit");
        assertEquals(three.getPassportId(), 9510);
    }

    @Test
    public void testGender() {
        Person firstHuman = new Person("Damon", "Reeves", 9511);
        firstHuman.setGender(Gender.MALE);
        assertEquals(firstHuman.getGender(), Gender.MALE);
        Person secondHuman = new Person("Lisa", "Barker", 9060);
        secondHuman.setGender(Gender.FEMALE);
        assertEquals( secondHuman.getGender(), Gender.FEMALE);
    }
}



