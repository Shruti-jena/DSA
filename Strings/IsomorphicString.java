package Strings;

import java.util.*;

public class IsomorphicString {
    public static Boolean isomorphicStringTest(String s,String t)
    {
      if(s.length()!=t.length())
      return false;
      HashMap<Character,Character> sMap = new HashMap<>();
      HashMap<Character,Character> tMap = new HashMap<>();

      for(int i=0;i<s.length();i++)
      {
        char c1 =s.charAt(i);
        char c2 =t.charAt(i);

        if(sMap.containsKey(c1))
        {
            if(sMap.get(c1)!= c2)
            return false;
        }
        else
        {
            if(tMap.containsKey(c2))
            return false;
        }
        sMap.put(c1,c2);
        tMap.put(c2,c1);
      }
      return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =Integer.parseInt(sc.nextLine());
        while(t-->0)
        {
         String s1 = sc.nextLine();
         String s2 = sc.nextLine();
         Boolean result = isomorphicStringTest(s1,s2);
         System.out.println(result);
        }
        sc.close();
    }
    
}
