package lv1;
public class S70128 {
    public static void main(String[] args) {

    }

    static void Solution(int[] a, int[] b) {
        int answer = 0;
        int tmp = 0;
        for (int i = 0; i < a.length; i++) {
            tmp = a[i] * b[i];
            answer += tmp;
        }
    }
}
