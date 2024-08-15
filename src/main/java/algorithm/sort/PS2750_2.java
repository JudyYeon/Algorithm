package main.java.algorithm.sort;

import java.util.Scanner;

public class PS2750_2 {
  /*
   * title : 수 정렬하기
   * url : https://www.acmicpc.net/problem/2750
   *
   *  [ 효율성 ]
   *  - 메모리: 22276 KB
   *  - 시간 : 368	ms
   * */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    int N = sc.nextInt();
    int[] arr = new int[N];

    for (int i = 0; i < N; i++) {
      arr[i] = sc.nextInt();
    }

    bubbleSort(arr);
    for (int x : arr) {
      System.out.println(x);
    }

  }

  private static int[] bubbleSort(int[] array) {

    for (int i = 1; i < array.length; i++) {

      for (int j = 0; j < array.length - 1; j++) {

        if (array[j] > array[j + 1]) {
          int tmp = array[j + 1];
          array[j + 1] = array[j];
          array[j] = tmp;
        }
      }
    }

    return array;
  }
}
