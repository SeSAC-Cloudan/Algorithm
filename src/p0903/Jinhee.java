package p0903;

public class Jinhee {
    public static void main(String[] args) {
        Jinhee j = new Jinhee();
        String str = "foobar";
        j.solution(str);
    }

    public int[] solution(String s) {
        // 1. 문자열의 길이와 같은 길이로 배열을 선언합니다.
        int length = s.length();
        int[] answer = new int[length];

        // 2. 앞에 글자가 없는 가장 첫번째 배열에는 -1을 할당합니다.
        answer[0] = -1;

        // 3. 가장 뒤에 있는 글자부터 'num' 변수에 담아 비교합니다.
        for (int i = length - 1; i >= 0; i--) {
            int num = s.charAt(i);

            // 4. 비교하는 글자의 바로 앞 글자부터 비교합니다.
            for (int j = i - 1; j >= 0; j--) {

                // 5. 같은 글자를 만나면 몇 칸 앞에 있는지 계산하여 해당 위치에 할당하고 break를 통해 빠져나옵니다.
                if (num == s.charAt(j)) {
                    answer[i] = i - j;
                    break;

                    // 6. j가 0이 될때까지 같은 글자를 만나지 못하면 -1을 할당합니다.
                } else if (j == 0) {
                    answer[i] = -1;
                }
            }
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.02ms, 77.7MB)
테스트 2 〉	통과 (0.13ms, 77.3MB)
테스트 3 〉	통과 (0.09ms, 74.2MB)
테스트 4 〉	통과 (1.10ms, 80.2MB)
테스트 5 〉	통과 (7.97ms, 91.1MB)
테스트 6 〉	통과 (4.89ms, 74.7MB)
테스트 7 〉	통과 (7.80ms, 80.6MB)
테스트 8 〉	통과 (2.31ms, 76.9MB)
테스트 9 〉	통과 (5.43ms, 78.6MB)
테스트 10 〉	통과 (1.36ms, 75.5MB)
테스트 11 〉	통과 (5.65ms, 78.3MB)
테스트 12 〉	통과 (0.01ms, 78MB)
테스트 13 〉	통과 (0.02ms, 84.1MB)
테스트 14 〉	통과 (0.44ms, 78.1MB)
테스트 15 〉	통과 (0.01ms, 77.2MB)
테스트 16 〉	통과 (0.04ms, 68.4MB)
테스트 17 〉	통과 (0.05ms, 72.4MB)
테스트 18 〉	통과 (2.54ms, 77.5MB)
테스트 19 〉	통과 (2.25ms, 78MB)
테스트 20 〉	통과 (0.58ms, 77.5MB)
테스트 21 〉	통과 (0.09ms, 80.1MB)
테스트 22 〉	통과 (3.45ms, 75.7MB)
테스트 23 〉	통과 (0.44ms, 71.5MB)
테스트 24 〉	통과 (0.53ms, 79.9MB)
테스트 25 〉	통과 (0.69ms, 78.3MB)
테스트 26 〉	통과 (0.11ms, 75.1MB)
테스트 27 〉	통과 (1.04ms, 76.7MB)
테스트 28 〉	통과 (0.61ms, 72.7MB)
테스트 29 〉	통과 (0.02ms, 71.6MB)
테스트 30 〉	통과 (7.39ms, 83.6MB)
 */
