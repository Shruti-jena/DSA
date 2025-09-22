package SlidingWindowandTwoPointer;

import java.util.HashMap;
import java.util.HashSet;

public class longestSubstringithoutRepeating {

    // public static int longestSubstring(String str)
    // {
    //     int left=0,maxLength=Integer.MIN_VALUE;
    //     HashSet<Character> set =  new HashSet<>();
    //     for(int right=0;right<str.length();right++)
    //     {
    //         if(set.contains(str.charAt(right)))
    //         {
    //             while(left<right){
    //                 set.remove(str.charAt(left));
    //                 left++;
    //             }
    //         }
    //         set.add(str.charAt(right));
    //         maxLength=Math.max(maxLength, right-left+1);
    //     }
    //     return maxLength;   
    // }

    public static int longestSubstring(String str){
        HashMap < Character, Integer > mpp = new HashMap < Character, Integer > ();

        int left = 0, right = 0;
        int n = str.length();
        int len = 0;
        while (right < n) {
            if (mpp.containsKey(str.charAt(right))) left = Math.max(mpp.get(str.charAt(right)) + 1, left);

            mpp.put(str.charAt(right), right);

            len = Math.max(len, right - left + 1);
            right++;
        }
        return len;

    }


    public static void main(String[] args) {
        String s = "ahsdoansbksnxbxls";
        int result = longestSubstring(s);
        System.out.println(result);
    }
    
}
