package Arrays;
import java.util.*;

public class RightRotateArrayByD {
    public static void Reverse(int[]arr, int start, int end)
    {
      while(start<=end)
      {
        int temp = arr[start];
        arr[start]=arr[end];
        arr[end]=temp;
        start++;
        end--;
      }
    }
    public static void rightRotate(int[]arr,int n, int d)
    {
        Reverse(arr,n-d,n-1);
        Reverse(arr,0,n-d-1);
        Reverse(arr, 0, n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]= new int[n];
            int d = sc.nextInt();
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
            rightRotate(arr, n, d);
            for(int i=0;i<arr.length;i++)
            {
               System.out.print(arr[i] + " ");
            } 
        } 
        sc.close();      
    }
}
