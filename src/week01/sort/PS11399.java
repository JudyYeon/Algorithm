import java.util.Scanner;

public class PS11399 {
    /*
   * title : ATM
   * url : https://www.acmicpc.net/problem/11399
   *
   *  [ 효율성 ]
   *  - 메모리: 20712 KB
   *  - 시간 : 284	ms
   * */
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

      // 타겟이 이전 원소보다 크기 전 까지 반복
      while(j >= 0 && target < a[j]) {
        a[j + 1] = a[j];	// 이전 원소를 한 칸씩 뒤로 미룬다.
        j--;
      }

      /*
       * 위 반복문에서 탈출 하는 경우 앞의 원소가 타겟보다 작다는 의미이므로
       * 타겟 원소는 j번째 원소 뒤에 와야한다.
       * 그러므로 타겟은 j + 1 에 위치하게 된다.
       */
      a[j + 1] = target;
    }

  }

}
