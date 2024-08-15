package main.java.algorithm.array;

import java.util.Scanner;

public class PS1546 {
    /*
     * title : 평균
     * url : https://www.acmicpc.net/problem/1546
     *
     *  [ 효율성 ]
     *  - 메모리: 15904 KB
     *  - 시간 : 164	ms
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();//입력받을 점수의 개수
        int max = 0;    //점수 최댓값
        double[] score = new double[n];   //점수 배열
        double avg = 0;// avg 평균 구하기

        for (int i=0; i< n; i++){
            score[i] = sc.nextInt();
            if(i == 0 || max <= score[i]){// max 값 변경
                max = (int) score[i];
            }
        }
        // max 값으로 점수 고치기
        for(int i = 0; i < n; i++){
            score[i] = score[i]/max*100;
            avg += score[i];
        }
        avg /= n;

        sc.close();

        System.out.println(avg);

    }
}
