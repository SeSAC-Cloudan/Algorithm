package p0813;
import java.util.Arrays;

public class Hyerin {
    public int[] solution(int[][] score) {
        int[] answer = new int[score.length];
        double[] average = new double[score.length];

        for (int i = 0; i < score.length; i++) {
            average[i] = (score[i][0] + score[i][1])/2.0;
        }

        // 등수 초기화
        Arrays.fill(answer, 1);

        // 등수 계산
        for (int i = 0; i < average.length; i++) {
            for (int j = 0; j < average.length; j++) {
                if (average[i] < average[j]) {
                    answer[i]++;
                }
            }
        }

        return answer;
    }
}
