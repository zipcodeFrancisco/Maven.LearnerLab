package io.zipcoder.interfaces;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ZipCodeWilmington {

    private static final Students students = Students.getINSTANCE();
    private static final Instructors instructors = Instructors.getINSTANCE();
    private static final ZipCodeWilmington INSTANCE = new ZipCodeWilmington();

    public void hostLecture(Teacher teacher, double numberOfHours ){
        Student[] learner = Arrays.stream(students.toArray()).toArray(Student[]::new);
        teacher.lecture( students.toArray(), numberOfHours);
    }


    public void hostLecture(Long id, double numberOfHours){
        Teacher teacher = instructors.findById(id);
        hostLecture(teacher, numberOfHours);
    }

    public static ZipCodeWilmington getINSTANCE() {
        return INSTANCE;
    }
}
