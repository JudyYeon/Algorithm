package week01.sort;

import java.util.Arrays;
import java.util.Scanner;

public class PS2750 {
    /*
     * title : 수 정렬하기
     * url : https://www.acmicpc.net/problem/2750
     * */
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] num = new int[n];
        for(int i = 0; i < n; i++){
            num[i] = sc.nextInt();
        }
        Arrays.sort(num);
        for (int j : num) {
            System.out.println(j);
        }

    }
}
