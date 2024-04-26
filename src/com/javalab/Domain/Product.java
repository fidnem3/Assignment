package com.javalab.Domain;



/**
 * 싱픔 도메인 클래스
 * - 속성(멤버변수) : 상품 id, 상품명, 카테고리id, 상품가격
 */
public class Product {
    // 1. 필드, 속성, 멤버 변수
    private int productId; // 상품id, 상품을 유이크하게 구분
    private String name; // 상풍명
    private int catrgoryId; // 카테고리id, 어떤 카테고리에 속하는지
    private  int price; // 상품 가격

    // 2.기본생성자, 파라미터가 없는 생성자
    public Product() {

    }
     //3. 생성자, 파라미터가 있는 생성자
    public Product(int catrgoryId, String name, int productId, int price){
        this.catrgoryId = catrgoryId;
        this.name = name;
        this.productId = productId;
        this.price = price;
    }

    // getter setter
    public int getCatrgoryId() {
        return catrgoryId;
    }
    public void setCatrgoryId() {
        this.catrgoryId = catrgoryId;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getProductId() {
        return productId;
    }
    public void setProductId(int productId) {
        this.productId = productId;
    }
    public int getPrice() {
        return price;
    }
    public void setPrice(int price){
        this.price = price;

    }



}
