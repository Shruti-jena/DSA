// Input: arr = [2, 1, 5, 1, 3, 2], k = 3
// Output: 9
// Explanation: Subarray [5,1,3] has the maximum sum 9

package SlidingWindowandTwoPointer;

import java.util.Scanner;

public class maxSuminSubarrayofsizeK {
    public static int maxSum(int arr[],int k)
    {
        int currSum=0,max=0;
        for(int i=0;i<k;i++)
        {
            currSum+=arr[i];
        }
        for(int i=k;i<arr.length;i++)
        {
            currSum+=arr[i]-arr[i-k];
            max =  Math.max(currSum, max);
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
           int result = maxSum(arr,k);
           System.out.print(result);   
        }
      sc.close();
    }
    
}
