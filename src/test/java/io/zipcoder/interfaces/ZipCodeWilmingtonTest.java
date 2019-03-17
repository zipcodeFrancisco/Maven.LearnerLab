package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class ZipCodeWilmingtonTest {

    @Test
    public void testHostLectureByTeacher() {
        // Given
        ZipCodeWilmington zcw = ZipCodeWilmington.getINSTANCE();
        Students students = Students.getINSTANCE();
        Instructor instructor = Instructors.getINSTANCE().findById(0L);
        int hoursPerStudent = 10;
        int totalHours = students.count() * hoursPerStudent;

        // When
        zcw.hostLecture(instructor.getId(), totalHours);
        Person[] personArray = students.toArray();
        Student[] studentArray = (Student[]) personArray;
        for (int i = 0; i < studentArray.length; i++) {
            Student student = studentArray[i];
            double totalStudyTime = student.getTotalStudyTime();
            // Then
            Assert.assertEquals(hoursPerStudent, totalStudyTime,0.0);

        }


    }

}