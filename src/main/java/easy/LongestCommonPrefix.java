package easy;

//https://leetcode.com/problems/longest-common-prefix/submissions/
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strings) {

        String first = strings[0];
        if(strings.length ==1)
            return first;

        StringBuilder result = new StringBuilder();

        //Loop each character in the first word and check the character in all strings in same index
        for(int index=0;index<first.length();index++){
            char ch = first.charAt(index);

            for (String str : strings)
                //If the checking word reached index or if the char doesn't match, then return the result
                if (str.length() == index || str.charAt(index) != ch)
                    return result.toString();

            //To come this point, the character should match in all strings. Add the character to the result string
            result.append(ch);
        }

        return result.toString();
    }

}
