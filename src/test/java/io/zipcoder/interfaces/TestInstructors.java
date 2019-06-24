package io.zipcoder.interfaces;

import org.junit.Test;

public class TestInstructors {

    @Test
    public void getInstance(){
        Instructors a = Instructors.getInstance();

        System.out.println(a.count());
    }
}
