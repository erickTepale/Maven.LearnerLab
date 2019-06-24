package io.zipcoder.interfaces;

public class Student extends Person implements Learner{
    private Double totalStudyTime;

    public Student(){
        super((long)1, "bleh");
        totalStudyTime = 0.0;
    }

    public Student(Double numberHours){
        this();
        totalStudyTime = numberHours;
    }

    public Student(Long id, String name){
        super(id, name);
    }

    public Student(Long id, String name, Double studyTime){
        super(id, name);
        this.totalStudyTime = studyTime;
    }

    public void learn(Double numberOfHours) {
        totalStudyTime+= numberOfHours;
    }

    public Double getTotalStudyTime() {
        return totalStudyTime;
    }

}
