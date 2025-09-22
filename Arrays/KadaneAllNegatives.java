package Arrays;

import java.util.Scanner;

public class KadaneAllNegatives {

    public static int maxSubarraySumNegatives(int arr[], int n)
    {
        int currSum=arr[0],maxSum=arr[0];
        for(int i=0;i<arr.length;i++)
        {
            currSum= Integer.max(arr[i], currSum+arr[i]);
            maxSum = Integer.max(maxSum, currSum);
        }
        return maxSum;
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
         int result=maxSubarraySumNegatives(arr,n);
         System.out.println(result);
        }
        sc.close();
    }
    
}
