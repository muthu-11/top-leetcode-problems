package easy.string;

import java.util.ArrayDeque;
import java.util.Deque;

//https://leetcode.com/problems/valid-parentheses/
public class BalancedParentheses {

     boolean isBalanced(String s){

          if(s==null || s.trim().isEmpty())
               throw new IllegalArgumentException();

          //If the string is not having an even length, then the input is not balanced
          if(s.length() %2 != 0) return false;

          Deque<Character> stack = new ArrayDeque<>();

          for(int i=0; i<s.length(); i++){
               char ch = s.charAt(i);

               if(ch == '{' || ch == '[' || ch == '(')
                    stack.push(ch);
               else{
                    if(stack.isEmpty()) return false;
                    char poppedChar = stack.pop();
                    if(poppedChar == '{')
                         if(ch != '}') return false;
                    if(poppedChar == '[')
                         if(ch != ']') return false;
                    if(poppedChar == '(')
                         if(ch != ')') return false;
               }
          }

          return stack.isEmpty();
     }

}
