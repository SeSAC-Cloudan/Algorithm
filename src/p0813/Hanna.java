package p0813;

import java.util.Arrays;
import java.util.Comparator;

public class Hanna {
    public static void main(String[] args) {
        int[][] score = {{80, 70}, {90, 50}, {40, 70}, {50, 80}}; // {수학, 영어} 배열
        int[] ranks = solution(score);
        System.out.println("Ranks: " + Arrays.toString(ranks));
        //ranks 배열을 문자열로 변환하여 출력
    }

    public static int[] solution(int[][] score) {
        int length = score.length;
        int[] avg = new int[length]; // 평균 배열
        Integer[] indices = new Integer[length];  // 인덱스 배열(등수를 매길 때 사용)
        // com

        // 평균 계산 및 인덱스 저장
        for (int i = 0; i < length; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2;
            indices[i] = i;  // 인덱스를 저장
        }

        // 평균 점수를 기준으로 인덱스 배열 정렬    (내림차순)
        Arrays.sort(indices, new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                return Integer.compare(avg[b], avg[a]);  // 내림차순 정렬
            }
        });

        // 등수 매기기
        int[] ranks = new int[length];
        int rank = 1;

        for (int i = 0; i < length; i++) {
            if (i > 0 && avg[indices[i]] == avg[indices[i - 1]]) {
                ranks[indices[i]] = ranks[indices[i - 1]];  // 동일한 점수일 경우 이전과 같은 등수
            } else {
                ranks[indices[i]] = rank;  // 현재 등수를 부여
            }
            rank++;
        }


        return ranks;
    }

}

