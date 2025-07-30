package Arrays;
import java.util.*;

public class  NumbersAppearsOnceRestTwice {
    public static int NumberOnce(int arr[],int n)
    {
      //Bruteforce linear search for each element
      //Better solution Hashing- array hashing----only for positive numbers and not large numbers map hashing-- any number
        // int maxEle=arr[0];
        // for(int i=0;i<n;i++)
        // {
        //   if(arr[i]>maxEle)
        //   maxEle=arr[i];
        // }
        // HashMap<Integer,Integer> map = new HashMap<>();
        // for(int i=0;i<n;i++)
        // {
        //   int freq = map.getOrDefault(arr[i],0);
        //   map.put(arr[i], freq+1);
        // }

        // for(Map.Entry<Integer,Integer> it: map.entrySet())
        // {
        //   if(it.getValue()==1)
        //   return it.getKey();
        // }
        // return -1;
        //Optimal solutiopn use xor
        int xorr = 0;
        for (int i = 0; i < n; i++) {
            xorr = xorr ^ arr[i];
        }
        return xorr;

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
           int result = NumberOnce(arr,n);
           System.out.print(result);   
        }
      sc.close(); 
    }
    
}
