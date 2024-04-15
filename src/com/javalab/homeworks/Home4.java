package com.javalab.homeworks;

public class Home4 {
    public static void main(String[] args) {
        int[][] score = {{80, 90 ,96},{76, 88}};

        System.out.println("1차원 배열 길 (반의 수): " + score.length);
        System.out.println("2차원 배열 길이(첫 번째 반의 학생 수: " + score[0].length);
        System.out.println("2차원 배열 길이(두 번째 반의 학생 수: " + score[1].length);

        System.out.println("scores[0][2]: " +  score[0][2]);
        System.out.println("scores[1][1]: " +  score[1][1]);


        int sum = 0;

        for(int i = 0; i < score.length; i++) {
            for (int j = 0; j < score[i].length; j++) {
                sum += score[i][j];
            }
        }
        System.out.println("첫 번째 반의 평균 점수: " + (double)(score[0][0] + score[0][1] + score[0][2]) / 3);
        System.out.println("두 번째 반의 평균 점수: " + (double)(score[1][0] + score[1][1]) / 2);

        double age = sum / 5;
        System.out.println("전체 학생의 평균 점수: " + age);















    }
}


