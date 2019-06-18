package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestInstructor {
    @Test
    public void testImplementation(){
        Instructor a = new Instructor((long)1.0, "bleh");

        Assert.assertTrue(a instanceof Teacher);
    }

    @Test
    public void testInheritance(){
        Instructor a = new Instructor((long)1.0, "bleh");

        Assert.assertTrue(a instanceof Person);
    }

    @Test
    public void testTeach(){
        Instructor a = new Instructor((long)1.0, "bleh");
        Student student = new Student();

        //action
        a.teach(student, 10.0);

        Assert.assertEquals(10, student.getTotalStudyTime(), .5);
    }

    @Test
    public void testLecture(){
        Instructor a = new Instructor((long)1.0, "bleh");
        Student [] student = new Student[]{new Student(),
                                            new Student(),
                                            new Student(),
                                            new Student()};

        //action
        a.lecture(student, 12.0);

        Assert.assertEquals(3, student[0].getTotalStudyTime(), .5);
    }
}
