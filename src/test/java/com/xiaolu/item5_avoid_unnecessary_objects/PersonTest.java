package com.xiaolu.item5_avoid_unnecessary_objects;

import org.junit.Test;

import java.util.Date;

public class PersonTest {

    @Test
    public void isBabyBoomerTest() throws Exception {
        Date[] dates = { new Date(), new Date(), new Date() };
        for (Date date: dates) {
            Person person = new Person(date);
            System.out.println(person.isBabyBoomer());
        }
    }

    @Test
    public void person2Test() throws Exception {
        Date[] dates = { new Date(), new Date(), new Date() };
        for (Date date: dates) {
            Person2 person = new Person2(date);
            System.out.println(person.isBabyBoomer());
        }
    }

    @Test
    public void mutateBirthDateTest() throws Exception {
        Person person = new Person(new Date());
        Date date1 = person.getBirthDate();
        System.out.println(date1);
        person.getBirthDate().setYear(99);
        System.out.println(date1);
    }
}
