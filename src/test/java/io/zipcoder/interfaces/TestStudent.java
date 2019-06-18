package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Test;

public class TestStudent {

    @Test
    public void testImplementation(){
        Student a = new Student();

        Assert.assertTrue(a instanceof Learner);
    }

    @Test
    public void testInheritance(){
        Student a = new Student();

        Assert.assertTrue(a instanceof Person);
    }

    @Test
    public void testLearn(){
        Student a = new Student();

        a.learn(3.0);

        Assert.assertEquals(3.0, a.getTotalStudyTime(), .5);
    }
}
