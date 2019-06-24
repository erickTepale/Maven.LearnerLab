package io.zipcoder.interfaces;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.zip.ZipInputStream;

public final class ZipCodeWilmington {
    private final static ZipCodeWilmington zipCode = new ZipCodeWilmington();
    private Students students;
    private Instructors instructors;

    private ZipCodeWilmington(){
        students = Students.getINSTANCE();
        instructors = Instructors.getInstance();

    }

    public void hostLecture(Teacher teacher, Double numberOfHours){
        teacher.lecture(students.toArray(), numberOfHours);
    }

    public void hostLecture(Long id, Double numberOfHours){
        Instructor a = (Instructor) instructors.findById((long)id);
        a.lecture(students.toArray(), numberOfHours);
    }

    public Map<Student, Double> getStudyMap(){
        HashMap<Student, Double> studyMap = new HashMap<>();

        for (Object student : students) {
            Student a = (Student) student;
            studyMap.put(a, a.getTotalStudyTime());
        }

        return studyMap;
    }

    public static ZipCodeWilmington getInstance(){
        return zipCode;
    }
}
