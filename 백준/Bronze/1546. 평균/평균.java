import java.util.Scanner;

public class Main {
    
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max = 0;    
        double[] score = new double[n];  
        double avg = 0;

        for (int i=0; i< n; i++){
            score[i] = sc.nextInt();
            if(i == 0 || max <= score[i]){
                max = (int) score[i];
            }
        }
      
        for(int i = 0; i < n; i++){
            score[i] = score[i]/max*100;
            avg += score[i];
        }
        avg /= n;
        System.out.println(avg);

    }
}
