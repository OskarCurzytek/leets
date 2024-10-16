import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

class Solution {
    public boolean isValid(String s) {

        Stack<Character> st = new Stack<>();
        Map<Character, Character> m = new HashMap<>();

        m.put(')', '(');
        m.put(']', '[');
        m.put('}', '{');



        for(char c : s.toCharArray()){
            if(m.containsValue(c)){
                st.push(c);
            }else if (m.containsKey(c)){
                if(st.isEmpty() || m.get(c) != st.pop()){
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}