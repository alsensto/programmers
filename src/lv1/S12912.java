package lv1;
public class S12912 {
    public static void main(String[] args) {
        System.out.println(Solution(5,3));

    }

    static long Solution(int a, int b){
        long answer = 0;
        if(a<b){
            for (int i = a; i <=b; i++) {
                answer += i;
            }
            return answer;
        } else if (a == b) {
            return a;
        }
        else{
            for (int i = a; i >= b; i--) {
               answer +=i;
            }
            return answer;
        }

    }
}
