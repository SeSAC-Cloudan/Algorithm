package p0827;

/**
 * 프로그래머스
 * lv.1 크기가 작은 부분 문자열
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        System.out.println(j.solution("3141592", "271"));   // 2
        System.out.println(j.solution("500220839878", "7")); // 8
        System.out.println(j.solution("10203", "15"));       // 3
    }

    String t;
    String p;

    public int solution(String t, String p) {
        this.t = t;
        this.p = p;
        int answer = 0;
        for (int i = 0; i <= t.length() - p.length(); i++) {
            if (isLess(i)) {
                answer++;
            }
        }

        return answer;
    }

    private boolean isLess(int index) {
        int pIndex = 0;
        for (int i = index; i < index + p.length(); i++) {
            if (t.charAt(i) < p.charAt(pIndex)) {
                return true;
            } else if (t.charAt(i) > p.charAt(pIndex)) {
                return false;
            }
            pIndex++;
        }
        return true;
    }
}

/*
테스트 1 〉	통과 (0.62ms, 73.6MB)
테스트 2 〉	통과 (1.32ms, 75.4MB)
테스트 3 〉	통과 (1.21ms, 74.2MB)
테스트 4 〉	통과 (1.12ms, 68.8MB)
테스트 5 〉	통과 (0.22ms, 78.4MB)
테스트 6 〉	통과 (2.14ms, 75.6MB)
테스트 7 〉	통과 (1.99ms, 75.8MB)
테스트 8 〉	통과 (0.95ms, 81.1MB)
테스트 9 〉	통과 (0.21ms, 73.6MB)
테스트 10 〉	통과 (0.08ms, 74MB)
테스트 11 〉	통과 (0.82ms, 84.3MB)
테스트 12 〉	통과 (2.01ms, 75MB)
테스트 13 〉	통과 (1.02ms, 73.2MB)
테스트 14 〉	통과 (0.84ms, 78.3MB)
테스트 15 〉	통과 (0.78ms, 74.6MB)
테스트 16 〉	통과 (1.02ms, 71.1MB)
테스트 17 〉	통과 (1.23ms, 77.2MB)
테스트 18 〉	통과 (1.83ms, 71.1MB)
테스트 19 〉	통과 (0.90ms, 66.6MB)
테스트 20 〉	통과 (0.54ms, 74.7MB)
테스트 21 〉	통과 (0.04ms, 76.5MB)
테스트 22 〉	통과 (0.10ms, 74MB)
테스트 23 〉	통과 (0.21ms, 74.9MB)
테스트 24 〉	통과 (0.02ms, 72.1MB)
테스트 25 〉	통과 (0.04ms, 71.9MB)
테스트 26 〉	통과 (0.04ms, 82.3MB)
테스트 27 〉	통과 (0.05ms, 76.1MB)
테스트 28 〉	통과 (0.03ms, 78.3MB)
테스트 29 〉	통과 (0.05ms, 66.9MB)
테스트 30 〉	통과 (0.25ms, 73.6MB)
테스트 31 〉	통과 (0.03ms, 76.8MB)
테스트 32 〉	통과 (0.04ms, 73.2MB)
테스트 33 〉	통과 (0.04ms, 75.6MB)
테스트 34 〉	통과 (0.02ms, 74MB)
테스트 35 〉	통과 (0.03ms, 73.9MB)
테스트 36 〉	통과 (0.03ms, 78.5MB)
테스트 37 〉	통과 (0.04ms, 75MB)
테스트 38 〉	통과 (0.03ms, 75.3MB)
 */
