package Sorting;

import java.util.*;

public class insertionSort {
    public static void insertion(int array[])
    {
        for(int i=0;i<array.length-1;i++)
        {
            for(int j=i+1;j>0;j--)
            {
                if(array[j]<array[j-1])
                {
                    swap(array,j,j-1);
                }
                else
                {
                    break;
                } 
            }
        }
    }
    private static void swap(int arr[],int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
     public static void main(String[] args) {
        int arr[]={90,9,7,11,21};
        insertion(arr);
        System.out.println(Arrays.toString(arr));

    }
}
