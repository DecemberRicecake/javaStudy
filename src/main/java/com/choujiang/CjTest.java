package com.choujiang;

import java.util.*;
import java.util.stream.Collectors;

public class CjTest {

    public Map<Integer, Product> prdlists = new HashMap<Integer, Product>();

    public CjTest(){
        prdlists.put(1,new Product(1, "A产品", 61, 1));
        prdlists.put(2,new Product(2, "B产品", 54,2));
        prdlists.put(3,new Product(3, "C产品", 19,3));
        prdlists.put(4,new Product(4, "D产品", 2,1));
        prdlists.put(5,new Product(5, "E产品", 168,2));
        prdlists.put(6,new Product(6, "F产品", 33,6));
    }

    public void CjInit(int[] cjlist){
        //创建一个产品list对象
        List<Product> chooselists = new ArrayList<Product>();

        //取出权重并计算权重之和
        double qzsum = 0;
        for (int cj:cjlist){
            chooselists.add(prdlists.get(cj));
            qzsum += prdlists.get(cj).quanzhong;
        }
        System.out.println("权重求和： " + qzsum);

        //产品list按排序值“no”排序
        List<Product> newList = chooselists.stream().sorted(Comparator.comparing(Product::getNo))
                .collect(Collectors.toList());

        System.out.print("第一次排序后的结果：");
        for (Product newprd:newList){
            System.out.print(newprd.prdid+" ");
        }
        System.out.print("\n");


        //计算出3个间隔点
        int[] points = new int[3];
        int point_tmp = 0;
        for (int i=0; i<newList.size()-1; i++){
            point_tmp += (int)Math.floor(newList.get(i).quanzhong*100/qzsum);
            points[i] = point_tmp;
        }

        //列表的第一位随机抽取
        int index = gailv(points);

        //移动抽中的那个产品到list的第0位
        newList.add(0, newList.get(index));
        newList.remove(index+1);

        //输出最后的结果
        System.out.print("最后的顺序：");
        for (Product newprd:newList){
            System.out.print(newprd.prdid+" ");
        }
        System.out.print("\n");
    }

    public Integer gailv(int[] points){
        //随机1~100的数字
        Random r = new Random();
        int r_int = r.nextInt(101) + 1;
        if (r_int<=points[0]){
            return 0;
        }else if (r_int<=points[1]){
            return 1;
        }else if (r_int<=points[2]){
            return 2;
        }else return 3;
    }

    public static void main(String[] args) {
        CjTest cj = new CjTest();
        // 输入前4个的prdid列表
        int cjlist[] = {1, 2, 4, 5};
        // 抽奖
        cj.CjInit(cjlist);
    }
}
