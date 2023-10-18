package week03.twoPointer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class PS1940 {
    /*
     * title : 주몽
     * url : https://www.acmicpc.net/problem/1940
     *
     *  [ 효율성 ]
     *  - 메모리: 15100 KB
     *  - 시간 : 144	ms
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        int[] arr = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        int start_point = 0;
        int end_point = n - 1;
        int count = 0;

        while (arr[start_point] < arr[end_point]) {

            if (arr[start_point] + arr[end_point] < m) {
                start_point++;

            } else if (arr[start_point] + arr[end_point] == m) {
                count++;
                start_point++;

            } else {
                end_point--;

            }
        }
        System.out.println(count);

    }
}
