// Write a function to find the longest common prefix string amongst an array of strings.

// If there is no common prefix, return an empty string "".


// Examples:
// Input : str = ["flowers" , "flow" , "fly", "flight" ]

// Output : "fl"

// Explanation : All strings given in array contains common prefix "fl".

// Input : str = ["dog" , "cat" , "animal", "monkey" ]

// Output : ""

// Explanation : There is no common prefix among the given strings in array.

//Brute force solution would be to find the substrings of all the strings and then find the common substring


package Strings;

import java.util.Scanner;

public class longestCommonPrefix {
    public static String longestPrefix(String a[])
    {
        if(a==null || a.length==0)
         return " ";
        String prefix = a[0];
        for(int i=1;i<a.length;i++)
        {
            while(!a[i].startsWith(prefix))
            {
                prefix = prefix.substring(0, prefix.length()-1);
                if(prefix.isEmpty())
                return " "; //no common prefixxs
            }
        }
      return prefix;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
            int n =Integer.parseInt(sc.nextLine());
            String arr[]= sc.nextLine().split(" ",n);
            String result = longestPrefix(arr);
            System.out.println(result);
        }
        sc.close();
    }
    
}
