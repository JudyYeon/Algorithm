package main.java.algorithm.twopointer;

import java.util.Scanner;

public class PS2018 {
    /*
     * title : 수들의 합5
     * url : https://www.acmicpc.net/problem/2018
     *
     *  [ 효율성 ]
     *  - 메모리: 12872 KB
     *  - 시간 : 148	ms
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int start_point = 1, end_point = 1;
        int sum = 1, count = 1; //자기자신을 뽑는 케이스 미리 저장하고 시작

        while (n != end_point) {
            if (sum < n) {
                end_point++;
                sum += end_point;

            } else if (sum == n) {
                count++;
                end_point++;
                sum += end_point;

            } else {
                sum -= start_point;
                start_point++;
            }
        }
        System.out.println(count);
    }
}
