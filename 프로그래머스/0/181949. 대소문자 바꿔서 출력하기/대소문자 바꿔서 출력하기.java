import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        StringBuilder result = new StringBuilder();
        
        // 입력받은 문자열은 Array로 변환하여 하나씩 탐색
        for(char alphbat : str.toCharArray()){
            
            // 소문자일경우
            if(Character.isLowerCase(alphbat)){ 
                result.append(Character.toUpperCase(alphbat));
            }
            // 대문자일경우
            else if(Character.isUpperCase(alphbat)){
                result.append(Character.toLowerCase(alphbat));
            }
        }
        System.out.println(result);
        
    }
}