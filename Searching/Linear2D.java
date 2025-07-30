package Searching;
import java.util.*;

public class Linear2D {
    public static int[] linearSearching(int array[][],int Ele)
    {
        for(int row=0;row<array.length;row++)
        {
           for(int col=0;col<array[row].length;col++)
           {
            if(array[row][col] ==Ele)
             return new int[]{row,col};
           }
        }
      return new int[]{-1,-1}; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            int searchEle = sc.nextInt();
            sc.nextLine();
            int row = sc.nextInt();
            sc.nextLine();
            int col = sc.nextInt();
            int arr[][]= new int[row][col];
            for(int i=0;i<row;i++)
            {
               for(int j=0;j<col;j++)
               {
                arr[i][j]=sc.nextInt();
               }
            }
         int result[] = linearSearching(arr,searchEle);
         System.out.println(Arrays.toString(result));
        }
        sc.close();
    }
}