package p0820;

/**
 * 프로그래머스
 * lv.1 약수의 개수와 덧셈
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        System.out.println(j.solution(13, 17)); // 43
        System.out.println(j.solution(24, 27)); // 52
    }

    // 내 풀이
    // 제곱수는 약수의 수가 홀수개임을 이용.
    public int solution(int left, int right) {
        int answer = 0;
        for (int num = left; num <= right; num++) {
            if (isNumSquareNumber(num)) {   // 제곱수이면 약수의 개수가 홀수개
                answer -= num;
            } else {                        // 제곱수가 아니면 약수의 개수가 짝수개
                answer += num;
            }
        }
        return answer;
    }

    // 제곱수인지 확인하는 메서드
    private boolean isNumSquareNumber(int num) {
        return (int)(Math.sqrt(num)) * (int)(Math.sqrt(num)) == num;
    }
}
/*
테스트 1 〉	통과 (0.12ms, 75.9MB)
테스트 2 〉	통과 (0.10ms, 73.6MB)
테스트 3 〉	통과 (0.06ms, 73.5MB)
테스트 4 〉	통과 (0.04ms, 86.3MB)
테스트 5 〉	통과 (0.16ms, 74.7MB)
테스트 6 〉	통과 (0.03ms, 75.4MB)
테스트 7 〉	통과 (0.05ms, 77.4MB)
 */
