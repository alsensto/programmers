package lv0;

public class S120903 {
    public static void main(String[] args) {
        String[] s1 = {"a","b","c"};
        String[] s2 = {"a","b","c"};
        int answer = solution(s1,s2);
        System.out.println(answer);

    }
    static int solution(String[] s1, String[] s2){
        int answer = 0;
        for(String a : s1){                         //향상된 for 문으로 s1의 원소와
            for(String b : s2){                     // s2의 원소를
                if(a.equals(b))                     //equals로 비교
                {
                    answer +=1;
                }
            }
        }
        return answer;
    }
}
