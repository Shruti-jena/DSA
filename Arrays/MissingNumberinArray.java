package Arrays;
import java.util.*;

public class MissingNumberinArray {
    public static int Missing(int arr[], int n)
    {
       //Bruteforce solution check frim 1 to N and do linear search
    //    for(int i=0;i<n;i++)
    //    {int res=-1;
    //     for(int j=0;j<n;j++)
    //     {
    //         if (arr[j]==i)
    //         {
    //             res=0;
    //             break;
    //         }
    //     }
    //     if (res==-1)
    //     {
    //         return i;
    //         break;
    //     }
    //    }
    //    return 0;

    //SUM and xor
    // int sum =0;
    // for(int i=0;i<n;i++)
    // {
    //     sum=sum+arr[i];
    // }
    // int full = n*(n+1)/2;
    // int miss=full-sum;
    // return miss;
    int xor1 = 0, xor2 = 0;

        for (int i = 0; i < n - 1; i++) {
            xor2 = xor2 ^ arr[i]; // XOR of array elements
            xor1 = xor1 ^ (i + 1); //XOR up to [1...N-1]
        }
        xor1 = xor1 ^ n; //XOR up to [1...N]

        return (xor1 ^ xor2); // the missing number
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
           int result = Missing(arr,n);
           System.out.print(result);   
        }
      sc.close();  
    }
    
}
