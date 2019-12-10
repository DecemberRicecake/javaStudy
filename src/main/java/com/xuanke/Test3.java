package com.xuanke;

import java.util.ArrayList;
import java.util.List;

public class Test3 {
    public static void main(String[] args) {
        List crlists = new ArrayList();
        crlists.add(new Course("1", "YU"));
        crlists.add(new Course("2", "SHU"));
        crlists.add(new Course("3", "WAI"));
        crlists.set(1, new Course("4", "SSS"));
        crlists.remove(0);
        for (Object obj:crlists){
            Course cr = (Course)obj;
            System.out.println(cr.name);
        }

    }
}
