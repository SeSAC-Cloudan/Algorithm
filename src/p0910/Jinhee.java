package p0910;

import java.util.TreeSet;

public class Jinhee {
    public static void main(String[] args) {
        int[] num = {2, 1, 3, 4, 1};
        Jinhee j = new Jinhee();
        j.solution(num);
    }

    public int[] solution(int[] numbers) {
        // 1. 자동으로 오름차순으로 정렬되는 TreeSet을 선언합니다.
        TreeSet<Integer> set = new TreeSet<>();

        // 2. 이중 for문을 이용해 모든 숫자를 더해 TreeSet에 추가합니다.
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int num = numbers[i] + numbers[j];
                set.add(num);
            }
        }

        // 3. TreeSet의 값을 옮길 배열과 index로 사용할 값을 선언합니다.
        int[] answer = new int[set.size()];
        int index = 0;

        // 4. TreeSet의 값을 하나씩 순서대로 배열에 담아 반환합니다.
        for (int number : set) {
            answer[index++] = number;
        }
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.54ms, 66.8MB)
테스트 2 〉	통과 (0.69ms, 67.5MB)
테스트 3 〉	통과 (0.76ms, 72.6MB)
테스트 4 〉	통과 (0.55ms, 72.2MB)
테스트 5 〉	통과 (0.92ms, 77.8MB)
테스트 6 〉	통과 (1.15ms, 77.1MB)
테스트 7 〉	통과 (3.24ms, 77.8MB)
테스트 8 〉	통과 (2.08ms, 75.2MB)
테스트 9 〉	통과 (1.71ms, 76MB)
 */
