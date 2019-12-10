package com.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class mapTest {
    public Map<String, Student> students;

    mapTest(){
        this.students = new HashMap<String, Student>();
    }


    public void puttest(){
        Scanner scanner = new Scanner(System.in);
        for (int i=0; i<3; ){
            System.out.println("输入学生ID:");
            String id_tmp = scanner.next();
            Student st = students.get(id_tmp);
            if(st == null){
                System.out.println("请输入学生姓名:");
                String name_tmp = scanner.next();
                Student st_tmp = new Student(id_tmp, name_tmp);
                students.put(id_tmp, st_tmp);
                i++;
            }else {
                System.out.println("学生已存在");
            }
        }
    }

    public void settest(){
        Set<String> keysets = students.keySet();
        System.out.println("学生数量："+students.size());
        for (String keyset:keysets){
            Student st = students.get(keyset);
            if (st != null){
                System.out.println(st.name);
            }
        }
    }

    public void removeTest(){
        System.out.println("输入要删除学生的id：");
        Scanner scanner = new Scanner(System.in);
        String ID = scanner.next();
        Student st = students.get(ID);
        if (st == null){
            System.out.println("学生不存在！");
        }else {
            students.remove(ID);
            System.out.println("删除成功");
        }
    }

    public void entryTest(){
        Set<Map.Entry<String, Student>> entrySet = students.entrySet();
        for (Map.Entry<String, Student>entry:entrySet){
            System.out.println(entry.getKey());
            System.out.println(entry.getValue().name);
        }
    }

    public void xiugai(){
        System.out.println("请输入修改学生ID");
        Scanner scanner = new Scanner(System.in);
        while (true){
            String xueid = scanner.next();
            Student student = students.get(xueid);
            if (student == null){
                System.out.println("该学生不存在");
                continue;
            }else {
                System.out.println("当前学生名字："+ student.name);
                System.out.println("请输入修改的学生名字：");
                String newname = scanner.next();
                students.put(xueid, new Student(xueid, newname));
                break;
            }
        }
    }


    public static void main(String[] args) {
        mapTest mt = new mapTest();
        mt.puttest();
//        mt.settest();
//        mt.removeTest();
        mt.xiugai();
        mt.entryTest();
    }

}
