package Arrays;
import java.util.*;
public class MoveZerostoEnd {
    public static void moveZeros(int arr[],int n)
    {
        //BruteForce method- temporary array
        // int temp[]= new int[n];
        // int j=0;
        // for(int i=0;i<n;i++)
        // {
        //     if(arr[i]!=0)
        //     temp[j++]=arr[i];   
        // }
        // for(int i=0;i<=j;i++)
        // {
        //     arr[i]=temp[i];
        // }
        // for(int i=j;i<n;i++)
        // {
        //     arr[i]=0;
        // }

        //Optimal solution TC- O(N) SC-O(1)
        int j=-1;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==0)
            {
                j=i;
                break;
            }
        }

        if(j==-1)
        System.out.println("No non zero elements");

        for(int i=j+1;i<n;i++)
        {
            if(arr[i]!=0)
            {
            int temp =arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            j++;
            }
        }
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
            moveZeros(arr,n);
            for(int i=0;i<arr.length;i++)
            {
               System.out.print(arr[i] + " ");
            }  
        }
        sc.close();   
    }
    
}
