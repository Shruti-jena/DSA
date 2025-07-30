// Input : s = "abcde" , goal = "cdeab"

// Output : true

// Explanation : After performing 2 shifts we can achieve the goal string from string s.

// After first shift the string s is => bcdea

// After second shift the string s is => cdeab.

//Brute force solution will be to find all the rotations of the given string and compare them one by one with second string


// Check length — if not equal, return false.

// Understand that shifts = rotations.

// All rotations of s are substrings of s + s.

// So just check: goal in (s + s) → return true or false.
//A string can only be a rotation of another if:

// Both strings are non-null

// Both strings have the same length

// Both strings contain exactly the same characters, just in rotated positions


package Strings;

import java.util.Scanner;

public class rotationalStrings {

    public static boolean isRotational(String s1, String s2)
    {
        if(s1.length()!=s2.length())
        return false;
        String k = s1+s1;
        if(k.contains(s2))
        return true;
        else
        return false;
        //Brute
        // for (int i = 0; i < s1.length(); i++) {
        //     // Perform a left shift by 1
        //     s = s.substring(1) + s.charAt(0);
            
        //     // Check if it matches goal
        //     if (s.equals(goal)) {
        //         return true;
        //     }
        // }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
         String s1 = sc.nextLine();
         String s2 = sc.nextLine();
         Boolean result = isRotational(s1,s2);
         System.out.println(result);
        }
        sc.close();
        
    }
    
}
