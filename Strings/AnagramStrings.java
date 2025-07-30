package Strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AnagramStrings {
    public static boolean anagramStringTest(String s1, String s2)
    {
      s1 = s1.replaceAll("\\s", "").toLowerCase();
      s2 = s2.replaceAll("\\s", "").toLowerCase();
      if(s1.length()!=s2.length())
      return false;
      Map<Character, Integer> freq1 = new HashMap<>();
      Map<Character, Integer> freq2 = new HashMap<>();
     for (char c : s1.toCharArray()) {
           freq1.put(c, freq1.getOrDefault(c, 0) + 1);
        }
      for (Character c: s2.toCharArray()){
        freq2.put(c, freq2.getOrDefault(c, 0) + 1);
      }
      return freq1.equals(freq2);
     }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
         String s1 = sc.nextLine();
         String s2 = sc.nextLine();
         Boolean result = anagramStringTest(s1,s2);
         System.out.println(result);
        }
        sc.close();
    }
    
}
