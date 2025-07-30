package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch2D {
    public static int[] Search(int array[][],int target)
    {
      int row = 0;
      int col = array.length -1;
      while(row<array.length && col>=0)
      {
        if(array[row][col]==target)
        return new int[]{row,col};
        else if(array[row][col]>target)
        col--;
        else
        row++;
      }
      return new int[]{-1,-1};
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int searchEle = sc.nextInt();
            int row = sc.nextInt();
            int col = sc.nextInt();
            int arr[][]= new int[row][col];
            for(int i=0;i<row;i++)
            {
               for(int j=0;j<col;j++)
               {
                arr[i][j]=sc.nextInt();
               }
            }
         int result[] = Search(arr,searchEle);
         System.out.println(Arrays.toString(result));
        }
        sc.close();  
    }
    
}
