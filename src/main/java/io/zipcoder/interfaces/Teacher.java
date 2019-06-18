package io.zipcoder.interfaces;

public interface Teacher {
    public void teach(Learner learner, Double numberOfHours);
    public void lecture(Learner[] learner, Double numberOfHours);
}
