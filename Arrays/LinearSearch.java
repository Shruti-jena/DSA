package Arrays;
import java.util.*;
public class LinearSearch {
    public static int Linear(int arr[],int x)
    {
     for(int i=0;i<arr.length;i++)
     {
        if(arr[i]==x)
        return x;
     }
     return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int x=sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
           int result =Linear(arr,x);
           System.out.println(result);
        }
        sc.close();   
    }
}
