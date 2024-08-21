package p0820;

public class Hyerin {
    public int solution(int left, int right) {
        int answer = 0;

        // 1. left가 right 값이 될때까지 반복
        for (int i = left; i <= right; i++) {
            int count = 0;

            // 2. num이 left 값이 될때까지 반복
            for (int num = 1; num <= i; num++) {
                // 3. left를 num으로 나눴을 때 나머지가 0이라면 (약수라면)
                //    count를 1씩 더하기 (약수의 개수 구하기)
                if ((i % num) == 0){
                    count++;
                }
            }

            // 4. count가 2로 나눴을 때 나머지가 0이라면(약수의 개수가 짝수라면)
            //    answer에 left(i)를 더해주고
            //    나머지가 있다면(약수의 개수가 홀수라면)
            //    answer에 left(i)를 빼주기
            if (count % 2 == 0) {
                answer += i;
            } else {
                answer -= i;
            }

        }

        return answer;
    }
}
