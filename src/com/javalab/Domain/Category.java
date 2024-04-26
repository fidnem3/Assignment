package com.javalab.Domain;



/**
 * 카테고리 클래스
 * - 속석(멤버 변수) : 카테고리id, 카테고리명, 카테고리설명
 */
public class Category {
    // 속성 정의 (멤버변수 , 필드)
    private int categortId; // 카테고리id
    private String name; // 카테고리명
    private String description; // 카테고리설명

    // 생성자
    public Category() {

    }
    //생성자 2
    public Category(int categortId, String name, String description){
        this.categortId = categortId;
        this.name = name;
        this.description = description;
    }

    // getter setter 메서드
    // categortId getter, setter
    public int getCategortId() {
        return categortId;
    }
    public void setCategortId(int categortId){
        this.categortId = categortId;
    }
    //2. name getter setter
    public String getName() {
        return name;
    }
    public void setNam(String nam) {
        this.name = name;
    }
    // description getter setter
    public String getDescription() {
        return description;
    }
    public void setDescription(String description){
        this.description = description;
    }

}
