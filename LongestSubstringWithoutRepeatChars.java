import java.util.*;

class LongestSubWithoutRepeatChar {
    public int lengthOfLongestSubstring(String s) {
        int slow = 0, fast = 0, max = 0;
        Map<Character, Integer> map = new HashMap<>();
        while (fast < s.length()) {
            char ch = s.charAt(fast);
            if (map.containsKey(s.charAt(fast)) && (map.get(ch) >= slow)) {
                slow = map.get(ch) + 1;
            }
            map.put(ch, fast);
            int len = (fast - slow) + 1;
            max = Math.max(max, len);
            fast++;
        }
        return max;
    }
}