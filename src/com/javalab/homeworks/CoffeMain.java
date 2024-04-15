package com.javalab.homeworks;

public class CoffeMain {

    public static void main(String[] args) {

        Category[] categories = new Category[6];
         categories[0] = new Category(1, "Coffe", "All types of coffee drinks");
         categories[1] = new Category(2, "Latte", "Various kinds of lattes");
         categories[2] = new Category(3, "Ade/Shake", "Fresh ades and shakes");
         categories[3] = new Category(4, "Smoothie/Juice", "Healthy smoothies and juices");
         categories[4] = new Category(5, "Bakery", "Fresh baked goods");
         categories[5] = new Category(6, "Tea", "Traditional and herbal teas");

        Product[] products = new Product[6]; // 상품 데이터
        products[0] = new Product(1, "카라멜마끼아또", 1, 5000);
        products[1] = new Product(2, "홍차라떼", 2, 5000);
        products[2] = new Product(3, "오레오", 3, 5000);
        products[3] = new Product(4, "복숭아스무디", 4, 5000);
        products[4] = new Product(5, "커피콩빵", 5, 3000);
        products[5] = new Product(6, "매실차", 6, 4500);

        OrderData[] data = new OrderData[5]; // 주문데이터
        data[0] = new OrderData(38167668, "2017-09-13 10:15", 201, 1, 1);
        data[1] = new OrderData(89217297, "2017-09-13 10:20", 202, 12, 2);
        data[2] = new OrderData(39178816, "2017-09-13 10:40", 203, 13, 3);
        data[3] = new OrderData(63105816, "2017-09-13 10:05", 204, 14, 4);
        data[4] = new OrderData(47018158, "2017-09-13 11:15", 205, 15, 5);

        EmployeData[] em = new EmployeData[5]; // 사원 데이터
        em[0] = new EmployeData(201, "Alice", "사원", 30000);
        em[1] = new EmployeData(202, "Bob", "대리", 40000);
        em[2] = new EmployeData(203, "Charlie", "과장", 50000);
        em[3] = new EmployeData(204, "David", "사원", 32000);
        em[4] = new EmployeData(205, "Eve", "대리", 42000);
        printcategprie(categories); // 카테고리
        printproduct(products); // 상품
        printdate(data); // 주문
        printemployee(em); // 사원
        printproduct1(products, categories); // 카테고리 , 상품
        printdata(data, em); // 주문, 사원
    }// end main

    public static void printcategprie(Category[] categories) { // 카테고리 전부 출력
        System.out.println("카테고리번호 카테고리이름 카테고리이름");
        for (Category c : categories) {
            System.out.println(c.getCnum() + " " + c.getCname() + " " + c.getCexplanation());
        }
        System.out.println();
    }

    public static void printproduct(Product[] products) { // 상품 전부 출력
        System.out.println("상품번호 상품명 카테고리 판매단가");
        for (Product p : products) {
            System.out.println(p.getPnum() + " " + p.getPname() + " " + p.getPname1() + " " + p.getPrice());
        }
        System.out.println();
    }

    public static void printdate(OrderData[] data) { // 주문 전부 출력
        System.out.println("주문번호 주문날짜 주무처리직원id 판매상품id 판매수량");
        for (OrderData od : data) {
            System.out.println(od.getNum() + " " + od.getDay() + " " + od.getId() + " " + od.getPd() + " " + od.getQuantity());
        }
        System.out.println();
    }

    public static void printemployee(EmployeData[] em) { // 사원 전부 출력
        System.out.println("사원번호 사원명 직급 급여");
        for (EmployeData ed : em) {
            System.out.println(ed.getNum() + " " + ed.getEmployee() + " " + ed.getRank() + " " + ed.getSalary());
        }
        System.out.println();
    }

    public static void printproduct1(Product[] products, Category[] categories) { // 카테고리 번호에 따라 카테고리이름 부여
        System.out.println("상품번호 상품이름 카테고리 가격");
        for (Product p : products) {
            for (Category c : categories) {
                if (p.getPname1() == c.getCnum()) {
                    System.out.println(p.getPnum() + " " + p.getPname() + " " + c.getCname() + " " + p.getPrice());
                }
            }
        }
        System.out.println();
    }

    public static void printdata(OrderData[] data, EmployeData[] em){ // 직원id에 따른 사원이름 부여
        for(OrderData od : data){
            for(EmployeData e : em){
                if(od.getId() == e.getNum()){
                    System.out.println(od.getNum() + " " + od.getDay() + " " + e.getEmployee() + " " + od.getPd() + " " + od.getQuantity());
                }
            }
        }
    }




        }














