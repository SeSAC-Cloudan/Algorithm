package p0808;

import java.util.Scanner;

public class Hanna {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("모스부호를 입력하세요");
        String letter = scan.nextLine();
        morse(letter);
    }

    public static void morse(String letter) {
        String [] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","....","..",
                ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        StringBuilder sb = new StringBuilder();

        String[] letters = letter.split("\\s+");

        char ans = 0;

        for (String ch : letters) {
            for(int i=0; i<morseCodes.length; i++) {
                if(ch.equals(morseCodes[i])) {
                    ans = (char)(97 + i); // a의 아스키 코드 97
                    sb = sb.append(ans);
                    break; // 모스 부호 매칭됨 (루프 돌 필요가 없음)

                }
            }
        }
        System.out.println(sb);
    }
}