// Input: S = “(((a)(bcd)(e)))”
// Output: (a)(bcd)(e)
// Explanation: 
// The outermost enclosing brackets are: { S[0], S[1], S[13], S[14] }. 
// Removing the outermost enclosing brackets from str modifies str to “(a)(bcd)(e)”. 
// Therefore, the required output is (a)(bcd)(e).


// Input: str = “((ab)(bc))d”
// Output: ((ab)(bc))d
// Explanation: 
// Since no outermost enclosing brackets present in the string. Therefore, the required output is ((ab)(bc))d

package Strings;
import java.util.*;

public class removeOuterPara1 {
    public static String removePara(String s)
    {
        StringBuilder res =  new StringBuilder();
        int depth = 0;
        for(char c : s.toCharArray())
        {
            if(c=='(')
            {
                if(depth>0)
                res.append(c);
                depth++;
            }
            else if(c==')')
            {
                depth--;
                if(depth>0)
                res.append(c);
            }
            else
            res.append(c);
        }
        return res.toString();
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
