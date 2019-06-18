package io.zipcoder.interfaces;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPerson {
    private Person person;


    public TestPerson(){
        person = new Person((long)1, "bleh");
    }

    @Before
    public void reset(){
        person = new Person((long)1, "bleh");
    }

    @Test
    public void testConstructor(){
        //actual
        String name = person.getName();
        Long id = person.getId();

        //expected
        String expectedName = "bleh";
        Long expectedId = (long)1;

        Assert.assertEquals(expectedId, id);
        Assert.assertEquals(expectedName, name);

    }

    @Test
    public void testSetName(){
        //expected
        String name = "superBleh";

        //action
        person.setName(name);


        Assert.assertEquals(name, person.getName());
    }


}
