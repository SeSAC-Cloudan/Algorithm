package p0815;

import java.util.ArrayList;
import java.util.Collections;

public class Hyerin {
    public static void main(String[] args) {
        Hyerin h = new Hyerin();
        System.out.println(h.solution(118372));     // 873211
    }

    public long solution(long n) {
        ArrayList<Integer> arr = new ArrayList<>();

        while (n > 0) {
            arr.add((int)(n % 10));
            n /= 10;
        }

        Collections.sort(arr, Collections.reverseOrder());

        long answer = 0;
        for (int a : arr) {
            answer = answer * 10 + a;
        }

        return answer;
    }
}

/*
테스트 1 〉	통과 (0.31ms, 74.7MB)
테스트 2 〉	통과 (0.71ms, 76.4MB)
테스트 3 〉	통과 (0.25ms, 72.3MB)
테스트 4 〉	통과 (0.54ms, 85MB)
테스트 5 〉	통과 (0.25ms, 77.2MB)
테스트 6 〉	통과 (0.29ms, 73.3MB)
테스트 7 〉	통과 (0.28ms, 77.6MB)
테스트 8 〉	통과 (0.26ms, 72.9MB)
테스트 9 〉	통과 (0.36ms, 74.3MB)
테스트 10 〉	통과 (0.38ms, 76.7MB)
테스트 11 〉	통과 (0.24ms, 76.5MB)
테스트 12 〉	통과 (0.26ms, 80.5MB)
테스트 13 〉	통과 (0.35ms, 76.4MB)
테스트 14 〉	통과 (0.37ms, 73.8MB)
테스트 15 〉	통과 (0.35ms, 76.4MB)
테스트 16 〉	통과 (0.26ms, 76.9MB)
 */
