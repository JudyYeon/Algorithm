package week01.stack;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class PS9012 {
    /*
     * title : 괄호
     * url : https://www.acmicpc.net/problem/9012
     *
     *  [ 효율성 ]
     *  - 메모리:  14476KB
     *  - 시간 :   148ms
     * */
    static Stack<Character> vps;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {

            String s = bf.readLine();
            vps = new Stack<>();

            s.chars()
                    .mapToObj(j -> (char) j)
                    .forEach(j -> {
                        if(j.equals('(')){
                            vps.push(j);
                        }
                        if(j.equals(')')){
                            if(!vps.empty() && vps.peek().equals('(')){
                                vps.pop();
                            }else{
                                vps.push(j);
                            }
                        }
                    });
            if(vps.size() != 0){
                result[i] = "NO";
            }
            if(vps.size() == 0){
                result[i] = "YES";
            }
        }

        for(String i: result){
            System.out.println(i);
        }
    }

}
