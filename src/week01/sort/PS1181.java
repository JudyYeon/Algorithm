package week01.sort;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class PS1181 {

  public static String[] wordList;
  public static int N;

    /*
   * title : 단어정렬
   * url : https://www.acmicpc.net/problem/1181
   *
   *  [ 효율성 ]
   *  - 메모리: 60400 KB
   *  - 시간 : 920	ms
   * */
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    sc.nextLine();
    wordList = new String[N];

    for (int i = 0; i < N; i++) {
      wordList[i] = sc.nextLine();
    }

    // n logN 시간복잡도 sort() 메서드 재정의
    Arrays.sort(wordList, (s1, s2) -> {
      if (s1.length() == s2.length()) { 
        return s1.compareTo(s2);
      } else {
        return s1.length() - s2.length();
      }
    });

    // 순서가 보장된 중복제거하기 : collection
    for (String s : new LinkedHashSet<>(Arrays.asList(wordList))) {
      System.out.println(s);
    }
  }

}
