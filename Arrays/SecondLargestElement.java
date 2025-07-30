package Arrays;

public class SecondLargestElement {
    public static int SecondLargest(int arr[])
    {
        int res=-1,largest=0,i;
        for(i=0;i<arr.length;i++)
        {
         if(arr[i]>arr[largest])
         {
            res = largest;
            largest=i;
         }
         else if(arr[i]!=arr[largest])
         {
            if(res == -1 ||arr[i]>arr[res])
            {
                res=i;
            }
         }
        } 
        return arr[res];
    }
    public static void main(String[] args) {
        int arr[]={2,8,0,1,19,23,67};
        int result=SecondLargest(arr);
        System.out.println(result);
    }
    
}
