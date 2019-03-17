package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class TestInstructors {

    @Test
    public void testInstructors(){
        List<String> nameList = Arrays.asList("Instructor_1", "Instructor_2", "Instructor_3");
        Instructors instructors = Instructors.getINSTANCE();
        Person[] array = instructors.toArray();


        int length = array.length;
        Assert.assertTrue(length > 0);

        for (int i = 0; i < array.length; i++) {
            Person person = array[i];
            Assert.assertTrue(nameList.contains(person.getName()));
        }
    }
}
