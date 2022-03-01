package medium.integer;

//https://leetcode.com/problems/reverse-integer/
public class ReverseInteger {

    int reverse(int n){
        int reversedInteger = 0;

        while (n != 0){
            //check if the result goes beyond max or min value before multiplying by ten
            if(reversedInteger > Integer.MAX_VALUE/10 || reversedInteger < Integer.MIN_VALUE/10) return 0;
            reversedInteger = reversedInteger * 10 + (n % 10);
            n /= 10;
        }

        return reversedInteger;
    }

}
