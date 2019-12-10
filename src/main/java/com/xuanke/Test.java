package com.xuanke;



import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        List<Course> courseLists = new ArrayList<Course>();
        courseLists.add(new Course("1", "数学"));
        courseLists.add(new Course("2", "语文"));
        courseLists.add(new Course("3", "英语"));
//        Course tmp = (Course) courseLists.get(0);
//        System.out.println(tmp.id+"  "+tmp.name);

//        Iterator it = courseLists.iterator();
//        while (it.hasNext()){
//            Course tmp2 = (Course) it.next();
//            System.out.println(tmp2.id + " - " + tmp2.name);
//        }
        while (true){
            System.out.println("请输入课程的名字：");
            Scanner scanner = new Scanner(System.in);
            String crname =  scanner.next();
            Course cr = new Course();
            cr.name = crname;
            System.out.println("结果："+courseLists.contains(cr));
            if(courseLists.contains(cr)){
                System.out.println("位置："+courseLists.indexOf(cr));
            }
        }


//        for (Course cr:courseLists){
//            System.out.println(cr.name);
//        }
    }
}
