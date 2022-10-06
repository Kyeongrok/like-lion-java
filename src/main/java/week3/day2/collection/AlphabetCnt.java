package week3.day2.collection;

import java.util.HashMap;

public class AlphabetCnt {

    public boolean isAlphabet(char ch) {
        if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z')) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        AlphabetCnt alphabetCnt = new AlphabetCnt();

        // 소문자는 --> 대문자로
        String s1 = "aabbccddefgh///ijk:kkhttps://www.kkllm".toUpperCase();
        // String을 한글자씩 출력할 수 있어야 한다.
        HashMap<Character, Integer> alphabetMap = new HashMap<>();
        for (char c = 'A'; c < 'Z'; c++) {
            alphabetMap.put(c, 0);
        }

        for (int i = 0; i < s1.length(); i++) {
            char c = s1.charAt(i);
            boolean isAlphabet = alphabetCnt.isAlphabet(c);
            if(isAlphabet) {
                // 여기에서만 개수를 센다
                alphabetMap.put(c, alphabetMap.get(c) + 1);
            }
        }
        System.out.println(alphabetMap);
    }
}
