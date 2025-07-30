package Arrays;

public class CheckifArrayisSorted {
    public static int isSorted(int[]arr)
    {
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            return -1;
        }
        return 1;
    }

    public static void main(String[] args) {
        int arr[]={2,3,4,5,6};
        int arr1[]={10,9,6,11,90};
        int result=isSorted(arr1);
        System.out.println(result);
        int result1=isSorted(arr);
        System.out.println(result1);
    }
    
}
