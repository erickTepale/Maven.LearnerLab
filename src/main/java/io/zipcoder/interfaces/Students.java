package io.zipcoder.interfaces;

import java.util.ArrayList;

public final class Students extends People{
    final private Students INSTANCE;

    public Students() {
        INSTANCE = new Students();
        INSTANCE.add(new Person((long)1, "Sput"));
        INSTANCE.add(new Person((long)2, "Nika"));
        INSTANCE.add(new Person((long)3, "Alex"));
        INSTANCE.add(new Person((long)4, "Dan"));
        INSTANCE.add(new Person((long)5, "Dridge"));
        INSTANCE.add(new Person((long)5, "Alice"));
        INSTANCE.add(new Person((long)6, "ia"));



    }
}
