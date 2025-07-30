package Arrays;
import java.util.*;
public class LongestSubarrayWithGivenSum {
    public static int SubArraySum(int arr[], long k)
    {
        //Bruteforce solution : run loops to find all subarrays and find each sum and return length of longest subaaray
        //TC= O(N2) SC = O(1)
        // int len=0;
        // for(int i=0;i<arr.length;i++)
        // {
        //     int sum = 0;
        //     for(int j=i;j<arr.length;j++)
        //     {
        //         sum+=arr[j];    
        //         if(sum==k)
        //         len=Math.max(len,j-i+1);
        //     }
        // }
        // return len;

        //Better solution Hashing hashmap<sum,index> and length is max(length and i+1)
        // Used when array has positives,negatives and zeros only TC - O(NlogN) SC- O(N)
        // int n = arr.length;
        // long sum=0L;
        // int maxLength=0;
        // HashMap<Long,Integer> preHashMap = new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //     sum+=arr[i];
        //     if(sum==k)
        //     maxLength=Math.max(maxLength, i+1);
        //     long rem = sum - k;
        //     if(preHashMap.containsKey(rem))
        //     {
        //         int len = i - preHashMap.get(rem);
        //         maxLength=Math.max(maxLength, len);
        //     }
        //     if(!preHashMap.containsKey(sum))
        //     {
        //         preHashMap.put(sum,i);
        //     }
        // }
        // return maxLength;

        // Optimal Solution -  Two Pointer Approach
        // Used for both positives and zeros only in an array
        //TC=O(2N) SC - O(1)
        int left=0,right=0;
        int maxLength=0;
        int n=arr.length;
        long sum=0L;
        while(right<n)
        {
            while(left<=right && sum > k)
            {
                sum-=arr[left];
                left++;
            }
            if(sum==k)
            {
                maxLength=Math.max(maxLength, right-left+1);
            }
            right++;
            if(right<n)
            sum+=arr[right];
        }
        return maxLength;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]= new int[n];
            Long k=sc.nextLong();
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
           int result = SubArraySum(arr,k);
           System.out.print(result);   
        }
      sc.close(); 
    }   
    
}
