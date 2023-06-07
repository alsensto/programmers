package lv0;

public class S120807 {
    public static void main(String[] args) {
        System.out.println(solution(2,3));
    }

    private static int solution(int num1, int num2) {
        if(num1 == num2)
            return 1;
        return -1;
    }
}
