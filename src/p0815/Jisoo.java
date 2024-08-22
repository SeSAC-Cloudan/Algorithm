package p0815;
import java.util.Arrays;

/*
프로그래머스 lv.1
정수 내림차순으로 배치하기
https://school.programmers.co.kr/learn/courses/30/lessons/12933
 */
public class Jisoo {

    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        System.out.println(j.solution(118372));     // 873211
    }

    public long solution(long n) {
        // 1. 문자열로 변환 후 캐릭터 배열 chars를 가져온다.
        char[] chars = String.valueOf(n).toCharArray();

        // 2. chars를 정렬한다.
        // 테스트 케이스의 경우 [1, 1, 2, 3, 7, 8]가 된다.
        Arrays.sort(chars);

        // 3. 반환할 long 변수를 정의해준다.
        long answer = 0;

        // 4. chars 배열을 돌면서 더해주는데 곱하기 10씩 해주면서 더해준다.
        // ex. +1, +10, +200, +3000, +70_000, +800_000
        long position = 1L;
        for (char ch : chars) {
            // 아스키코드를 이용하여 숫자를 추출한다.
            answer += (ch - '0') * position;
            position *= 10;
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.52ms, 71MB)
테스트 2 〉	통과 (0.50ms, 72.7MB)
테스트 3 〉	통과 (0.35ms, 72.7MB)
테스트 4 〉	통과 (0.50ms, 82.1MB)
테스트 5 〉	통과 (0.37ms, 80.5MB)
테스트 6 〉	통과 (0.41ms, 75.5MB)
테스트 7 〉	통과 (0.40ms, 73.4MB)
테스트 8 〉	통과 (0.37ms, 74.6MB)
테스트 9 〉	통과 (0.60ms, 73.3MB)
테스트 10 〉	통과 (0.38ms, 77.1MB)
테스트 11 〉	통과 (0.31ms, 70.9MB)
테스트 12 〉	통과 (0.38ms, 72.1MB)
테스트 13 〉	통과 (0.38ms, 75.1MB)
테스트 14 〉	통과 (0.42ms, 68.5MB)
테스트 15 〉	통과 (0.47ms, 72.2MB)
테스트 16 〉	통과 (0.37ms, 73.3MB)
 */
