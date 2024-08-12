package p0813;

import java.util.Arrays;
import java.util.Comparator;

// 1. 입력된 이차원 배열을 더 쉽게 다루기 위한 Student Class
class Student {
    public int index; // 배열 인덱스
    public int eng; // 영어
    public int math; // 수학
    public double avg; // 평균
    public int rank; // 등수

    @Override
    public String toString() {
        return "Student{" +
                "index=" + index +
                ", eng=" + eng +
                ", math=" + math +
                ", avg=" + avg +
                ", rank=" + rank +
                '}';
    }

    public Student(int eng, int math) {
        this.eng = eng;
        this.math = math;
        this.avg = (double) (eng + math) / 2;
    }
}

public class Jinhee {
    public static int[] solution(int[][] score) {

        // 2. 입력된 이차원 배열 사이즈와 동일한 Student 배열 선언
        int arrLength = score.length;
        Student[] sArr = new Student[arrLength];

        // 3. 반복문을 이용해 Student 객체에 영어, 수학 점수, 인덱스 할당
        for (int i = 0; i < score.length; i++) {
            sArr[i] = new Student(score[i][0], score[i][1]);
            sArr[i].index = i;
        }

        // 4. Student Array의 avg를 기준으로 내림차순 정렬
        Arrays.sort(sArr, Comparator.comparingDouble((Student s) -> s.avg).reversed());

        // 5. 정렬된 순서대로 학생 객체의 rank 할당
        for (int i = 0; i < arrLength; i++) {
            sArr[i].rank = i + 1;
        }

        // 6. 등수를 담을 ranks 배열 생성하고 rank 변수 선언
        int[] ranks = new int[arrLength];
        int rank = 1;

        // 7. 정렬되어 있는 상태로 바로 앞의 평균과 비교해 같을 경우 두개의 rank를 같게 하고 아닌 경우 증감된 rank 할당
        for (int i = 0; i < arrLength; i++) {
            if (i > 0 && sArr[i].avg == sArr[i - 1].avg) {
                ranks[sArr[i].index] = ranks[sArr[i - 1].index];
            } else {
                ranks[sArr[i].index] = rank;
            }
            rank++;
        }

        System.out.println(Arrays.toString(sArr));
        System.out.println(Arrays.toString(ranks));

        return ranks;
    }

    public static void main(String[] args) {
        int[][] array = {
                {80, 70},
                {70, 80},
                {30, 50},
                {90, 100},
                {100, 90},
                {100, 100},
                {10, 30}
        };

        solution(array);
    }
}
