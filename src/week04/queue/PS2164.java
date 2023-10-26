package week04.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PS2164 {
    /*
     * title : 카드2
     * url : https://www.acmicpc.net/problem/2164
     *
     *  [ 효율성 ]
     *  - 메모리:  48968KB
     *  - 시간 :   268ms
     * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();

        // 초기세팅
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (1 < queue.size()) {
            queue.poll();   //첫번째꺼 버리기
            queue.add(queue.poll());    //2번째꺼 빼서 다시 넣기
        }
        System.out.println(queue.poll());
    }
}
