package io.zipcoder.interfaces;

import org.junit.Test;

public class TestStudents {
    @Test
    public void getSingleton(){
        Students a = Students.getINSTANCE();

        System.out.println(a.findById((long)1).getId());
    }
}
