package p0905;

import java.util.*;

public class Hyerin {
    public int[] solution(int[] array, int[][] commands) {

        //1. 답을 담을 answer 배열을 commands의 길이만큼 초기화한다.
        int[] answer = new int[commands.length];


        for (int i = 0; i < commands.length; i++) {
            int k = commands[i][2] - 1;

            //2. array의  i-1 부터 j 까지 자른 후, Arrays.copyOfRange 를 이용하여 subCommands 에 값을 넣어준다.
            int[] subCommands = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);

            //3. `subCommands` 를 오름차순 정렬한 후, `index = k-1` 에 위치한 값을 `answer` 배열에 넣어준다.
            Arrays.sort(subCommands);
            answer[i] = subCommands[k];
        }

        return answer;
    }

}
