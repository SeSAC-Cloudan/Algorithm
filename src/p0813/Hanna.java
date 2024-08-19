package p0813;

import java.util.*;

public class Hanna {
    public int[] solution(int[][] score) {
        int l = score.length;
        List<Integer> list = new ArrayList<>(); // 점수 담을 arraylist
        for (int[] x : score)
            list.add(x[0] + x[1]); //영어+수학 점수

        list.sort(Collections.reverseOrder()); // 내림차순 정렬

        int[] result = new int[l];

        for (int i = 0; i < l; i++)
            result[i] = list.indexOf(score[i][0] + score[i][1]) + 1;
                        //합에 해당하는 인덱스 + 1

        return result;
    }
}
