package Arrays;
import java.util.*;

public class IntersectionofTwoSortedArrays {
    public static ArrayList<Integer> intersection(int arr1[],int n,int arr2[],int m)
    {
        int i=0,j=0;
        ArrayList<Integer> ans  = new ArrayList<>();
        while(i<n && j<m)
        {
         if(arr1[i]<arr2[j])
         {
           i++;
         }
         else if(arr1[i]>arr2[j])
         {
           j++;
         }
         else
         {
            ans.add(arr1[i]);
            i++;
            j++;
         }
        }
        return ans;

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
          int n=sc.nextInt();
          int k=sc.nextInt();
          int arr1[]= new int[n];
          int arr2[]=new int[k];
          for(int i=0;i<n;i++)
          {
            arr1[i]=sc.nextInt();
          }
            for(int i=0;i<k;i++)
            {
              arr2[i]=sc.nextInt();
            }
          ArrayList<Integer> result= intersection(arr1,n,arr2,k);
          for(int i=0;i<result.size();i++)
          {
             System.out.print(result.get(i) + " ");
          }  
        }
        sc.close();   
    }
}
