package week02;

import java.util.Scanner;

public class PS2018 {
    /*
     * title : 수들의 합5
     * url : https://www.acmicpc.net/problem/2018
     *
     *  [ 효율성 ]
     *  - 메모리: 12884 KB
     *  - 시간 : 108	ms
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();   //연속된 자연수의 합으로 나타 낼 정수

        int cnt = 1, result = 1; //자릿수와 결과 출력할 변수설정
        n -= cnt;
        while (0 < n) {
            cnt++;
            n -= cnt;
            if(n % cnt == 0) result++;
        }

        System.out.println(result);

    }
}
