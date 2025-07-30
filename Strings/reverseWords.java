// Example 1:
// Input: s=”this is an amazing program”
// Output: “program amazing an is this”

// Example 2:
// Input: s=”This is decent”
// Output: “decent is This”

// Solution 1 use stack
//Solution 2 use two pointer method

package Strings;

import java.util.Scanner;

public class reverseWords {
    public static String reverse(String s)
    {
        // String str = " ";
        // s += " ";
        // Stack<String> st = new Stack<String>();
        // for(int i=0;i<s.length();i++)
        // {
        //   if(s.charAt(i) == ' ')
        //   {
        //     st.push(str);
        //     str = "";
        //   }
        //   else
        //   {
        //     str+=s.charAt(i);
        //   }
        // }
        // String ans = "";
        // while(st.size()!=1)
        // {
        //  ans+=st.peek()+ " ";
        //  st.pop();
        // }
        // ans+=st.peek();
        // return ans;  
        String[] words = s.trim().split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i= words.length-1;i>=0;i--)
        {
            sb.append(words[i]);
            if(i!=0)
            sb.append(" ");
        }
        return sb.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            String result = reverse(s);
            System.out.println(result);
        }
        sc.close();
    }
}
