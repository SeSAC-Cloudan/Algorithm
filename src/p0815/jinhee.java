package p0815;

import java.util.Arrays;
import java.util.Collections;

public class jinhee {

    public static void main(String[] args) {
        jinhee j = new jinhee();
        System.out.println(j.solution(4890293));
    }

    public long solution(long n) {

        // 입력받은 숫자를 String으로 변환하여 split을 통해 나누어 String 배열에 담습니다.
        String str = String.valueOf(n);
        String[] strArr = str.split("");

        // 배열을 정렬합니다.
        Arrays.sort(strArr, Collections.reverseOrder());

        // StringBuilder와 반복문을 통해 정렬된 값을 이어붙여줍니다.
        StringBuilder num = new StringBuilder();

        for (int i = 0; i < strArr.length; i++) {
            num.append(strArr[i]);
        }

        // 값을 형변환합니다.
        long answer = Long.parseLong(String.valueOf(num));

        return answer;
    }
}
