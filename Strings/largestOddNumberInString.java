// Given a string s, representing a large integer, the task is to return the largest-valued odd integer (as a string) that is a substring of the given string s.

// The number returned should not have leading zero's. But the given input string may have leading zero.


// Examples:
// Input : s = "5347"

// Output : "5347"

// Explanation : The odd numbers formed by given strings are --> 5, 3, 53, 347, 5347.

// So the largest among all the possible odd numbers for given string is 5347.

// Input : s = "0214638"

// Output : "21463"

// Explanation : The different odd numbers that can be formed by the given string are --> 1, 3, 21, 63, 463, 1463, 21463.

// We cannot include 021463 as the number contains leading zero.

// So largest odd number in given string is 21463.

//Brute Force would be to find all substrings then find ones that are odd and then the largest odd

//Optimised solution is to find the first odd character from the right and find the largest odd number then ie longest prefix ending at odd integer


package Strings;

import java.util.Scanner;

public class largestOddNumberInString {

    public static String largestOddSubstring(String s)
    {
        if(s == null || s.isEmpty())
        return " ";
        for(int i = s.length()-1;i>=0;i--)
        {
            char c = s.charAt(i);
            if((c-'0')%2==1)
            {
               String result = s.substring(0, i+1);
                result = result.replaceFirst("^0+", " ");
                return result;
            }
        }

        return " ";
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();
        while(t-->0)
        {
            String s = sc.nextLine();
            String result = largestOddSubstring(s);
            System.out.println(result);
        }
        sc.close();
    }
}
