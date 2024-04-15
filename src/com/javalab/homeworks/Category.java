package com.javalab.homeworks;
public class Category {
    //카테고리 데이터
    private int cnum; // 카테고리 번호
    private String cname; // 카테고리명
    private String cexplanation; // 카데고리 설명

    public Category() {

   }

    // 카테고리 데이터
    public Category(int cnum, String cname, String cexplanation){
        this.cnum = cnum;
        this.cname = cname;
        this.cexplanation = cexplanation;
    }



    public int getCnum() {
        return cnum;
    }
    public void setCnum(int cnum){
        this.cnum = cnum;
    }
    public String getCname() {
        return  cname;
    }
    public void setCname(String cname){
        this.cname = cname;
    }
    public String getCexplanation() {
        return cexplanation;
    }
    public void setExplanation(String cexplanation) {
        this.cexplanation = cexplanation;
    }

}








