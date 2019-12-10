package com.bijiao;

public class Student implements Comparable<Student>{
    public String id;
    public String name;

    public Student(String id, String name){
        this.id = id;
        this.name = name;
    }

    @Override
    public int compareTo(Student o) {
        return this.id.compareTo(o.id);
    }
}
