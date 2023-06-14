package lv1;

import java.sql.Array;
import java.util.Arrays;

public class S12932 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(Solution(12345)));
    }

    static int[] Solution(int n){
        String s = String.format(String.valueOf(n));
        String[] myStr = s.split("");
        String[] reMyStr = new String[myStr.length];
        int[] answer = new int[myStr.length];
        for (int i = myStr.length-1; i >=0; i--) {
            reMyStr[i] = myStr[myStr.length-1-i];
        }
        for (int i = 0; i < reMyStr.length; i++) {
            answer[i] = Integer.parseInt(reMyStr[i]);
        }
        return answer;
    }
}
