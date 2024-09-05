package p0905;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * 프로그래머스 lv.1
 * K번째 수
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        // [5, 6, 3]
        System.out.println(Arrays.toString(j.solution(array, commands)));
        System.out.println(Arrays.toString(j.solutionUsingList(array, commands)));
    }

    // 1. Stream API를 활용한 풀이
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0];
            int end = commands[i][1];
            int target = commands[i][2];

            answer[i] = Arrays.stream(array)
                .skip(start - 1)                 // start번째 원소부터 시작
                .limit(end - start + 1)     // start부터 end까지의 갯수만큼 뽑아서
                .sorted()                           // 정렬 후
                .toArray()[target - 1];             // 배열로 만든 뒤, target번째 원소 찾기
        }
        return answer;
    }
    /*
    Stream API를 활용한 풀이 (Stream을 쓰면 코드가 짧아지지만 살짝 느려져요!)

    테스트 1 〉	통과 (2.37ms, 75.5MB)
    테스트 2 〉	통과 (7.82ms, 84.3MB)
    테스트 3 〉	통과 (5.45ms, 72.4MB)
    테스트 4 〉	통과 (5.45ms, 79.1MB)
    테스트 5 〉	통과 (19.37ms, 73.5MB)
    테스트 6 〉	통과 (2.75ms, 75.3MB)
    테스트 7 〉	통과 (3.59ms, 77.4MB)
     */

    // 2. List를 활용한 풀이
    public int[] solutionUsingList(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i = 0; i < commands.length; i++) {
            int start = commands[i][0] - 1;
            int end = commands[i][1] - 1;
            int target = commands[i][2] - 1;

            List<Integer> list = new ArrayList<>();
            for (int j = start; j <= end; j++) {
                list.add(array[j]);
            }
            Collections.sort(list);
            answer[i] = list.get(target);
        }
        return answer;
    }
    /*
    List를 활용한 풀이 (Stream에 비해서 확실히 더 빨라졌죠?)
    테스트 1 〉	통과 (0.21ms, 77.8MB)
    테스트 2 〉	통과 (0.28ms, 76.4MB)
    테스트 3 〉	통과 (0.26ms, 77.5MB)
    테스트 4 〉	통과 (0.27ms, 82.2MB)
    테스트 5 〉	통과 (0.31ms, 77.8MB)
    테스트 6 〉	통과 (0.18ms, 76.7MB)
    테스트 7 〉	통과 (0.25ms, 79.4MB)
     */
}
