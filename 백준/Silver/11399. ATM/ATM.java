import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] duringTime = new int[N]; //인출하는데 필요한 시간
    int[] totalTime = new int[N]; //인출하는데 걸리는 시간
    int result = 0;

    for (int i = 0; i < N; i++) {
      duringTime[i] = sc.nextInt();
    }

    sort(duringTime);

    for (int i = 0; i < N; i++) {

      if (i == 0) {
        totalTime[i] = duringTime[i];

      } else {
        totalTime[i] = duringTime[i] + totalTime[i - 1];
      }
      result += totalTime[i];
    }

    System.out.println(result);

  }

  private static void sort(int[] a) {

    for (int i = 0; i < a.length; i++) {

      // 타겟 넘버
      int target = a[i];

      int j = i - 1;

      while(j >= 0 && target < a[j]) {
        a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
        j--;
      }

      a[j + 1] = target;
    }

  }

}