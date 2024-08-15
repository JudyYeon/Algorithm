package main.java.algorithm.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class PS1874 {
    /*
     * title : 스택 수열
     * url : https://www.acmicpc.net/problem/1874
     *
     *  [ 효율성 ]
     *  - 메모리:  50604KB
     *  - 시간 :   1688ms
     * */

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        int[] A = new int[n];   //입력받을 배열
        Stack<Integer> stack = new Stack<>();  
        int sequence = 1;   //스택에 넣을 오름차순 자연수
        boolean statue = true;
        List<Character> result = new ArrayList<>(); //결과담을 곳

        for (int i = 0; i < n; i++) {
            A[i] = Integer.parseInt(br.readLine());
        }

        // for-each로 만들어야 할 수열 A리스트를 참조하며 스택연산을 한다.
        for (int su : A) {

            if (su >= sequence) {
                // 입력한 수의 크기가 더 크거나 같을 때, 넣어야 함
                while (su >= sequence) {
                    stack.push(sequence++);
                    result.add('+');
                }
                stack.pop(); //나 자신 빼기
                result.add('-');

            } else {
                int k = stack.pop();
                if (k > su) {
                    System.out.println("NO");
                    statue = false;
                    break;
                } else {
                    result.add('-');
                }
            }
        }
        if (statue) {
            for (Character character : result) {
                System.out.println(character);
            }
        }

    }

}
