package medium;

//https://leetcode.com/problems/longest-palindromic-substring/
public class LongestPalindromicSubstring {

    String longestPalindrome(String s){

        if(s == null || s.length() < 1) return "";

        int start=0; int end=0;
        for(int i=0; i<s.length();i++){
            int len1 = getPalindromeLengthByExtendFromMiddle(s, i, i);
            int len2 = getPalindromeLengthByExtendFromMiddle(s, i, i+1);
            int len = Math.max(len1, len2);
            if(len > end - start){
                start = i - (len-1)/2;
                end = i + len/2;
            }
        }
        //Adding 1 at the end as substring end is not inclusive
        return s.substring(start, end+1);
    }

    private int getPalindromeLengthByExtendFromMiddle(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            left--;
            right++;
        }
        // we have to decrement right and increment left before calculating the length
        // as the length needs to be calculated inside the loop before the last increment decrement happens
        // so length calculation looks like (right -1) - (left + 1) + 1 => right - (left +1)
        // The bracket is important as 3 - -1 + 1 is not same as 3 - (-1+1)
        return right - (left +1);
    }
}
