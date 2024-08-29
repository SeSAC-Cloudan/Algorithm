package p0829;

/*
 	"try hello world"	"TrY HeLlO WoRlD"

	 문자열 s는 한 개 이상의 단어로 구성되어 있습니다.
	 각 단어는 하나 이상의 공백문자로 구분되어 있습니다.
	 각 단어의 짝수번째 알파벳은 대문자로,
	 홀수번째 알파벳은 소문자로 바꾼 문자열을 리턴하는 함수, solution을 완성하세요.

	 제한사항) 단어(공백을 기준)별로 짝/홀수 인덱스를 판단해야합니다.
	 첫 번째 글자는 0번째 인덱스로 보아 짝수번째 알파벳으로 처리해야 합니다.
 */

public class Hanna {
    public static void main(String[] args) {
        String sentence = "try hello world";
        String answer = solution(sentence);
        System.out.println(answer);
    }

    public static String solution(String s) {
        StringBuilder result = new StringBuilder();
        String[] words = s.split(" ", -1);  // 공백도 포함하여 나눔

        for (int j = 0; j < words.length; j++) { // 단어별로 쪼개고
            char[] wordToChar = words[j].toCharArray(); // 글자 하나씩 잘라서 담을 char[]

            for (int i = 0; i < wordToChar.length; i++) {
                if (i % 2 == 0) {  // 짝수 인덱스 대문자
                    wordToChar[i] = Character.toUpperCase(wordToChar[i]);
                } else {  // 홀수 인덱스 소문자
                    wordToChar[i] = Character.toLowerCase(wordToChar[i]);
                }
            }

            result.append(new String(wordToChar));

            if (j < words.length - 1) {
                result.append(" ");  // 단어 사이에 공백 추가
            }
        }
        return result.toString();  // 최종 문자열 반환
    }
}

