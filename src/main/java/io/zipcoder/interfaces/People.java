package io.zipcoder.interfaces;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

public abstract class People<E extends Person> implements Iterable<Person>{
    private List<Person> personList = new ArrayList<Person>();

    public void add(Object E){
        personList.add((Person) E);
    }

    public Person findById(Object E){
        for (Person person : personList) {
            if (person.getId().equals(E))
                return person;
        }

        return null;
    }

    public Boolean contains(Person a){
        for (Person person : personList) {
            if (person.equals(a))
                return true;
        }
        return false;
    }

    public void remove(Person a){
      if(contains(a))
          personList.remove((int)getIndexOf(a));

    }

    public void remove(Long id){
        Person a = findById(id);
        if(a != null)
            personList.remove((int)getIndexOf(a));
    }

    public Integer getIndexOf(Person a){
        for (int i = 0; i < personList.size(); i++){
            if (personList.get(i).equals(a))
                return i;
        }

        return -1;
    }

    public void removeAll(){
        personList.clear();
    }

    public Integer count(){
        return personList.size();
    }

    public abstract E[] toArray();

//    public E[] toArray(){
//        return (E[])personList.toArray();
//    }

    @Override
    public Iterator iterator() {
        return personList.iterator();
    }

}

