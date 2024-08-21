package p0822;

import java.util.Stack;

public class Jinhee {
    public static void main(String[] args) {
        Jinhee j = new Jinhee();
        int[] arr = {1, 1, 3, 3, 0, 1, 1};
        j.solution(arr);
    }

    public int[] solution(int[] arr) {
        // 풀이에 활용할 Stack을 생성합니다.
        Stack<Integer> stack = new Stack<>();

        // 비교를 위해 배열의 가장 첫번째 요소를 Stack에 push합니다.
        stack.push(arr[0]);

        // peek을 이용해 Stack의 맨 위의 값과 비교하고 값이 다른 경우에만 push합니다.
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != stack.peek()) {
                stack.push(arr[i]);
            }
        }

        // int 타입의 배열로 반환하기 위해 stack size와 같은 배열을 만듭니다.
        int[] answer = new int[stack.size()];

        // Stack은 후입선출이기 때문에 반대의 순서대로 배열에 담기 위해
        // 배열의 마지막 인덱스부터 pop으로 꺼내온 값을 할당합니다.
        int length = stack.size();
        for (int i = length - 1; i >= 0; i--) {
            answer[i] = stack.pop();
        }
        return answer;
    }
}

