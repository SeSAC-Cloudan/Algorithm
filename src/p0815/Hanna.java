package p0815;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hanna {
//    public static long solution(long n) {
//        String[] digits;
//        long result = 0; // 최종 결과값
//        if (n >= 1 && n <= 8000000000L) {
//            // 1) 숫자 -> 문자열 변환
//            String number = String.valueOf(n); // String.valueOf(n) 숫자 -> 문자열로 변환
//            digits = number.split(""); // 문자열 한 글자씩 쪼개 배열로 만들기
//            Arrays.sort(digits, Collections.reverseOrder()); // 내림차순 정렬
//
//            StringBuilder sb = new StringBuilder();
//            // 정렬된 배열 출력
//            for (String temp : digits) {
//                sb.append(temp);
//            }
//
//            // 2) 문자열 -> 정수 변환
//            String sbToString = sb.toString();
//            //StringBuilder 객체는 toString() 메서드를 통해 문자열로 변환해야 Long.parseLong() 메서드에 사용 가능
//            result = Long.parseLong(sbToString);
//        }
//        return result;
//    }

    public static int[] solution(int[][] score) {
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
