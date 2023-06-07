package lv0;

public class S181835 {
    public static void main(String[] args) {
       int[] arr = solution(new int[]{1, 2, 3, 100, 99, 98}, 3);
        System.out.println(arr);
    }

    static int[] solution(int[] arr, int k) {
        if (k % 2 == 0) {
            for (int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] + k;
            }
            return arr;
        }
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * k;
        }
        return arr;
    }
}
