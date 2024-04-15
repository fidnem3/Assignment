package com.javalab.homeworks;

import java.util.Scanner;

public class Home5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CoffeeShop coffe1 = new CoffeeShop("아메리카노", 2000);
        CoffeeShop coffe2 = new CoffeeShop("아이스티", 1500);
        CoffeeShop coffe3 = new CoffeeShop("블루베리 에이드", 1500);
        CoffeeShop coffe4 = new CoffeeShop("자몽 스무디", 1500);

        while (true){
            menu();
            int choice = scanner.nextInt();
            if( choice == 5) {
                System.out.println("프로그램 종료.");
                return;
            }
            System.out.print("주문 수량: ");
            int amout = scanner.nextInt();

            System.out.print("지급 금액: ");
            int payment = scanner.nextInt();

            String coffe = " ";
            int price1 = 0;
            switch (choice){
                case 1:
                    coffe = coffe1.name;
                    price1 = coffe1.price;
                    break;
                case 2:
                    coffe = coffe2.name;
                    price1 = coffe2.price;
                    break;
                case 3:
                    coffe = coffe3.name;
                    price1 = coffe3.price;
                    break;
                case 4:
                    coffe = coffe4.name;
                    price1 = coffe4.price;
                    break;
                default:
                    System.out.println("잘못선택하셨습니다.");
            }
            System.out.println();


            int sum = (amout * price1);
            int total = (payment - sum);

            System.out.println("====영수증====");
            System.out.println("주문한 메뉴: " + coffe);
            System.out.println("주문한 수량: " + amout + "개");
            System.out.println("주문 가격: " + price1 + " 원");
            System.out.println("지급 금액: " + payment + " 원");
            System.out.println("총 금액: " + total + " 원");
            System.out.println();

        }

    }
    public static void menu(){
        System.out.println("=== 메뉴판===");
        System.out.println("1.아메리카노 - 2500");
        System.out.println("2.아이스티 - 3000");
        System.out.println("3.블루베리 에이드 - 4000");
        System.out.println("4.자몽 스무디 - 4000");
        System.out.println("5. 종료");
        System.out.println();
        System.out.println("=메뉴를 고르시오=");
    }
}
