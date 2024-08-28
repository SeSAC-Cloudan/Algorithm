package p0829;

public class Jinhee {

    public static void main(String[] args) {
        String s = "try hello world";
        Jinhee j = new Jinhee();
        j.solution(s);
    }

    public String solution(String s) {

        // 1. index로 사용할 변수와 StringBuilder를 선언합니다.
        StringBuilder sb = new StringBuilder();
        int index = 0;

        // 2. 문자열의 0번째부터 1개씩 추출합니다.
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // 3. 공백인 경우 index를 다시 0으로 초기화하고, 문자열에 공백을 추가합니다.
            if (ch == ' ') {
                sb.append(ch);
                index = 0;
            } else {

                // 4. index를 2로 나누어 0이면 짝수이므로 대문자, 0이 아닌 경우는 소문자로 바꿔 문자열에 추가합니다.
                if (index % 2 == 0) {
                    sb.append(Character.toUpperCase(ch));
                } else {
                    sb.append(Character.toLowerCase(ch));
                }

                // 5. 문자열에서 추출한 char가 공백이 아닌경우 index를 1씩 증가시킵니다.
                index++;
            }
        }

        // 6. StringBuilder를 형변환하여 반환합니다.
        String answer = sb.toString();
        return answer;
    }
}
/*
테스트 1 〉	통과 (0.06ms, 76.5MB)
테스트 2 〉	통과 (0.06ms, 71.2MB)
테스트 3 〉	통과 (0.06ms, 76.1MB)
테스트 4 〉	통과 (0.10ms, 72.8MB)
테스트 5 〉	통과 (0.12ms, 76MB)
테스트 6 〉	통과 (0.03ms, 71.3MB)
테스트 7 〉	통과 (0.07ms, 81.9MB)
테스트 8 〉	통과 (0.08ms, 72.1MB)
테스트 9 〉	통과 (0.04ms, 74.7MB)
테스트 10 〉	통과 (0.07ms, 74.9MB)
테스트 11 〉	통과 (0.06ms, 72.9MB)
테스트 12 〉	통과 (0.06ms, 74.7MB)
테스트 13 〉	통과 (0.05ms, 73.8MB)
테스트 14 〉	통과 (0.04ms, 76.6MB)
테스트 15 〉	통과 (0.04ms, 78.7MB)
테스트 16 〉	통과 (0.07ms, 72.6MB)
 */

