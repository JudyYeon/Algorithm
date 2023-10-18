package week02.prefixSum;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PS11659 {
    /*
     * title : 구간 합 구하기 4
     * url : https://www.acmicpc.net/problem/11659
     *
     *  [ 효율성 ]
     *  - 메모리: 257016 KB
     *  - 시간 : 2480 ms
     * */
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        ArrayList<List<Integer>> list = new ArrayList<>(0);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] arr = new int[n];
        int[] sum = new int[n];

        for(int i = 0 ;  i< n; i++){
            arr[i] = sc.nextInt();
            if(i == 0) sum[i] = arr[i];
            else sum[i] = sum[i-1] + arr[i];
        }

        for(int i = 0; i < m; i++){
            List<Integer> tmp = new ArrayList<>(0);

            for(int j = 0; j< 2; j++){
                tmp.add(j, sc.nextInt());
            }
            list.add(i, tmp);
        }
        // 구간 합
        for(int i = 0 ; i < m; i++){
            int start = list.get(i).get(0)-1;//0
            int end = list.get(i).get(1)-1;//2

            if(start == 0) System.out.println(sum[end]);
            else System.out.println(sum[end] - sum[start-1]);

        }


    }
}
