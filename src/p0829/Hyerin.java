package p0829;

public class Hyerin {
    public String solution(String s) {
        StringBuilder answer = new StringBuilder();
        // 1) split으로 공백 기준 분리 (연속된 공백 처리를 위해 -1)
        String[] words = s.split(" ", -1);

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            for (int j = 0; j < word.length(); j++) {
                // 2) char로 처리
                char c = word.charAt(j);
                // 3) 인덱스 처리
                if (j % 2 == 0) {
                    // 짝수 인덱스 대문자
                    answer.append(Character.toUpperCase(c));
                } else {
                    // 홀수 인덱스 소문자
                    answer.append(Character.toLowerCase(c));
                }
            }
            if (i < words.length - 1) {
                answer.append(" "); // 단어 사이에 공백 추가
            }
        }
        return answer.toString();
    }
}

