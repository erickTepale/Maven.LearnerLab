package io.zipcoder.interfaces;

public class Instructors extends People<Instructor>{
    private static final Instructors INSTANCE = new Instructors();

    private Instructors(){
        super.add(new Instructor((long)10, "Kris"));
        super.add(new Instructor((long)10, "Dolio"));
        super.add(new Instructor((long)10, "Wilhelm"));
        super.add(new Instructor((long)10, "Froilen"));

    }

    public static Instructors getInstance(){
        return INSTANCE;
    }


    @Override
    public Instructor[] toArray() {
        int counter = 0;
        Instructor [] a = new Instructor[INSTANCE.count()];
        for (Person each: INSTANCE ) {
            a[counter] = (Instructor)each;
        };

        return a;
    }
}
