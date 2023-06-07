package lv1;

import java.util.Arrays;

public class S12954 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(solution(2,5)));
    }
    static long[] solution(int x, int n){
        long[] answer = new long[n];
        for(int i = 0; i<=n-1; i++){
            answer[i] = x*(i+1);
        }
        return answer;
    }

}
