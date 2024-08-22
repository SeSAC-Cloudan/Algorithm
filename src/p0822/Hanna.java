package p0822;

import java.util.*;

public class Hanna {
    public static void main(String[] args) {
        int[] array = {1, 1, 3, 3, 0, 1, 1};
        int[] result = solution(array);
        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }

    public static int[] solution(int[] array) {

        Stack<Integer> stack = new Stack<>(); // 스택 생성

        // array 돌리면서 조건에 맞는 값 스택에 추가
        for (int i = 0; i < array.length; i++) {
            if (stack.isEmpty()) { // 스택이 비어 있으면
                stack.push(array[i]); // 무조건 하나의 값을 추가한다
            } else {
                // 스택의 맨 위의 값과 배열 값 비교해서 값이 다를 때에만 배열 값 추가
                if (stack.peek() != array[i]) { 
                    stack.push(array[i]);
                }
            }
        }
        int[] answer = new int[stack.size()]; // 스택에 있는 값 배열에 추가
        for (int i = stack.size() - 1; i >= 0; i--) { // 스택 맨 위의 값을 배열 맨 뒤에 오도록
            answer[i] = stack.pop();
        }
        return answer;
    }
}