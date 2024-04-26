package com.javalab.homeworks;

import com.javalab.Data.Database;
import com.javalab.Domain.Category;
import com.javalab.Domain.Employee;
import com.javalab.Domain.Order;
import com.javalab.Domain.Product;

import java.util.ArrayList;

public class Home6 {
    public static void main(String[] args) {
        // 데이터베이스 생성
        Database db = new Database();
        // 카테고리 객체 얻고 정보 출력
        ArrayList<Category> categories = db.getCategories();
        shwoCategoryList(categories);
        // 상품 객체 얻고 정보 출력
        ArrayList<Product> products = db.getProducts();
        showProductList(products);
        // 사원 객체 얻고 정보 출력
        ArrayList<Employee> employees = db.getEmployees();
        showEmployeeList(employees);
        // 주문 객체 얻고 정보 출력
        ArrayList<Order> orders = db.getOrders();
        showOrderList(orders);
        //카페관리시스템에서 주문 ArrayList의 목록에 상품명과 사원명이 나오도록 출력합니다.
        showArratList(orders, products, employees);

    }// end of main
    public static void shwoCategoryList(ArrayList<Category> categories){
        System.out.println("카테고리 정보");
        System.out.println("카테고리번호\t카테고리명\t설명");
        System.out.println("=========================");
        for(Category category : categories){
            System.out.println(category.getCategortId() + " \t" + category.getName() + "\t" +
                    category.getDescription());
        }
    }
    public static void showProductList(ArrayList<Product> products){
        System.out.println("상품 정보");
        System.out.println("상품 번호\t상품명\t카테고리id\t가격");
        System.out.println("===============================");
        for(Product product : products) {
            System.out.println(product.getProductId() + "\t" + product.getName()
                    + "\t" + product.getCatrgoryId() + "\t" + product.getPrice());
        }
    }
    public static void showEmployeeList(ArrayList<Employee> employees) {
        System.out.println("사원 정보");
        System.out.println("직원id\t지원명\t직급명\t전화번호");
        System.out.println("=========================");
        for (Employee employee : employees) {
                System.out.println(employee.getEmployeeId() + "\t" + employee.getName() + "\t" +
                        employee.getEmployeeId() + "\t" + employee.getSalary());
        }
    }

    public static void showOrderList(ArrayList<Order> orders) {
        System.out.println("주문 정보");
        System.out.println("주문id\t주문일자\t사원번호\t상품번호\t수량\t금액");
        System.out.println("===========================================");
        for (Order order : orders) {
            System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                    order.getEmployeeId() + "\t" + order.getProductId() + "\t" + order.getQuantity());
        }
    }
    public static void showArratList(ArrayList<Order> orders, ArrayList<Product> products, ArrayList<Employee> employees) {
        System.out.println("주문 정보");
        System.out.println("주문id\t주문일자\t상품명\t수량\t담당직원명");
        System.out.println("===========================================");
        for (Order order : orders) {
            int c1 = order.getProductId();
            int c3 = order.getEmployeeId();
            String c2 = " ";
            if(c1 != 0) {
                for (Product product : products) {
                    if (product.getCatrgoryId() == c1) {
                        c2 = product.getName();
                        break;
                    }
                }String c4 = " ";
                for (Employee employee : employees){
                    if(employee.getEmployeeId() == c3){
                        c4 = employee.getName();
                        break;
                    }
                }
                System.out.println(order.getOrderId() + "\t" + order.getOrderDate() + "\t" +
                        c2 + "\t" + order.getQuantity()+ "\t" + c4);
            }

        }
    }

}


