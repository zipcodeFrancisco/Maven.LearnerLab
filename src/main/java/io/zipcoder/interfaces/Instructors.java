package io.zipcoder.interfaces;

public class Instructors extends People<Instructor> {

    private static final Instructors INSTANCE = new Instructors();


    private Instructors(){
        String[] names = {"Instructor_1", "Instructor_2", "Instructor_3"};
        for (Integer i = 0; i < names.length; i++) {
            Instructor instructor = new Instructor(i.longValue(), names[i]);
            super.add(instructor);
        }
    }

    public static Instructors getINSTANCE() {
        return INSTANCE;
    }

    @Override
    public Instructor[] toArray() {
        return super.personList.toArray(new Instructor[personList.size()]);
    }
}
