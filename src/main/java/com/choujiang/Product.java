package com.choujiang;

public class Product {
    public int prdid;
    public String prdname;
    public int quanzhong;
    public int no;

    public int getPrdid() {
        return prdid;
    }

    public void setPrdid(int prdid) {
        this.prdid = prdid;
    }

    public String getPrdname() {
        return prdname;
    }

    public void setPrdname(String prdname) {
        this.prdname = prdname;
    }

    public int getQuanzhong() {
        return quanzhong;
    }

    public void setQuanzhong(int quanzhong) {
        this.quanzhong = quanzhong;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public Product(){
    }

    public Product(int prdid, String prdname, int quanzhong, int no){
        this.prdid = prdid;
        this.prdname = prdname;
        this.quanzhong = quanzhong;
        this.no = no;
    }
}
