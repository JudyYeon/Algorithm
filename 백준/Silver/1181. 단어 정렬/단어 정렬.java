import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {

  public static String[] wordList;
  public static int N;

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    N = sc.nextInt();
    sc.nextLine();
    wordList = new String[N];


    for (int i = 0; i < N; i++) {
      wordList[i] = sc.nextLine();
    }

    Arrays.sort(wordList, (s1, s2) -> {
      if(s1.length() == s2.length()) {
        return s1.compareTo(s2);
      }else {
        return s1.length() - s2.length();
      }
    });

    for (String s : new LinkedHashSet<>(Arrays.asList(wordList))) {
      System.out.println(s);
    }
  }

}