package week02.array;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PS10811 {
    /*
     * title : 바구니 뒤집기
     * url : https://www.acmicpc.net/problem/10811
     *
     *  [ 효율성 ]
     *  - 메모리:  16028KB
     *  - 시간 :   156ms
     * */
    static int[] basket;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine());

        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        basket = new int[n];
        Arrays.setAll(basket, i -> i + 1);

        for (int i = 0; i < m; i++) {

            st = new StringTokenizer(bf.readLine());
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            reverse(basket, start-1, end);
        }

        for (int j : basket) {
            System.out.print(j + " ");
        }
    }

    public static void reverse(int[] arr, int s, int e) {
        int[] copy = Arrays.copyOfRange(arr, s, e);

        int len = copy.length;
        for (int i = 0; i < len; i++) {
            arr[s + i] = copy[len - (i + 1)];
        }
    }
}
