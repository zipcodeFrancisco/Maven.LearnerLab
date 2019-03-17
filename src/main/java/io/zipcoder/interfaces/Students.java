package io.zipcoder.interfaces;

/**
 * The class should be an unextendable subclass of the People class.
 * The class should statically instantiate a final field named INSTANCE of type Students.
 * The class should define a private nullary constructor which populates the INSTANCE field
 * with respective Student representations of your colleagues.
 * Each student should have a relatively unique id field.
 * NOTE: final keyword for a class means Prevent Inheritance.
 */
public final class Students extends People<Student>{
    // TODO Revisar
    private static final Students INSTANCE = new Students();

    private Students(){
        String[] names = {"Student_1", "Student_2", "Student_3"};
        for (Integer i = 0; i < names.length; i++) {
            Student student = new Student(i.longValue(),names[i]);
            super.add(student);
        }
    }

    public static Students getINSTANCE() {
        return INSTANCE;
    }


    @Override
    public Student[] toArray() {
        return super.personList.toArray(new Student[personList.size()]);
    }
}
