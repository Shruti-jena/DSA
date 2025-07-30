package Arrays;

import java.util.Scanner;

public class LeftRotateArrayBy1 {
    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int temp = arr[0];
        for(int i=0;i<n-1;i++)
        {
            arr[i]=arr[i+1];
        }
        arr[n-1]=temp;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i]+ " " );
        }
        return arr;
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
            rotateArray(arr,n);
        }
        sc.close();
}    
}
