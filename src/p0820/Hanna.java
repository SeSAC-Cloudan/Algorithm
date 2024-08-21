package p0820;

import java.util.ArrayList;

public class Hanna {
    public static void main(String[] args) {
        int answer = solution(13, 17);
        System.out.println(answer);
    }

    public static int solution(int left, int right) {
        int answer = 0; // 정답

        // 1) left, right 조건 중족여부 확인
        boolean status = false;
        if (left >= 1 && left <= 1000 && left <= right) {
            if (right >= 1 && right <= 1000) {
                status = true;
            }
        }

        // 2) 조건 충족 시:
        if (status) {
            for (int i = left; i <= right; i++) {  // left ~ right 사이의 숫자들
                int count = 0; // 약수 개수
                for (int j = 1; j <= i; j++) { // 약수 개수 구하기
                    if (i % j == 0) count++;
                }

                // 3) 어떤 숫자의 약수 개수가 2로 나뉘면 숫자를 더해주고
                // 아니면 숫자를 빼준다
                if (count % 2 == 0) {
                    answer += i;
                } else {
                    answer -= i;
                }
            }
        }
        return answer;
    }
}
