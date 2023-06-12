package lv1;
public class S12919 {
    public static void main(String[] args) {
        String[] arr = {"Jane", "Kim"};
        System.out.println(Solution(arr));
    }

    static String Solution(String[] seoul) {
        int cnt = 0;
        for(int i = 0; i < seoul.length; i++){
            if(seoul[i].equals("Kim")){
                cnt = i;
            }

        }
        return "김서방은 " + cnt + "에 있다";
    }
}
