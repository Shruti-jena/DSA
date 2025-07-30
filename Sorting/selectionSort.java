//Select an element and put it at its correct index

package Sorting;
import java.util.*;
public class selectionSort {
    public static void selectionSort(int array[])
    {
       for(int i=0;i<array.length;i++)
       {
        // Find the max or min item int the remaining array and swap with correct index
         int last = array.length-i-1;
         int maxIndex = getMax(array,0,last);
         swap(array, maxIndex,last);
       }
    }
    private static void swap(int arr[],int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static int getMax(int arr[],int start,int end)
    {
        int max = start;
        for(int i=start;i<=end;i++)
        {
            if(arr[max]<arr[i])
            max=i;
        }
        return max;
    }
    public static void main(String[] args) {
        int arr[]={16,17,24,-9,-11,13,90};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
