package p0808;

import java.util.HashMap;
import java.util.Map;

public class Jinhee {
    public static String solution(String letter) {
        String morse = "'.-':'a','-...':'b','-.-.':'c','-..':'d','.':'e','..-.':'f'," +
                "'--.':'g','....':'h','..':'i','.---':'j','-.-':'k','.-..':'l'," +
                "'--':'m','-.':'n','---':'o','.--.':'p','--.-':'q','.-.':'r'," +
                "'...':'s','-':'t','..-':'u','...-':'v','.--':'w','-..-':'x'," +
                "'-.--':'y','--..':'z'";

        String[] mo = morse.split(",");

        Map<String, String> morseLetter = new HashMap<>();
        for (int i = 0; i < mo.length; i++) {
            String m = mo[i];   // '.-':'a'
            String[] mm = m.split(":");
            for (int j = 0; j < 2; j++) {
                String key = mm[0].replace("'", "");
                String value = mm[1].replace("'", "");
                morseLetter.put(key, value);
            }
        }

        String[] mLetter = letter.split(" ");
        String result = "";

        for (int m = 0; m < mLetter.length; m++) {
            String value = morseLetter.get(mLetter[m]);
            result += value;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.printf(solution("-.-. .-.. --- ..- -.. .- -."));

    }
}
