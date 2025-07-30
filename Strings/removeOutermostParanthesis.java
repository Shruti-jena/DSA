//Input: S = “(()())(())()” 
// Output: ()()() 
// Explanation: The input string is “(()())(())()” can be decomposed into primitive substrings “(()())” + “(())”+”()”. After removing outermost parentheses of each primitive substrings, the string obtained is “()()” + “()” = “()()()”


// Input: S = “((()())(())(()(())))” 
// Output: (()())(())(()(()))
// Initialize two variables, open_count and close_count, to zero
// Initialize an empty string called result.
// Loop through each character c in the input string s.
// If c is an opening parenthesis, increment open_count.
// If c is a closing parenthesis, increment close_count.
// If open_count and close_count are equal and greater than zero, this means that we have encountered a complete pair of opening and closing parentheses, so we can add the substring between them to the result string.
// Reset open_count and close_count to zero.
// Return the result string.

package Strings;
import java.util.*;
public class removeOutermostParanthesis {
    public static String removePara(String s)
    {
        int open_count=0,close_count=0;
        int start=0;
        String res = " ";
        for(int i=0;i<s.length();i++)
        {
            char  c =s.charAt(i);
            if(c=='(')
            open_count++;
            else if(c == ')')
            close_count++;

            if(open_count==close_count)
            {
                res+= s.substring(start+1, i);
                start=i+1;
            }
        }
        return res;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            String s = sc.next();
            String result = removePara(s);
            System.out.println(result);
        }
        sc.close();
    }
    
}
