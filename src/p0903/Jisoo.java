package p0903;

import java.util.Arrays;

/**
 * 프로그래머스 lv.1
 * 가장 가까운 같은 글자
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        // [-1, -1, -1, 2, 2, 2]
        System.out.println(Arrays.toString(j.solution("banana")));
        // [-1, -1, 1, -1, -1, -1]
        System.out.println(Arrays.toString(j.solution("foobar")));
    }

    public int[] solution(String s) {
        // 1. 이전에 나왔던 소문자의 인덱스를 저장합니다.
        int[] count = new int[26];

        // 2. 답으로 반환할 배열입니다.
        int[] answer = new int[s.length()];

        // 3. 소문자가 한 번도 나오지 않았을 때 값을 -1로 초기화합니다.
        Arrays.fill(count, -1);

        // 4. 주어진 문자열 s를 for문으로 돌린다.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (count[ch - 'a'] == -1) {            // 1-1) 소문자가 나온적이 없을 때
                answer[i] = -1;                     //    answer에 -1 표시
            } else {                                // 1-2) 소문자가 나온적이 있을 때
                answer[i] = i - count[ch - 'a'];    //    answer에 "지금 인덱스 - 기록된 인덱스 값" 기록
            }
            count[ch - 'a'] = i;                    // 2) count 배열 인덱스 업데이트
        }

        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.02ms, 73MB)
테스트 2 〉	통과 (0.02ms, 71.1MB)
테스트 3 〉	통과 (0.02ms, 75.4MB)
테스트 4 〉	통과 (0.10ms, 76.6MB)
테스트 5 〉	통과 (0.72ms, 85.1MB)
테스트 6 〉	통과 (0.31ms, 82MB)
테스트 7 〉	통과 (0.73ms, 77.3MB)
테스트 8 〉	통과 (0.39ms, 80.4MB)
테스트 9 〉	통과 (0.70ms, 81.7MB)
테스트 10 〉	통과 (0.25ms, 79.6MB)
테스트 11 〉	통과 (0.65ms, 82.3MB)
테스트 12 〉	통과 (0.02ms, 78.1MB)
테스트 13 〉	통과 (0.02ms, 78.3MB)
테스트 14 〉	통과 (0.06ms, 84MB)
테스트 15 〉	통과 (0.02ms, 76.9MB)
테스트 16 〉	통과 (0.03ms, 72.6MB)
테스트 17 〉	통과 (0.03ms, 76.4MB)
테스트 18 〉	통과 (0.15ms, 75.4MB)
테스트 19 〉	통과 (0.17ms, 77.2MB)
테스트 20 〉	통과 (0.05ms, 83.9MB)
테스트 21 〉	통과 (0.03ms, 72MB)
테스트 22 〉	통과 (0.55ms, 70.7MB)
테스트 23 〉	통과 (0.05ms, 75.5MB)
테스트 24 〉	통과 (0.06ms, 84.2MB)
테스트 25 〉	통과 (0.11ms, 72.7MB)
테스트 26 〉	통과 (0.04ms, 71.8MB)
테스트 27 〉	통과 (0.07ms, 72.7MB)
테스트 28 〉	통과 (0.10ms, 77.9MB)
테스트 29 〉	통과 (0.02ms, 72.1MB)
테스트 30 〉	통과 (1.22ms, 82MB)
 */
