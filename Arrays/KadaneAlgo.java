package Arrays;

import java.util.Scanner;

public class KadaneAlgo {
    public static int maxSubarraySum(int arr[], int n)
    {
       int currSum=0,maxSum=arr[0],start=0,end=0,tempStart=0;
       for(int i=0;i<arr.length;i++)
       {
        currSum+=arr[i];
        if(currSum>maxSum){
            maxSum=currSum;
            start =tempStart;
            end=i;
        }
        if(currSum<0){
            currSum=0;
            tempStart = i+1;
        }
       }
       System.out.println("startIndex"+" "+ start +"endIndex"+" "+end);
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
         int result=maxSubarraySum(arr,n);
         System.out.println(result);
        }
        sc.close();
    }
}
