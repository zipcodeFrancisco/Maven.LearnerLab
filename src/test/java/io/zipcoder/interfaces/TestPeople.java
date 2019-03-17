package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPeople {

    /**
     * Create a testAdd method which ensures that our personList in our
     * People class populated with respective Person objects following
     * invokation of the add method.
     */
        People people = Students.getINSTANCE();
        @Before
        public void setup(){
            people.removeAll();
        }

    @Test
    public void testAdd(){
        // Given
//        People people = new People();
        Person person = new Person(null);
        // Then
        Assert.assertFalse(people.contains(person));
        // When
        people.add(person);
        // Then
        Assert.assertTrue(people.contains(person));
    }

    /**
     * Create a testRemove method which ensures that the personList
     * in a People object is depopulated with a respective Person object
     * following the invokation of the remove method.
     */

    @Test
    public void testRemove(){
        // Given
//        People people = new People();
        Person person = new Person(null);
        // When
        people.add(person);
        // Then
        Assert.assertTrue(people.contains(person));
        people.remove(person);
        // Then
        Assert.assertFalse(people.contains(person));
    }

    /**
     * Create a testFindById method which ensures that a respective Person object
     * with a respective id field is returned upon invokation of the findById method
     * on a respective People object.
     */

    @Test
    public void testFindById(){
//        People people = new People();
        Person person = new Person(123L);

        people.add(person);

        Person actual = people.findById(123L);

        Assert.assertEquals(person,actual);
    }

    @Test
    public void testCount(){
        // Given
//        People people = new People();
        // When
        int numberOfPersons = 10;
        for (int i = 0; i < numberOfPersons; i++) {
            people.add(new Person(null));
        }
        int actual = people.count();
        // Then
        Assert.assertEquals(numberOfPersons,actual);
    }

    @Test
    public void testRemoveById(){
        // Given
//        People people = new People();
        Person person = new Person(Long.MIN_VALUE);
        // When
        people.add(person);
        // Then
        Assert.assertTrue(people.contains(person));
        // When
        people.removeById(person.getId());
        // Then
        Assert.assertFalse(people.contains(person));
    }
}
