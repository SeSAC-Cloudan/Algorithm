package p0905;

import java.util.Arrays;

public class Hanna {

    public static void main(String[] args) {
        int[] array = {1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
        int[] result = solution(array, commands);

        for(int i : result){
            System.out.println(i); // 5, 6, 3
        }
    }


    public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length]; // 정답

        // 이중 for문
        for(int j =0; j< commands.length; j++) { // 각 배열의
            int start = commands[j][0] -1; // 시작 숫자
            int end = commands[j][1]-1; // 끝 숫자
            int k = commands[j][2]; // k번째 숫자

            // 필요한 배열 길이만큼 배열 생성
            int[] fromStartToEnd = new int[end-start + 1];

            for(int i=start; i<=end; i++) {
                fromStartToEnd[i-start] = array[i]; // 배열에 값 주기
            }
            Arrays.sort(fromStartToEnd); // 정렬
            answer[j] = fromStartToEnd[k-1]; // for문 돌면서 정답 배열에 정답 추가
        }
        return answer;
    }
}

/*

import java.util.Arrays;
class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        int a = 0;
        for(int[] info : commands){
            int i = info[0];
            int j = info[1];
            int k = info[2];

            int[] buf = Arrays.copyOfRange(array,i-1,j);
            Arrays.sort(buf);
            answer[a] = buf[k-1];
            a++;
        }

        return answer;
    }
}
*/
