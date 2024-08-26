package p0827;

import java.util.ArrayList;
import java.util.List;

/*
숫자로 이루어진 문자열 t와 p가 주어질 때,
t에서 p와 길이가 같은 부분문자열 중에서,
이 부분문자열이 나타내는 수가 p가 나타내는 수보다 작거나 같은 것이 나오는 횟수를 return하는
함수 solution을 완성하세요.

예를 들어, t="3141592"이고 p="271" 인 경우,
t의 길이가 3인 부분 문자열은 314, 141, 415, 159, 592입니다.
이 문자열이 나타내는 수 중 271보다 작거나 같은 수는 141, 159 2개 입니다.
 */

public class Hanna {
    public static void main(String[] args) {
        String p = "7";//"271";
        String t = "500220839878";  //"3141592";

        int result = solution(t, p);
        System.out.println(result);

    }

    public static int solution(String t, String p) {

        int pLength = p.length();
        int tLength = t.length();

        List<String> array = new ArrayList<>(); // slice 결과 담을 arrayList
        List<String> answer = new ArrayList<>(); // 답

        if (pLength >= 1 && pLength <= 18 && //1 ≤ p의 길이 ≤ 18
                pLength <= tLength && tLength <= 10000) { //p의 길이 ≤ t의 길이 ≤ 10,000

            int beginIndex = 0;
            int endInext = p.length();
            boolean flag = true;


            // true일 동안 t의 길이만큼 계속 문자열 잘라주기
            while (flag) {
                String slice = t.substring(beginIndex, endInext);

                array.add(slice);

                beginIndex++;
                endInext++;
                if (endInext > t.length()) {
                    flag = false;
                }
            }

            for (String result : array) {
                if (Long.parseLong(result) <= Long.parseLong(p)) { //p의 길이가 18자리수까지 가능
                    answer.add(result);
                }
            }
        }
        return answer.size();
    }
}

/* 다른 사람 풀이
 class Solution {
  public int solution(String t, String p) {
        int pLength = p.length();
        long pValue = Long.parseLong(p);
        int answer = 0;
        for (int i = 0; i <= t.length() - pLength; i++) {
            long tValue = Long.parseLong(t.substring(i, i + pLength));
            if (tValue <= pValue)
                answer++;
        }
        return answer;
    }
}
*/
