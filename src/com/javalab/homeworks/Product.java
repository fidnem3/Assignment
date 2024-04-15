package com.javalab.homeworks;
public class Product {
    // 상품 데이터
    private int pnum; // 상품번호
    private String pname; // 상품명
    private int pname1; //카테고리
    private int price; // 판맨단가

    public Product() {

    }


    public Product(int pnum, String pname, int pname1, int price){
        this.pnum = pnum;
        this.pname = pname;
        this.pname1 = pname1;
        this.price = price;
    }
    // 상품 데이터
    public int getPnum() {
        return pnum;
    }

    public void setPnum(int pnum) {
        this.pnum = pnum;
    }

    public String getPname() {
        return pname;

    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public int getPname1() {
        return pname1;
    }

    public void setPname1(int pname1) {
        this.pname1 = pname1;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
