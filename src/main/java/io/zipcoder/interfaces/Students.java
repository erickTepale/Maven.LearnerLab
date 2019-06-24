package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People<Student>{
    private static final Students INSTANCE = new Students();


    private Students() {
        super.add(new Student((long)1, "Sput", 1.4));
        super.add(new Student((long)2, "Nika", 4.3));
        super.add(new Student((long)3, "Alex", 12.9));
        super.add(new Student((long)4, "Dan", 30.2));
        super.add(new Student((long)5, "Dridge", 12.2));
        super.add(new Student((long)5, "Alice", 13.3));
        super.add(new Student((long)6, "ia", 15.3));



    }

    public static Students getINSTANCE(){
        return INSTANCE;
    }

    @Override
    public Student[] toArray() {
        int counter = 0;
        Student [] a = new Student[INSTANCE.count()];
        for (Person each: INSTANCE ) {
            a[counter] = (Student)each;
        };

        return a;
    }
}
