package Hashing;

import java.util.*;
public class highestOccuringElement{

    public static int maxFreq(int arr[])
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for(int i=0;i<arr.length;i++)
        {
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        int maxfreq=0;
        int result = Integer.MAX_VALUE;
        for (Map.Entry<Integer,Integer> entry : map.entrySet())
        {
            int key = entry.getKey();
            int value = entry.getValue();
            if (value>maxfreq || (value == maxfreq && key<result) )
            {
                maxfreq = value;
                result = key;
            }            
        } 
        return result;   
    }

    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result = maxFreq(arr);
            System.out.println(result);
        }
        sc.close();
    }

}