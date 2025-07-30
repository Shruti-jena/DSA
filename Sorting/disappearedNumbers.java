package Sorting;
import java.util.*;

public class disappearedNumbers {
    static public  List<Integer> disappeared(int array[])
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
     ArrayList<Integer> res = new ArrayList();
     for(int index = 0;index<array.length;index++)
     {
        if(array[index]!=index+1)
        {
            res.add(index+1);
        }
     }
     return res;
    }
     static void swap(int arr[],int first,int second)
    {
        int temp = arr[first];
        arr[first]=arr[second];
        arr[second]=temp;
    }
    public static void main(String[] args) {
        int nums[] ={7,5,6,1,2,3,3,3};
        List<Integer> result = disappeared(nums);
        System.out.println(result.toString());
    }
    
}
