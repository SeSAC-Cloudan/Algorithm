package p0903;

public class Hyerin {
    public int[] solution(String s) {
        int length = s.length();
        int[] answer = new int[length];

        for(int i = 0; i < s.length(); i++) {
            answer[i] = -1;
        }

        for(int i=0; i<length; i++){
            char currentChar = s.charAt(i);
            for (int j = i - 1; j >= 0; j--) {
                if (s.charAt(j) == currentChar) {
                    answer[i] = i - j;
                    break;
                }
            }
        }

        return answer;
    }
}
