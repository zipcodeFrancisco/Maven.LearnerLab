package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {


    /**
     * Create a testImplementation method that asserts
     * that an Instructor is an instanceof a Teacher.
     */

    @Test
    public void testImplementation(){
        // Given
        Instructor instructor = new Instructor(null);
        // Then
        Assert.assertTrue(instructor instanceof Teacher);
    }

    /**
     * Create a testInheritance method that asserts
     * that a Instructor is an instanceof a Person.
     */

    @Test
    public void testInheritance(){
        // Given
        Instructor instructor = new Instructor(null);
        // Then
        Assert.assertTrue(instructor instanceof Person);
    }

    /**
     * Create a testTeach method that ensures when an Instructor
     * invokes the teach method, a respective student's totalStudyTime
     * instance variable is incremented by the specified numberOfHours.
     */

    @Test
    public void testTeach(){
        // Given
        Instructor instructor = new Instructor(null);
        Student learner = new Student(null);
        double numberOfHoursToBeTaught = 50;
        double preStudyTime = learner.getTotalStudyTime();
        double postStudyTime = preStudyTime + numberOfHoursToBeTaught;
        double expected = postStudyTime;

        // When
        instructor.teach(learner,numberOfHoursToBeTaught);

        // Then
        Assert.assertEquals(expected, learner.getTotalStudyTime(),0);

    }

    /**
     * Create a testLecture method that ensures when an Instructor invokes
     * the lecture method, a respective array of students' totalStudyTime
     * instance variables is incremented by numberOfHours/students.length.
     */

    @Test
    public void testLecture(){
        // Given
        Instructor instructor = new Instructor(null);
        Student learner1 = new Student(null);
        Student learner2 =  new Student(null);

        Student[] learners = new Student[]{learner1, learner2};


        double numberOfHoursToBeTaught = 20;
        double numberOfHoursToBeTaughtPerStudent = numberOfHoursToBeTaught / learners.length;

        double preStudyTime1 = learner1.getTotalStudyTime();
        double preStudyTime2 = learner2.getTotalStudyTime();

        double postStudyTime1 = preStudyTime1 + numberOfHoursToBeTaughtPerStudent;
        double postStudyTime2 = preStudyTime2 + numberOfHoursToBeTaughtPerStudent;

        double expected1 = postStudyTime1;
        double expected2 = postStudyTime2;

        instructor.lecture(learners,numberOfHoursToBeTaught);

        double actual1 = learner1.getTotalStudyTime();
        double actual2 = learner2.getTotalStudyTime();

        Assert.assertEquals(expected1,actual1,0);
        Assert.assertEquals(expected2,actual2,0);
    }




}
