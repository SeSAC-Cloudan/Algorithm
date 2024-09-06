package p0910;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * 프로그래머스 lv.1
 * 두 개 뽑아서 더하기
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();

        int[] numbers1 = {2, 1, 3, 4, 1};
        int[] numbers2 = {5, 0, 2, 7};

        // [2, 3, 4, 5, 6, 7]
        System.out.println(Arrays.toString(j.solution(numbers1)));
        // [2, 5, 7, 9, 12]
        System.out.println(Arrays.toString(j.solution(numbers2)));
    }

    // 세 가지 풀이
    // 1. HashSet, Arrays.sort() 이용
    // 2. TreeSet 이용
    // 3. TreeSet, Stream 이용
    // 세 가지 방법 모두 시간 복잡도는 O(n^2 log n) 으로 동일

    // 1. HashSet 이용
    public int[] solution(int[] numbers) {
        Set<Integer> set = new HashSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            answer[index] = i;
            index++;
        }
        Arrays.sort(answer);
        return answer;
    }
    /*
    테스트 1 〉	통과 (0.42ms, 77.7MB)
    테스트 2 〉	통과 (0.44ms, 77.5MB)
    테스트 3 〉	통과 (0.38ms, 73.2MB)
    테스트 4 〉	통과 (0.38ms, 77.8MB)
    테스트 5 〉	통과 (0.49ms, 73.9MB)
    테스트 6 〉	통과 (0.65ms, 76.3MB)
    테스트 7 〉	통과 (0.99ms, 79MB)
    테스트 8 〉	통과 (0.93ms, 73.4MB)
    테스트 9 〉	통과 (1.31ms, 76.2MB)
     */

    // 2. TreeSet 이용
    public int[] solutionUsingTreeSet(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        int[] answer = new int[set.size()];
        int index = 0;
        for (Integer i : set) {
            answer[index] = i;
            index++;
        }
        return answer;
    }
    /*
    테스트 1 〉	통과 (0.48ms, 73.6MB)
    테스트 2 〉	통과 (0.62ms, 77.5MB)
    테스트 3 〉	통과 (0.55ms, 70.2MB)
    테스트 4 〉	통과 (0.62ms, 83.2MB)
    테스트 5 〉	통과 (0.74ms, 75.6MB)
    테스트 6 〉	통과 (1.41ms, 82.4MB)
    테스트 7 〉	통과 (3.66ms, 79.6MB)
    테스트 8 〉	통과 (4.10ms, 76.1MB)
    테스트 9 〉	통과 (2.17ms, 77.4MB)
     */

    // 3. TreeSet, Stream 이용
    public int[] solutionUsingStream(int[] numbers) {
        TreeSet<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length - 1; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                set.add(numbers[i] + numbers[j]);
            }
        }

        return set.stream().mapToInt(Integer::intValue).toArray();
    }
    /*
    테스트 1 〉	통과 (3.10ms, 79.6MB)
    테스트 2 〉	통과 (2.84ms, 76.3MB)
    테스트 3 〉	통과 (3.34ms, 77.9MB)
    테스트 4 〉	통과 (2.32ms, 73.8MB)
    테스트 5 〉	통과 (2.64ms, 80MB)
    테스트 6 〉	통과 (4.43ms, 72.4MB)
    테스트 7 〉	통과 (8.78ms, 67.4MB)
    테스트 8 〉	통과 (4.62ms, 69.8MB)
    테스트 9 〉	통과 (5.10ms, 72.5MB)
     */
}
