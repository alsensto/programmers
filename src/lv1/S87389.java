package lv1;

public class S87389 {
    public static void main(String[] args) {
        System.out.println(Solution(12));

    }

    static int Solution(int n){
        int answer = 0;
        for (int i = 2; i < n; i++) {
            if((n-1)%i == 0)
            {
                answer = i;
                break;
            }

        }
        return answer;
    }
}
