package lv0;

public class S120826 {
    public static void main(String[] args) {
        System.out.println(solution("abcdef","f"));
    }

    static String solution(String my_string, String letter) {
        String newStr = my_string.replace(letter,""); //replace함수 사용 replace(바꿀문자, 바꾼 후 문자)
        return newStr;
    }
}
