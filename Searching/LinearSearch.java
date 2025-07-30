package Searching;
import java.util.*;

public class LinearSearch {
    public static int linearSearching(int array[],int Ele)
    {
      for(int j=0;j<array.length;j++)
      {
        if(array[j]==Ele)
        return j;
      }
      return -1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int searchEle = sc.nextInt();
            sc.nextLine();
            int n = sc.nextInt();
            sc.nextLine();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
         int result = linearSearching(arr,searchEle);
         System.out.println(result);
        }
        sc.close();
    }
}
