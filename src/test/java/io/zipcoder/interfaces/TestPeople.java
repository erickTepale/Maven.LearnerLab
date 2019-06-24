//package io.zipcoder.interfaces;
//
//import org.junit.Assert;
//import org.junit.Before;
//import org.junit.Test;
//
//import java.util.ArrayList;
//import java.util.List;
//
//public class TestPeople {
//    private Student people;
//
//    @Before
//    public void before(){
//        people = new Student();
//    }
//
//    @Test
//    public void testAdd(){
//        //People people = new People();
//        people.add(new Person((long)1, "Ay"));
//        people.add(new Person((long)2, "Be"));
//        people.add(new Person((long)3, "Cee"));
//
//        Assert.assertEquals(Integer.valueOf(3), people.count());
//    }
//
//    @Test
//    public void testRemovePeople(){
//        ArrayList<Person> a = new ArrayList<>();
//        a.add(new Person((long)1, "Ay"));
//        a.add(new Person((long)2, "Be"));
//
//        People people = new People();
//        Person cee = new Person((long)3, "Cee");
//        people.add(cee);
//
//
//        people.remove(cee);
//        Assert.assertFalse(people.contains(cee));
//    }
//
//    @Test
//    public void testRemoveIndex(){
//        ArrayList<Person> a = new ArrayList<>();
//        a.add(new Person((long)1, "Ay"));
//        a.add(new Person((long)2, "Be"));
//
//        People people = new People();
//        Person cee = new Person((long)3, "Cee");
//        people.add(cee);
//
//
//        people.remove((long) 3);
//        Assert.assertFalse(people.contains(cee));
//    }
//
//    @Test
//    public void testFindById(){
//        ArrayList<Person> a = new ArrayList<>();
//        a.add(new Person((long)1, "Ay"));
//        a.add(new Person((long)2, "Be"));
//
//        People people = new People();
//        Person cee = new Person((long)3, "Cee");
//        people.add(cee);
//
//        Person bleh = people.findById((long)3);
//        Assert.assertEquals(cee, bleh );
//    }
//}
