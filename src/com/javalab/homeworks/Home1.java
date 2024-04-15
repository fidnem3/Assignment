package com.javalab.homeworks;

import java.util.Scanner;

public class Home1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력하세요.");
        int inputStr = scanner.nextInt();
        System.out.println("입력한 숫자: " + inputStr);

        if(inputStr %2 == 0) {
            System.out.println("짝수 입니다.");
        } else {
            System.out.println("홀수 입니다.");
        }




    }
}

