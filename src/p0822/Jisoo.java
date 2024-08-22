package p0822;

import java.util.Arrays;
import java.util.Stack;

/**
 * 프로그래머스 lv.1 같은 숫자는 싫어
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();

        int[] arr1 = {1, 1, 3, 3, 0, 1, 1};
        int[] arr2 = {4, 4, 4, 3, 3};

        System.out.println(Arrays.toString(j.solution(arr1)));      // [1, 3, 0, 1]
        System.out.println(Arrays.toString(j.solution(arr2)));      // [4, 3]
    }

    // 내 풀이
    // 스택 이용
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        // Stack 자료구조가 비어 있을 때 peek()을 쓰게 되면 EmptyStackException이 발생하므로 첫 원소를 넣어줍니다.
        stack.push(arr[0]);

        // Stack 의 가장 밖에 있는 원소(peek())가 현재 원소(arr[i])와 다른 경우에만 현재 원소를 Stack에 삽입합니다.
        for (int i = 1; i < arr.length; i++) {
            if (stack.peek() != arr[i]) {
                stack.push(arr[i]);
            }
        }

        // 반환할 배열을 만들어 줍니다.
        int[] answer = new int[stack.size()];

        // 배열에 pop()메서드를 이용하여 거꾸로 원소를 삽입합니다.
        for (int i = answer.length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }

        return answer;
    }
}
/*
정확성  테스트
테스트 1 〉	통과 (0.13ms, 73.5MB)
테스트 2 〉	통과 (0.30ms, 77.9MB)
테스트 3 〉	통과 (0.31ms, 77.5MB)
테스트 4 〉	통과 (0.31ms, 80.1MB)
테스트 5 〉	통과 (0.29ms, 71.4MB)
테스트 6 〉	통과 (0.19ms, 71.5MB)
테스트 7 〉	통과 (0.30ms, 78.4MB)
테스트 8 〉	통과 (0.20ms, 82.4MB)
테스트 9 〉	통과 (0.24ms, 78.5MB)
테스트 10 〉	통과 (0.23ms, 74.4MB)
테스트 11 〉	통과 (0.26ms, 88.9MB)
테스트 12 〉	통과 (0.24ms, 79MB)
테스트 13 〉	통과 (0.27ms, 74.8MB)
테스트 14 〉	통과 (0.21ms, 75MB)
테스트 15 〉	통과 (0.21ms, 77.2MB)
테스트 16 〉	통과 (0.24ms, 76.3MB)
테스트 17 〉	통과 (0.13ms, 74.3MB)

효율성  테스트
테스트 1 〉	통과 (45.14ms, 111MB)
테스트 2 〉	통과 (45.55ms, 118MB)
테스트 3 〉	통과 (46.19ms, 111MB)
테스트 4 〉	통과 (46.81ms, 120MB)
 */
