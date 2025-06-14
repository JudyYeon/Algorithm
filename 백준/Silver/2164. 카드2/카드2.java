import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        Queue<Integer> queue = new LinkedList<>();
 
        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        while (1 < queue.size()) {
            queue.poll();   
            queue.add(queue.poll());    
        }
        System.out.println(queue.poll());
    }
}
