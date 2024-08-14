package p0815;

import java.util.Arrays;
import java.util.Collections;

public class Hanna {
    public static void main(String[] args) {
        Long result = solution(8000000000L);
        System.out.println(result);
    }

    public static long solution(long n) {
        String[] digits;
        long result = 0; // 최종 결과값
        if (n >= 1 && n <= 8000000000L) {
            // 1) 숫자 -> 문자열 변환
            String number = String.valueOf(n); // String.valueOf(n) 숫자 -> 문자열로 변환
            digits = number.split(""); // 문자열 한 글자씩 쪼개 배열로 만들기
            Arrays.sort(digits, Collections.reverseOrder()); // 내림차순 정렬

            StringBuilder sb = new StringBuilder();
            // 정렬된 배열 출력
            for (String temp : digits) {
                sb.append(temp);
            }

            // 2) 문자열 -> 정수 변환
            String sbToString = sb.toString();
            //StringBuilder 객체는 toString() 메서드를 통해 문자열로 변환해야 Long.parseLong() 메서드에 사용 가능
            result = Long.parseLong(sbToString);
        }
        return result;
    }
}
