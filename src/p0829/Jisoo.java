package p0829;

/**
 * 프로그래머스 lv.1
 * 이상한 문자 만들기
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        // 공백이 하나 이상 있을 때 체크
        // 단어가 짝수개일 때 체크
        System.out.println(j.solution("try hello world  oHOhohOH"));  // "TrY HeLlO WoRlD"
    }

    // 시간복잡도: O(N)
    // N은 문자열 길이, 문자열 길이만큼 연산을 하게 됨.
    public String solution(String s) {
        StringBuilder sb = new StringBuilder();
        // 한 단어 내 알파벳이 짝수인지 홀수인지 체크하기 위한 정수값
        int index = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            // 공백이라면 그대로 더해주고 index 0으로 초기화
            if (ch == ' ') {
                sb.append(ch);
                index = 0;
            } else {        // 공백이 아닌 경우
                if (index % 2 == 0) {   // 짝수번째라면
                    if (ch >= 97) {     // 캐릭터 값이 소문자라면 대문자로 바꿔줌.
                        ch -= 32;
                    }
                } else {                // 홀수번째라면
                    if (ch < 97) {      // 캐릭터 값이 대문자라면 소문자로 바꿔줌.
                        ch += 32;
                    }
                }
                sb.append(ch);          // 변환한 캐릭터 값 append
                index++;                // index 하나 올려주기
            }
        }
        return sb.toString();
    }
}
/*
테스트 1 〉	통과 (0.03ms, 79.8MB)
테스트 2 〉	통과 (0.04ms, 83.2MB)
테스트 3 〉	통과 (0.03ms, 84.6MB)
테스트 4 〉	통과 (0.06ms, 73.8MB)
테스트 5 〉	통과 (0.06ms, 78.1MB)
테스트 6 〉	통과 (0.03ms, 77.4MB)
테스트 7 〉	통과 (0.03ms, 76.7MB)
테스트 8 〉	통과 (0.06ms, 74MB)
테스트 9 〉	통과 (0.04ms, 75.6MB)
테스트 10 〉	통과 (0.05ms, 79.5MB)
테스트 11 〉	통과 (0.06ms, 78.4MB)
테스트 12 〉	통과 (0.06ms, 80.1MB)
테스트 13 〉	통과 (0.04ms, 75.6MB)
테스트 14 〉	통과 (0.03ms, 72.1MB)
테스트 15 〉	통과 (0.04ms, 76.2MB)
테스트 16 〉	통과 (0.04ms, 74.9MB)
 */
