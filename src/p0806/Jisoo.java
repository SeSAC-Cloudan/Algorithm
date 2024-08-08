package p0806;

import java.util.HashMap;
import java.util.Map;

public class Jisoo {
    public static void main(String[] args) {
        Jisoo j = new Jisoo();
        System.out.println(j.solution(".... . .-.. .-.. ---"));     // hello
        System.out.println(j.solution(".--. -.-- - .... --- -."));  // python
    }

    public String solution(String letter) {
        Map<String, Character> map = new HashMap<>();
        map.put(".-", 'a');
        map.put("-...", 'b');
        map.put("-.-.", 'c');
        map.put("-..", 'd');
        map.put(".", 'e');
        map.put("..-.", 'f');
        map.put("--.", 'g');
        map.put("....", 'h');
        map.put("..", 'i');
        map.put(".---", 'j');
        map.put("-.-", 'k');
        map.put(".-..", 'l');
        map.put("--", 'm');
        map.put("-.", 'n');
        map.put("---", 'o');
        map.put(".--.", 'p');
        map.put("--.-", 'q');
        map.put(".-.", 'r');
        map.put("...", 's');
        map.put("-", 't');
        map.put("..-", 'u');
        map.put("...-", 'v');
        map.put(".--", 'w');
        map.put("-..-", 'x');
        map.put("-.--", 'y');
        map.put("--..", 'z');

        String[] splits = letter.split(" +");
        StringBuilder sb = new StringBuilder();

        for (String mos : splits) {
            sb.append(map.get(mos));
        }

        return sb.toString();
    }
}
