package p0813;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Programmers lv.0
 * 등수 매기기
 */
public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();

        int[][] score1 = {{80, 70}, {90, 50}, {40, 70}, {50, 80}};
        int[][] score2 = {{80, 70}, {70, 80}, {30, 50}, {90, 100}, {100, 90}, {100, 100}, {10, 30}};

        System.out.println(Arrays.toString(j.solution(score1)));        // 1 2 4 3
        System.out.println(Arrays.toString(j.solution(score2)));        // 4 4 6 2 2 1 7
    }

    /*
    테스트 1 〉	통과 (1.08ms, 79.3MB)
    테스트 2 〉	통과 (0.90ms, 74.2MB)
    테스트 3 〉	통과 (0.83ms, 74.5MB)
    테스트 4 〉	통과 (0.67ms, 74.2MB)
    테스트 5 〉	통과 (0.66ms, 72.9MB)
    테스트 6 〉	통과 (0.93ms, 76.6MB)
    테스트 7 〉	통과 (0.76ms, 74.5MB)
    테스트 8 〉	통과 (0.72ms, 72.4MB)
    테스트 9 〉	통과 (0.77ms, 78.9MB)
    테스트 10 〉	통과 (0.80ms, 75.1MB)
    테스트 11 〉	통과 (0.90ms, 81.6MB)
    테스트 12 〉	통과 (1.02ms, 76.9MB)
     */
    public int[] solution(int[][] score) {
        // 학생 리스트를 만듭니다.
        List<Student> list = new ArrayList<>();

        // score를 for문으로 돌면서 학생 객체를 만들고 list에 저장합니다.
        for (int i = 0; i < score.length; i++) {
            list.add(
                new Student(
                    i,
                    ((score[i][0] + score[i][1]) / 2.0)
                )
            );
        }

        // list를 학생의 평점을 기준으로 내림차순 정렬합니다.
        list.sort((a, b) -> Double.compare(b.avg, a.avg));

        // 등수를 반환할 배열을 정의합니다.
        int[] answer = new int[score.length];

        // answer에 들어갈 등수 int rank를 정의합니다.
        int rank = -1;
        // list를 for문으로 돌면서 이전 작업에서 넣었던 점수를 기록하기 위해 preScore를 정의합니다.
        double preScore = 0;
        for (int i = 0; i < list.size(); i++) {
            Student student = list.get(i);
            // 이전에 넣었던 점수가 지금 학생의 점수와 다르다면 rank, preScore를 업데이트하고 answer에 해당 학생을 기록합니다.
            if (preScore != student.avg) {
                rank = i + 1;
                preScore = student.avg;
                answer[student.index] = rank;
            } else {    // 같다면 rank, preScore를 업데이트하지 않고 answer에 해당 학생을 기록합니다.
                answer[student.index] = rank;
            }
        }

        return answer;
    }

    class Student {
        int index;
        double avg;

        public Student(int index, double avg) {
            this.index = index;
            this.avg = avg;
        }
    }
}
