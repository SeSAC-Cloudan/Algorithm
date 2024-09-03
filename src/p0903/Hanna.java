package p0903;

import java.util.HashMap;
import java.util.Map;

public class Hanna {
    public static void main(String[] args) {
        String s = "banana";
        int[] result = solution(s);

        // 결과 출력
        for (int r : result) {
            System.out.print(r + " ");
        }
    }

    public static int[] solution(String s) {
        int[] answer = new int[s.length()]; // 정답 담을 배열
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char piece = s.charAt(i); // i번째를 char 타입으로 변경

            // map에 현재 문자가 존재한다면
            if (map.containsKey(piece)) {
                // 현재 위치와 이전 위치의 차이를 저장
                answer[i] = i - map.get(piece);
            } else {
                // 처음 등장하는 문자일 경우 -1 저장
                answer[i] = -1;
            }
            // 현재 문자의 위치를 map에 저장 (업데이트)
            map.put(piece, i);
        }
        return answer;
    }

}
