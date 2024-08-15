package main.java.algorithm.slidingwindow;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class PS12891 {
    /*
     * title : DNA 비밀번호
     * url : https://www.acmicpc.net/problem/12891
     *
     *  [ 효율성 ]
     *  - 메모리:  23696KB
     *  - 시간 :   356ms
     * */
    static int[] myArr;
    static int[] checkArr;
    static int checkSecret;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int s = Integer.parseInt(st.nextToken());
        int p = Integer.parseInt(st.nextToken());
        int result = 0;

        char[] dna = br.readLine().toCharArray();
        st = new StringTokenizer(br.readLine());

        checkArr = new int[4];
        checkSecret = 0;
        myArr = new int[4];

        for (int i = 0; i < 4; i++) {  //A C G T
            checkArr[i] = Integer.parseInt(st.nextToken());
            
            // 예외처리 : 필수 값이 0이라면, 고려할 필요가 없음
            if (checkArr[i] == 0) {
                checkSecret++;  
            }
        }

        for (int i = 0; i < p; i++) {   //초기세팅
            Add(dna[i]);
        }
        if (checkSecret == 4) result++;

        //슬라이딩 윈도우
        for (int i = p; i < s; i++) {
            int j = i - p;
            Add(dna[i]);
            Remove(dna[j]);
            if (checkSecret == 4) result++;
        }
        System.out.println(result);
        br.close();
    }

    private static void Remove(char c) {

        switch (c) {
            case 'A':
                if (myArr[0] == checkArr[0]) checkSecret--;
                myArr[0]--;
                break;
            case 'C':
                if (myArr[1] == checkArr[1]) checkSecret--;
                myArr[1]--;
                break;
            case 'G':
                if (myArr[2] == checkArr[2]) checkSecret--;
                myArr[2]--;
                break;
            case 'T':
                if (myArr[3] == checkArr[3]) checkSecret--;
                myArr[3]--;
                break;
        }
    }

    private static void Add(char c) {
        switch (c) {
            case 'A':
                myArr[0]++;
                if (myArr[0] == checkArr[0]) checkSecret++;
                break;
            case 'C':
                myArr[1]++;
                if (myArr[1] == checkArr[1]) checkSecret++;
                break;
            case 'G':
                myArr[2]++;
                if (myArr[2] == checkArr[2]) checkSecret++;
                break;
            case 'T':
                myArr[3]++;
                if (myArr[3] == checkArr[3]) checkSecret++;
                break;
        }
    }


}
