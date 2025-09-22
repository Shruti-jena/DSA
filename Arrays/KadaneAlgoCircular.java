package Arrays;

import java.util.Scanner;

public class KadaneAlgoCircular {

    public static int maxSubarraySumCircularWrap(int arr[],int n)
    {
        int totalSum=0,currMin=0,currMax=0;
        int minKadane = arr[0],maxKadane = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            currMax=Math.max(arr[i], currMax+arr[i]);
            maxKadane=Math.max(maxKadane, currMax);

            currMin= Math.min(arr[i],currMin+arr[i]);
            minKadane=Math.min(minKadane, currMin);

            totalSum+=arr[i];
        }
        if(totalSum==minKadane)
        return maxKadane;

        return Math.max(totalSum-minKadane, maxKadane);
    }

     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int n = sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
             arr[i]=sc.nextInt();
            }
         int result=maxSubarraySumCircularWrap(arr,n);
         System.out.println(result);
        }
        sc.close();
    }
    
}
