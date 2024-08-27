package p0827;

public class Jinhee {
    public static void main(String[] args) {
        String t = "5002223230839878";
        String p = "3455";

        Jinhee j = new Jinhee();
        j.solution(t, p);
    }

    public int solution(String t, String p) {
        int answer = 0;
        // t, p 문자열의 길이를 구합니다.
        int tLength = t.length();
        int pLength = p.length();

        // p의 길이만큼 t를 잘라내는 횟수를 선언합니다.
        int count = tLength - pLength + 1;

        // 비교를 위해 p를 형변환합니다.
        long pValue = Long.parseLong(p);

        // p의 길이만큼 t의 문자열을 substring을 이용해 잘라 비교하고 이를 count만큼 반복합니다.
        for (int i = 0; i < count; i++) {
            long num = Long.parseLong(t.substring(i, i + pLength));
            if (num <= pValue) {
                answer++;
            }
        }
        return answer;
    }
}

