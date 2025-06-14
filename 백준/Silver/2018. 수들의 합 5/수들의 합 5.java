import java.util.Scanner;

public class Main {   
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  

        int cnt = 1, result = 1; 
        n -= cnt;
        while (0 < n) {
            cnt++;
            n -= cnt;
            if(n % cnt == 0) result++;
        }

        System.out.println(result);

    }
}
