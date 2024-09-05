package p0905;

import java.util.Arrays;

public class Jinhee {
    public static void main(String[] args) {
        int[][] commands = {{2, 5, 3},
                            {4, 4, 1},
                            {1, 7, 3}};
        int[] array = {1, 5, 2, 6, 3, 7, 4};

        Jinhee j = new Jinhee();
        j.solution(array, commands);

    }

    public int[] solution(int[] array, int[][] commands) {
        // 1. 이차원 배열인 commands 행의 수 만큼 배열을 선언합니다.
        int[] answer = new int[commands.length];

        // 2. 본 작업은 commands의 행의 수 만큼 반복됩니다.
        for (int i = 0; i < commands.length; i++) {

            // 3. copyOfRange를 이용해 array 배열에서 해당 부분 만큼의 인덱스를 설정해 추출하여 정렬합니다.
            int[] numArr = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            Arrays.sort(numArr);

            // 4. 문제에서 주어진 숫자는 배열의 인덱스가 아닌 1부터 시작하는 위치이기 때문에 '-1'을 하여 answer에 할당합니다.
            answer[i] = numArr[commands[i][2] - 1];
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.47ms, 91.5MB)
테스트 2 〉	통과 (0.47ms, 72.4MB)
테스트 3 〉	통과 (0.44ms, 75.9MB)
테스트 4 〉	통과 (0.51ms, 75MB)
테스트 5 〉	통과 (0.51ms, 71.5MB)
테스트 6 〉	통과 (0.48ms, 82MB)
테스트 7 〉	통과 (0.55ms, 78.5MB)
 */
