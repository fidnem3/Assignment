package com.javalab.data;

import com.javalab.domain.Category;
import com.javalab.domain.Employee;
import com.javalab.domain.Order;
import com.javalab.domain.Product;

import java.util.ArrayList;

public class Database {
    // 카테고리 ArratList 생성
    private ArrayList<Category> categories = new ArrayList<>();
    // 상품 ArratList 생성
    private ArrayList<Product> products = new ArrayList<>();
    // 사원 ArratList 생성
    private ArrayList<Employee> employees = new ArrayList<>();
    // 주문 ArratList 생성
    private ArrayList<Order> orders = new ArrayList<>();

    // getter/ setter 메소드
    public ArrayList<Category> getCategories() {
        return categories;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public ArrayList<Order> getOrders() {
        return orders;
    }

    public Database() {
        ArrayListData();
    }

    public void ArrayListData() {
        //데이터 생성- ArratList에 데이터 추가
        categories.add(new Category(1, "Coffee", "All types of coffee drinks"));
        categories.add(new Category(2, "Latte", "Various kinds of lattes"));
        categories.add(new Category(3, "Ade/Shake", "Fresh ades and shakes"));
        categories.add(new Category(4, "Smoothie/Juice", "Healthy smoothies and juices"));
        categories.add(new Category(5, "Bakery", "Fresh baked goods"));
        categories.add(new Category(6, "Tea", "Traditional and herbal teas"));

        // 상품 저장용 ArrayList에 상품 객체 추가
        products.add(new Product(1, "카라멜마끼아또", 1, 5000));
        products.add(new Product(2, "홍차라떼", 2, 5000));
        products.add(new Product(3, "초코라떼", 2, 5000));
        products.add(new Product(4, "오레오", 3, 5000));
        products.add(new Product(5, "카라멜마끼아또", 1, 5000));
        products.add(new Product(6, "초코라떼", 2, 4500));
        products.add(new Product(7, "복숭아스무디", 4, 5000));
        products.add(new Product(8, "커피콩빵", 5, 3000));
        products.add(new Product(9, "바니라라떼", 1, 5000));
        products.add(new Product(10, "매실차", 6, 4500));
        products.add(new Product(11, "깔라만시", 6, 4500));
        products.add(new Product(12, "카페라떼", 1, 4000));
        products.add(new Product(13, "헤이즐넛라떼", 1, 5000));
        products.add(new Product(14, "카라멜마끼아또", 1, 5000));
        products.add(new Product(15, "아메리카노", 1, 4000));
        products.add(new Product(16, "캐모마일", 6, 4500));
        products.add(new Product(17, "아포가또", 3, 5500));
        products.add(new Product(18, "비엔나커피", 1, 5000));
        products.add(new Product(19, "베이글", 5, 3500));
        products.add(new Product(20, "카푸치노", 1, 4000));
        products.add(new Product(21, "허니브레드", 5, 6000));
        products.add(new Product(22, "카페모카", 1, 5000));
        products.add(new Product(23, "얼그레이", 6, 4500));
        products.add(new Product(24, "히비아이스트", 3, 5000));
        products.add(new Product(25, "플레인 와플", 5, 6000));
        products.add(new Product(26, "요거트", 3, 5500));
        products.add(new Product(27, "유자스무디", 4, 5000));
        products.add(new Product(28, "딸기스무디", 4, 5000));

        // 사원 저장용 ArrayList에 사원 객체 추가
        employees.add(new Employee(201, "Alice", "사원", 30000));
        employees.add(new Employee(202, "Bob", "대리", 40000));
        employees.add(new Employee(203, "Charlie", "과장", 50000));
        employees.add(new Employee(204, "David", "사원", 32000));
        employees.add(new Employee(205, "Eve", "대리", 42000));

        // 주문 저장용 ArrayList에 주문 객체 추가
        orders.add(new Order(38167668, "2017-09-13 10:15", 1, 201, 1));
        orders.add(new Order(89217297, "2017-09-13 10:20", 2, 201, 1));
        orders.add(new Order(39178816, "2017-09-13 10:40", 3, 201, 1));
        orders.add(new Order(63105816, "2017-09-13 10:05", 4, 201, 1));
        orders.add(new Order(47018158, "2017-09-13 11:15", 5, 201, 1));
        orders.add(new Order(46078737, "2017-09-13 11:25", 6, 201, 1));
        orders.add(new Order(32215456, "2017-09-13 11:35", 7, 201, 1));
        orders.add(new Order(60728464, "2017-09-13 11:45", 8, 201, 1));
        orders.add(new Order(99145980, "2017-09-13 11:50", 9, 201, 1));
        orders.add(new Order(65700654, "2017-09-13 12:05", 8, 201, 1));
        orders.add(new Order(65700654, "2017-09-13 12:00", 7, 201, 1));
        orders.add(new Order(65700654, "2017-09-13 12:00", 6, 201, 1));
        orders.add(new Order(65700654, "2017-09-13 12:00", 5, 201, 1));
        orders.add(new Order(54449843, "2017-09-13 12:10", 4, 201, 1));
        orders.add(new Order(66578200, "2017-09-13 12:15", 3, 201, 1));
        orders.add(new Order(79287280, "2017-09-13 12:35", 3, 201, 1));
        orders.add(new Order(56679560, "2017-09-13 12:50", 6, 201, 1));
        orders.add(new Order(39865396, "2017-09-13 12:55", 4, 201, 1));
        orders.add(new Order(49791945, "2017-09-13 13:15", 6, 201, 1));
        orders.add(new Order(49791945, "2017-09-13 13:15", 8, 201, 1));
        orders.add(new Order(49791945, "2017-09-13 13:15", 11, 201, 1));
        orders.add(new Order(49791945, "2017-09-13 13:15", 12, 201, 1));
        orders.add(new Order(73592627, "2017-09-13 13:30", 13, 201, 1));
        orders.add(new Order(57111296, "2017-09-13 13:45", 14, 201, 1));
        orders.add(new Order(57111296, "2017-09-13 13:45", 15, 201, 1));
        orders.add(new Order(57111296, "2017-09-13 13:45", 16, 201, 1));
        orders.add(new Order(57111296, "2017-09-13 13:45", 17, 201, 1));
        orders.add(new Order(69598408, "2017-09-13 13:05", 18, 201, 1));
        orders.add(new Order(69598408, "2017-09-13 13:05", 19, 201, 1));
        orders.add(new Order(69598408, "2017-09-13 13:05", 20, 201, 1));
        orders.add(new Order(69598408, "2017-09-13 13:05", 23, 201, 1));
        orders.add(new Order(67173436, "2017-09-13 14:30", 22, 201, 1));
        orders.add(new Order(67173436, "2017-09-13 14:30", 23, 201, 1));
        orders.add(new Order(67173436, "2017-09-13 14:30", 24, 201, 1));
        orders.add(new Order(67173436, "2017-09-13 14:30", 25, 201, 1));
        orders.add(new Order(36320862, "2017-09-13 14:35", 26, 201, 1));
        orders.add(new Order(71781108, "2017-09-13 14:05", 27, 201, 1));
        orders.add(new Order(55756203, "2017-09-13 14:55", 28, 201, 1));
        orders.add(new Order(55756203, "2017-09-13 14:55", 19, 201, 1));
        orders.add(new Order(55756203, "2017-09-13 14:55", 20, 201, 1));
        orders.add(new Order(55756203, "2017-09-13 14:55", 22, 201, 1));
        orders.add(new Order(22817525, "2017-09-13 15:00", 23, 201, 1));
        orders.add(new Order(55183914, "2017-09-13 15:15", 11, 201, 1));
        orders.add(new Order(39118494, "2017-09-13 15:40", 12, 201, 1));
        orders.add(new Order(56152549, "2017-09-13 15:45", 13, 201, 1));
        orders.add(new Order(44004393, "2017-09-13 16:45", 14, 201, 1));
        orders.add(new Order(57522351, "2017-09-13 16:55", 15, 201, 1));
        orders.add(new Order(57522351, "2017-09-13 16:55", 17, 201, 1));
        orders.add(new Order(57522351, "2017-09-13 16:55", 19, 201, 1));
        orders.add(new Order(57522351, "2017-09-13 16:55", 29, 201, 1));
        orders.add(new Order(97267860, "2017-09-13 17:40", 28, 201, 1));
        orders.add(new Order(23534034, "2017-09-13 17:55", 27, 201, 1));
        orders.add(new Order(91629257, "2017-09-13 18:20", 26, 201, 1));
        orders.add(new Order(37776984, "2017-09-13 19:15", 25, 201, 1));
        orders.add(new Order(46888645, "2017-09-13 19:20", 24, 201, 1));
        orders.add(new Order(47293154, "2017-09-13 19:25", 13, 201, 1));
        orders.add(new Order(34402591, "2017-09-13 20:25", 1, 201, 1));
        orders.add(new Order(75967086, "2017-09-13 20:45", 2, 201, 1));
        orders.add(new Order(41288267, "2017-09-13 20:55", 3, 201, 1));
        orders.add(new Order(38559076, "2017-09-13 21:25", 4, 201, 1));
        orders.add(new Order(16229001, "2017-09-13 21:40", 5, 201, 1));
        orders.add(new Order(59480814, "2017-09-13 22:00", 14, 201, 1));
        orders.add(new Order(96791246, "2017-09-13 22:10", 15, 201, 1));
        orders.add(new Order(50021775, "2017-09-13 22:35", 16, 201, 1));
        orders.add(new Order(55861805, "2017-09-13 22:40", 17, 201, 1));
        orders.add(new Order(68585789, "2017-09-13 22:50", 18, 201, 1));
        orders.add(new Order(92127744, "2017-09-13 22:55", 21, 201, 1));
        orders.add(new Order(92127744, "2017-09-13 22:55", 22, 201, 1));
        orders.add(new Order(92127744, "2017-09-13 22:55", 23, 201, 1));
        orders.add(new Order(92127744, "2017-09-13 22:55", 24, 201, 1));
        orders.add(new Order(94113278, "2017-09-13 23:15", 15, 201, 1));
        orders.add(new Order(17708771, "2017-09-13 23:20", 16, 201, 1));
        orders.add(new Order(71621027, "2017-09-13 23:25", 17, 201, 1));
        orders.add(new Order(49305845, "2017-09-13 23:45", 12, 201, 1));
    }
}