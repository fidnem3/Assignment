package com.javalab.homeworks;

public class For {
    public static void main(String[] args) {
        int count = 0;
        int limit = 5;

        while (true){
            System.out.println("count: " + count);
            count ++;

            if(count >= limit){
                break;
            }
        }

    }

}