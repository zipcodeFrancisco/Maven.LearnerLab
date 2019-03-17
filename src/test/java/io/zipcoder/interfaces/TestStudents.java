package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestStudents {

    /**
     * Create a test method which ensures that each of the students
     * in your current cohort are in your Students singleton.
     */

    @Test
    public void testStudents(){
        List<String> nameList = Arrays.asList("Student_1", "Student_2", "Student_3");
        Students students = Students.getINSTANCE();
        Person[] array = students.toArray();


        int length = array.length;
        Assert.assertTrue(length > 0);

        for (int i = 0; i < array.length; i++) {
            Person person = array[i];
            Assert.assertTrue(nameList.contains(person.getName()));
        }
    }
}
