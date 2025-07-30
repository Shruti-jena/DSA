package Arrays;
import java.util.*;
public class LeftRotateArrayByD {
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

    public static void LeftRotate(int arr[],int n, int d)
    {
        //Brute force. Create a temporary array and shift d elements into it. move remaining elements to the left and then put the temp array elements back
        //TC =O(n+d) SC =O(d)
        //  d = d%n;
        //  int temp[]= new int[d];
        //  for(int i=0;i<d;i++)
        //  {
        //   temp[i]=arr[i];
        //  }
        //  for(int i=d;i<n;i++)
        //  {
        //     arr[i-d]= arr[i];
        //  }
        //  for(int i=n-d;i<n;i++)
        //  {
        //    arr[i]= temp[i-(n-d)];
        //  }
        
        //Optimal solution reverse first d elements then remaining n-d elements and finally the entire array
        //TC-O(N), SC-O(1)
        d = d%n;
        Reverse(arr,0,d-1);
        Reverse(arr,d,n-1);
        Reverse(arr,0,n-1);    
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
            LeftRotate(arr,n,d);
            for(int i=0;i<arr.length;i++)
            {
               System.out.print(arr[i] + " ");
            }  
        }
      sc.close();  
    }
    
}
