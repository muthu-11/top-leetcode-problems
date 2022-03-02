package easy;

//https://leetcode.com/problems/reverse-string/
public class ReverseString {

    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length -1;
        char tmp;
        while(start < end){
            tmp = s[end];
            s[end] = s[start];
            s[start] = tmp;
            start++;
            end--;
        }
    }

}
