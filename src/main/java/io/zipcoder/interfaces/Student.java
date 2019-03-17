package io.zipcoder.interfaces;

public class Student extends Person implements Learner {

    private double totalStudyTime = 0L;

    public Student(){
        this(Long.MIN_VALUE,"");
    }


    public Student(Long id) {
        super(id);
    }

    public Student(Long id, String name){
        super(id,name);
    }

    public void learn(double numberOfHours) {
        totalStudyTime += numberOfHours;
    }

    public Double getTotalStudyTime(){
        return totalStudyTime;
    }
}
