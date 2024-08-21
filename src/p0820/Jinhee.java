package p0820;

public class Jinhee {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.solution(13, 17));
    }
}

class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        for (int i = left; i <= right; i++) {
            // 제곱근을 구하고 int로 형변환합니다.
            double doubleSqrt = Math.sqrt(i);
            int intSqrt = (int)doubleSqrt;

            // 정수로 형변환 한 제곱근을 곱했을 때 해당 숫자가 나온 경우 더하고, 아닌 경우 빼줍니다.
            if (intSqrt * intSqrt == i) {
                answer -= i;
            } else {
                answer += i;
            }
        }
        return answer;
    }
}

/*
테스트 1 〉	통과 (0.09ms, 80.4MB)
테스트 2 〉	통과 (0.04ms, 78.2MB)
테스트 3 〉	통과 (0.07ms, 71.7MB)
테스트 4 〉	통과 (0.02ms, 77.9MB)
테스트 5 〉	통과 (0.08ms, 64.7MB)
테스트 6 〉	통과 (0.04ms, 73.5MB)
테스트 7 〉	통과 (0.03ms, 77.7MB)
*/
