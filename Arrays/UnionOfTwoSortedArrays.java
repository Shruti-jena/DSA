package Arrays;
import java.util.*;
public class UnionOfTwoSortedArrays {
    public static ArrayList<Integer> Union(int arr1[],int arr2[], int n1, int n2)
    {
        //Brute force method: Create a set and add both array elements into it. Since a set saves only unique elements it gives correct union.
        // HashSet<Integer> s = new HashSet<Integer>();
        // for(int i=0;i<arr1.length;i++)
        // {
        //     s.add(arr1[i]);
        // }
        // for(int i=0;i<arr2.length;i++)
        // {
        //     s.add(arr2[i]);
        // }
        // int i=0;
        // int arr3[]=new int[s.size()];
        // for (Integer k : s) {
        //     arr3[i++]=k;
        // }
        // return arr3; 
        
        
        // Optimal solution- Two pointer approach
        int i = 0, j = 0; // pointers
        ArrayList<Integer > Union=new ArrayList<>(); // Uninon vector
        while (i < n1 && j < n2) {
          if (arr1[i] <= arr2[j]) // Case 1 and 2
          {
            if (Union.size() == 0 || Union.get(Union.size()-1) != arr1[i])
              Union.add(arr1[i]);
            i++;
          } else // case 3
          {
            if (Union.size() == 0 || Union.get(Union.size()-1) != arr2[j])
              Union.add(arr2[j]);
            j++;
          }
        }
        while (i < n1) // IF any element left in arr1
        {
          if (Union.get(Union.size()-1) != arr1[i])
            Union.add(arr1[i]);
          i++;
        }
        while (j < n2) // If any elements left in arr2
        {
          if (Union.get(Union.size()-1) != arr2[j])
            Union.add(arr2[j]);
          j++;
        }
        return Union;
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
          ArrayList<Integer> result= Union(arr1,arr2,n,k);
            for(int i=0;i<result.size();i++)
            {
               System.out.print(result.get(i) + " ");
            }  
        }
        sc.close();   
    }
}
