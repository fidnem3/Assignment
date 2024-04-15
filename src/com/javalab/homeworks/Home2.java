package com.javalab.homeworks;

import java.util.Scanner;

public class Home2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("신장이 몇 cm 인가요? ");
        System.out.println("체중이 몇 kg 인가요? ");
        String height1 = scanner.nextLine();
        String weight1 = scanner.nextLine();


        System.out.println("입력한 신장 : " + height1 + "cm");
        System.out.println("입력한 체중 : " + weight1 + "kg");
        double height = Double.parseDouble(height1);
        double weight = Double.parseDouble(weight1);

        height = height / 100;
        System.out.printf("BMI: %.2f\n", weight/(height * height));







    }
}

