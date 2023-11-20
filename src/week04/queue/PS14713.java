package week04.queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class PS14713 {

    /*
     * title : 앵무새
     * url : https://www.acmicpc.net/problem/14713
     *
     *  [ 효율성 ]
     *  - 메모리:  29280KB
     *  - 시간 :   504ms
     * */

    static int N;
    static Queue<String> Q[];
    static Queue<String> T = new LinkedList<>();

    public void InputData() {
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        Q = new LinkedList[N];
        for (int i=0; i<N; i++) {
            Q[i] = new LinkedList<String>();
        }
        sc.nextLine();
        for (int i=0; i<N; i++) {
            String str = sc.nextLine();
            String s[] = str.split(" ");
            for (String value : s) {
                Q[i].add(value);
            }
        }
        String tmp = sc.nextLine();
        String t[] = tmp.split(" ");
        for (int i=0; i<t.length; i++) {
            T.add(t[i]);
        }
    }

    public void Solve() {
        while (!T.isEmpty()) {
            String word = T.poll();
            boolean found = false;
            for (int i=0; i<N; i++) {
                if (word.equals(Q[i].peek())) {
                    Q[i].poll();
                    found = true;
                }
            }
            if (!found) { // 앵무새 한 사이클에서 찾는 단어가 없는 경우
                System.out.println("Impossible");
                return;
            }
        }
        for (int i=0; i<N; i++) { // (반례) 받아적은 단어가 앵무새 단어보다 적을 경우
            while(!Q[i].isEmpty()) {
                System.out.println("Impossible");
                return;
            }
        }
        System.out.println("Possible");
    }

    public static void main(String[] args)
    {
        PS14713 m = new PS14713();
        m.InputData();
        m.Solve();
    }
}
