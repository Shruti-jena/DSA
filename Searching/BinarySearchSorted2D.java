//Take the middle column or row and try to reduce rows or cols

package Searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchSorted2D {
    public static int[] BinarySearch(int matrix[], int row, int cstart, int cend, int target)
    {
      while(cstart<=cend)
      {
        int mid  = cstart + (cend-cstart)/2;
        if(matrix[row][mid]==target)
        return new int[]{row,mid};
        else if (matrix[row][mid]<target)
        cstart=mid+1;
        else
        cend=mid-1;
      }
      return new int[]{-1,-1};
    }
    public static int[] search(int matrix[][],int target)
    {
        int rows =  matrix.length;
        int cols = matrix[0].length;

        if(rows == 1)
        return BinarySearch(matrix, 0, 0,(cols-1),target);

        int rstart =0;
        int rend=rows-1;
        int cmid = cols/2;
        //run the loop till 2 rows are remaining
        while(rstart<(rend-1))
        {
           int mid = rstart + (rend-rstart)/2;
           if(matrix[mid][cmid]==target)
           {
            return new int[]{mid,cmid};
           }
           else if(matrix[mid][cmid]<target)
           rstart =  mid;
           else
           rend = mid;
        }
          // Now we have 2 rows, Check target in the column of 2 rows
          if(matrix[rstart][cmid]==target)
          return new int[]{rstart,cmid};
          if(matrix[rstart+1][cmid]==target)
          return new int[]{rstart+1,cmid};
          //Search in 1 half
          if(matrix[rstart][cmid-1]==target)
          return new int[]{rstart,cmid};
          //Search in 2 half
          if(matrix[rstart][cmid+1]==target)
          return new int[]{rstart,cmid};
          //Search in 3 half
          if(matrix[rstart+1][cmid-1]==target)
          return new int[]{rstart,cmid};
          //Search in 4 half
          if(matrix[rstart][cmid-1]==target)
          return new int[]{rstart,cmid};
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
