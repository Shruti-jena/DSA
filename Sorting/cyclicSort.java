//Given range form 1 to N apply cylic sort important

package Sorting;
import java.util.*;
public class cyclicSort {
    public static void cyclic(int array[])
    {
     int i=0;
     while(i<array.length)
     {
        int correctIndex=array[i]-1;
        if(array[i]!=array[correctIndex])
        {
            swap(array,i,correctIndex);
        }
        else
        i++;
     }
    }
    private static void swap(int arr[],int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int arr[]={7,3,6,1,2,5,4};
        cyclic(arr);
        System.out.println(Arrays.toString(arr));

    }
}
