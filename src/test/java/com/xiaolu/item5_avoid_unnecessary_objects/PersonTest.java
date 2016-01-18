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

}
