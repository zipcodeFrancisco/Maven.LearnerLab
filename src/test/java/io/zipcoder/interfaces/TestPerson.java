package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestPerson {

    @Test
    public void testConstructor() {
        // Given
        Long expected = 1L;
        Person person = new Person(expected);

        // When
        Long actual = person.getId();

        // Then
        Assert.assertEquals(expected,actual);
    }

    @Test
    public void testSetName(){
        // Given
        String expected = "Coco";
        Person person = new Person(null);

        //When
        person.setName(expected);
        String actual = person.getName();

        // Then
        Assert.assertEquals(expected,actual);

    }


}
