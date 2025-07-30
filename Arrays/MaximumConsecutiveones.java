package Arrays;
import java.util.*;

public class MaximumConsecutiveones {
    public static int MaxConsecutive(int arr[],int n)
    {
        int res = -1,count=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            count++;
            if(arr[i]==0)
            {
             count=0;
             continue;
            }
            res=Integer.max(count,res);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
           int result = MaxConsecutive(arr,n);
           System.out.print(result);   
        }
      sc.close();
    }
    
}
