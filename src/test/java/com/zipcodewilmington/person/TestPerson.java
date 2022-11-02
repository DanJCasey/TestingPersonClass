package com.zipcodewilmington.person;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by leon on 2/12/18.
 */
public class TestPerson {
    @Test
    public void testDefaultConstructor() {
        // Given
        String expectedName = "";
        Integer expectedAge = Integer.MAX_VALUE;

        // When
        Person person = new Person();

        // Then
        String actualName = person.getName();
        Integer actualAge = person.getAge();

        assertEquals(expectedName, actualName);
        assertEquals(expectedAge, actualAge);
    }

    @Test
    public void testConstructorWithName() {
        // Given
        String expected = "Leon";

        // When
        Person person = new Person(expected);

        // Then
        String actual = person.getName();
        assertEquals(expected, actual);
    }

    @Test
    public void testConstructorWithAge() {
        // Given
        Integer expected = 5;

        // When
        Person person = new Person(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }


    @Test
    public void testConstructorWithNameAndAge() {
        // Given
        Integer expectedAge = 5;
        String expectedName = "Leon";

        // When
        Person person = new Person(expectedName, expectedAge);

        // Then
        Integer actualAge = person.getAge();
        String actualName = person.getName();

        assertEquals(expectedAge, actualAge);
        assertEquals(expectedName, actualName);
    }

    @Test
    public void testSetName() {
        // Given
        Person person = new Person();
        String expected = "Leon";

        // When
        person.setName(expected);
        String actual = person.getName();

        // Then
        assertEquals(expected, actual);
    }

    @Test
    public void testSetAge() {
        // Given
        Person person = new Person();
        Integer expected = 5;

        // When
        person.setAge(expected);

        // Then
        Integer actual = person.getAge();
        assertEquals(expected, actual);
    }

    @Test
    public void testSetWeight() {
        Person person = new Person();
        double expected = 250.5;
        double delta = 0.0;

        person.setWeight(expected);

        double actual = person.getWeight();
        //assertEquals(expected, actual);
        assertEquals(250.5, actual, delta);
    }

    @Test
    public void testSetEyeColor() {
        // Given
        Person person = new Person();
        String expected = "yellow";

        // When
        person.setEyeColor(expected);
        String actual = person.getEyeColor();

        // Then
        assertEquals(expected, actual);


    }
    @Test
    public void testSetIsAlive() {
        Person person = new Person();
        boolean expected = true;

        person.setAlive(expected);
        boolean actual = person.getIsAlive();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetHairColor(){
        Person person = new Person();
        String expected = "Blue and Pink";

        person.setHairColor(expected);
        String actual = person.getHairColor();

        assertEquals(expected, actual);
    }

    @Test
    public void testSetShoeSize() {
        Person person = new Person();
        double expected = 11;
        double delta = 0;

        person.setShoeSize(expected);
        double actual = person.getShoeSize();

        assertEquals(expected, actual, delta);
    }

}
