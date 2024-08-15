package main.java.algorithm.stack;

import java.io.IOException;
import java.util.Scanner;
import java.util.Stack;

public class PS28278 {
    /*
     * title : 스택2
     * url : https://www.acmicpc.net/problem/28278
     *
     *  [ 효율성 ]
     *  - 메모리:  340200KB
     *  - 시간 :   2284ms
     * */
    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        StringBuffer sb = new StringBuffer();
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {

            switch (sc.nextInt()) {
                case 1:
                    stack.push(sc.nextInt());
                    break;

                case 2:
                    if (stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;

                case 3:
                    sb.append(stack.size()).append("\n");
                    break;

                case 4:
                    if (stack.empty()) {
                        sb.append(1).append("\n");
                    } else {
                        sb.append(0).append("\n");
                    }
                    break;

                case 5:
                    if (stack.empty()) {
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }

        System.out.println(sb);

    }
}
