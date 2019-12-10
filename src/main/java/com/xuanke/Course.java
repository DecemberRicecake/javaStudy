package com.xuanke;
/**
 * 课程类
 */

public class Course {
    public String id;
    public String name;

    public Course(String id, String name){
        this.id = id;
        this.name = name;
    }

    public Course(){

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        return name != null ? name.equals(course.name) : course.name == null;

    }

    @Override
    public int hashCode() {
        return name != null ? name.hashCode() : 0;
    }
}
