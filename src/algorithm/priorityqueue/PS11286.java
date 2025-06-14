package algorithm.priorityqueue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class PS11286 {
    /*
     * title : 절댓값 힙
     * url : https://www.acmicpc.net/problem/11286
     *
     *  [ 효율성 ]
     *  - 메모리:  24580KB
     *  - 시간 :   324ms
     * */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer sb = new StringBuffer();
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> myQueue = new PriorityQueue<>((o1, o2) -> {

            int first_abs = Math.abs(o1);
            int second_abs = Math.abs(o2);

            // 절댓값이 같은 경우 음수 우선
            if(first_abs == second_abs){
                return o1 > o2 ? 1: -1;
            }
            // 절댓값 작은 데이터 우선
            return first_abs - second_abs;
        });

        for(int i=0; i<N; i++){
            int request =  Integer.parseInt(br.readLine());
            if(request == 0){
                if(myQueue.isEmpty()){
                    sb.append("0").append("\n");
//                    System.out.println("0");
                }else{
                    int m = myQueue.poll();
                    sb.append(m).append("\n");
//                    System.out.println(m);
                }
            }else{
                myQueue.add(request);
            }
        }
        
        System.out.println(sb);
        
    }
}
