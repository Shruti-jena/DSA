package Arrays;
import java.util.Scanner;

public class subarraywithmaxProduct {
    public static int maxProductSubarray(int arr[],int n){
        int prefix=1,suffix=1;
        int maxProduct=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++)
        {
            if(prefix==0)prefix=1;
            if(suffix==0)suffix=1;
            prefix=prefix*arr[i];
            suffix=suffix*arr[n-i-1];
            maxProduct=Math.max(maxProduct, Math.max(prefix, suffix));
        }
        return maxProduct;
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
            int result=maxProductSubarray(arr,n);
            System.out.println(result);
        }
        sc.close();
    }
}
