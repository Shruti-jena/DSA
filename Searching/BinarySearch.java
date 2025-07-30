package Searching;

import java.util.*;

public class BinarySearch {

    public static int Binary(int array[],int target)
    {
      Arrays.sort(array);
      int start=0, end = array.length-1;
      while(start<=end)
      {
        int mid = (start+end)/2;
        // Incase start+end exceeds integer max value  use mid =  start + (end-start)/2
        if(array[mid]==target)
        return mid;
        else if(array[mid]>target)
        end=mid-1;
        else
        start = mid+1;
      }
      return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0)
        {
            int n =sc.nextInt();
            int target=sc.nextInt();
            int arr[] =  new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            int result = Binary(arr,target);
            System.out.println(result);
        }
        sc.close();
    }
}
