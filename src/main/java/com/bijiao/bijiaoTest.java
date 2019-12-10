package com.bijiao;

import java.util.*;

public class bijiaoTest {
    public static void main(String[] args){
        List<Student> students = new ArrayList<Student>();
        students.add(new Student("6", "A"));
        students.add(new Student("2", "1B"));
        students.add(new Student("7", "C"));
        students.add(new Student("4", "D"));

        Collections.sort(students);
        for (Student student:students){
            System.out.println("学生"+student.id+" "+student.name);
        }

        System.out.println("------------");

        Collections.sort(students, new Compare());
        for (Student student:students){
            System.out.println("学生"+student.id+" "+student.name);
        }
    }
}
