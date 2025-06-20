import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String str = sc.next();

        // String은 불변 객체이므로 매번 문자를 추가할 때마다 새로운 String 객체를 생성 -> 메모리가 많이 소모되고 연산 시간이 길어짐
        // StringBuilder는 가변 객체이므로 수정하더라도 새로운 객체를 만들어내지 않기 때문에 사용함
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
