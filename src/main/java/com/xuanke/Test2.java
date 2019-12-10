package com.xuanke;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test2 {
    public static void main(String[] args) {
        List<Course> lists = new ArrayList<Course>();
        lists.add(new Course("1", "语"));
        lists.add(new Course("2", "数学"));
        lists.add(new Course("3", "英语"));
        lists.add(new Course("4", "物理"));

        Student st1 = new Student("1", "小佳");
        for (Course list:lists){
            System.out.println(list.id+":"+list.name);
        }

        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; i++){
            System.out.println("请选择课程编号：");
            String courseid = scanner.next();
            for (Course list:lists){
                if (list.id.equals(courseid)){
                    st1.courses.add(list);
                }
            }
        }

        System.out.println("你输入查找的课程名称：");

        String CRNAME = scanner.next();
        Course CR = new Course();
        CR.name = CRNAME;
        System.out.println("输出结果："+st1.courses.contains(CR));


    }
}
