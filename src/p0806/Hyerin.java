package p0806;
import java.util.ArrayList;

public class Hyerin {
  public String solution(String letter) {
    // 1. 편지 글자 분리하기
    String[] letterList = letter.split(" ");
    
    // 2. 모스부호 배열 만들기
    String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};

    // 3. 번역된 값을 담을 list 만들기
    ArrayList<Character> list = new ArrayList<>();


    // 4. 분리된 편지글자를 모스부호로 변환하여 list에 담기
    for (int i = 0; i < letterList.length; i++) {
      for (int j = 0; j < morse.length; j++) {
          if (morse[j].equals(letterList[i])) {
              list.add((char) ('a' + j));
              break;
          }
      }
    }

    // 5. list에 담긴 char 값을 String으로 변환하여 문장으로 이어 붙이기
    StringBuilder result = new StringBuilder();
    for (char ch : list) {
      result.append(ch);
    }
    
    // 6. 결과 출력하기
    return result.toString();
  }
}
