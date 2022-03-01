package medium;

public class LongestPalindromicSubstring {

    private int start,end,len;
    public String longestPalindrome(String s) {
        if(s == null || s.length() < 1) return "";

        //Initialize the default values
        start =0; end =0; len =0;
        for(int i=0; i<s.length();i++){
            extendFromMiddle(s, i, i);
            extendFromMiddle(s, i, i+1);
        }

        return s.substring(start, end);
    }

    private void extendFromMiddle(String s, int left, int right){
        while(left >=0 && right < s.length() && s.charAt(left) == s.charAt(right)){
            if(right - left + 1 > len){
                len = right - left + 1;
                start = left;
                end = right+1;
            }
            left--;
            right++;
        }
    }

}
