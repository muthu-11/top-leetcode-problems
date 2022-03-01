package medium;

import java.util.HashMap;
import java.util.Map;

//https://leetcode.com/problems/longest-substring-without-repeating-characters/
public class LongestSubstring {

    int length(String s){

        if(s==null || s.length()==0)
            return 0;

        int maxLength=0;

        Map<Character, Integer> map = new HashMap<>();
        int begin=0;
        boolean hasRepeatedChar=false;

        for(int end=0; end<s.length();end++){
            char ch = s.charAt(end);
            map.put(ch, map.getOrDefault(ch, 0) +1);
            if(map.get(ch) > 1)
                hasRepeatedChar=true;

            while(hasRepeatedChar){
                char c = s.charAt(begin++);
                if(map.get(c) > 1)
                    hasRepeatedChar=false;
                map.put(c, map.get(c) - 1);
            }
            maxLength = Math.max(maxLength, (end - begin) + 1);
        }
        return maxLength;
    }
}

