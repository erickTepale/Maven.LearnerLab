package io.zipcoder.interfaces;

public enum Educator implements Teacher {
    KRIS(new Instructor((long)1, "Kris"), 0.0), DOLIO(new Instructor((long)2, "Dolio"), 0.0),
    WILHELM(new Instructor((long)3, "Wilhelm"), 0.0), FROILEN(new Instructor((long)4, "Froilen"), 0.0);

    private final Instructor instructor;
    private Double timeWorked;

    Educator(Instructor a, Double timeWorked){
        this.instructor = a;
        this.timeWorked = timeWorked;
        Instructors instructors = Instructors.getInstance();
        instructors.add(instructor);
    }


    @Override
    public void teach(Learner learner, Double numberOfHours) {
       this.instructor.teach(learner, numberOfHours);
    }

    @Override
    public void lecture(Learner[] learner, Double numberOfHours) {
       this.instructor.lecture(learner, numberOfHours);
    }
}
