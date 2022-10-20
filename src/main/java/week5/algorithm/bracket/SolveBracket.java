package week5.algorithm.bracket;

import java.util.Stack;

public class SolveBracket {
    public boolean solveBracketReplace(String s) {
        while (s.indexOf("()") >= 0) {
            s = s.replace("()", "");
        }
        return s.length() == 0;
    }
    public boolean solveBracketSplitJoin(String s) {
        String[] arr = s.split("()");
        s = String.join("", arr);
        return s.length() == 0;
    }
    public boolean solveBracketStack(String s) {
        Stack<String> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == '('){
                st.push(String.valueOf(s.charAt(i)));
            } else if (s.charAt(i) == ')') {
                if (st.empty()) return false;
                st.pop();
            }
        }
        return st.empty();
    }
    public static void main(String[] args) {
        String s = "((((((((((((((((((((((((((((((((((((((((((((((((()))))))))))))))))))))))))))))))))))))))))))))))))))))";
        s = "(".repeat(5_000_000) + ")".repeat(5_000_001);
        SolveBracket sb = new SolveBracket();
//        System.out.println(sb.solveBracketReplace(s));
        System.out.println(sb.solveBracketStack(s));
//        System.out.println(sb.solveBracketReplace(""));
//        System.out.println(sb.solveBracketReplace("()"));
//        System.out.println(sb.solveBracketSplitJoin(s));
    }
}
