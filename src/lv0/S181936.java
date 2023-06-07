package lv0;

public class S181936 {
    public static void main(String[] args) {
        System.out.println(solution(40,3,5));
    }

    static int solution(int number, int n, int m){
        return number % n == 0 && number % m == 0 ? 1 : 0;
    }
}
