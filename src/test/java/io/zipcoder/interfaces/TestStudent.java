package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {


    /**
     * testImplementation - Asserts that a Student is and instanceof a Learner
     */
    @Test
    public void testImplementation(){
        // Given , Then
        Assert.assertTrue(new Student(null) instanceof Learner);
    }

    /**
     * testInheritance - Asserts that a Studen is an instanceof a Person
     */
    @Test
    public void testInheritance(){
        Assert.assertTrue(new Student(null) instanceof Person);
    }

    /**
     * testLearn - Ensures a Student's totalStudyTime instance variable
     * is incremented by the specified numberOfHours by invoking the
     * .learn method.
     */

    @Test
    public void testLearn(){
        // Given
        double expected = 10.0;
        Student student = new Student(null);

        // When
        student.learn(expected);
        double actual = student.getTotalStudyTime();

        // Then
        Assert.assertEquals(expected,actual,0);
    }

}
