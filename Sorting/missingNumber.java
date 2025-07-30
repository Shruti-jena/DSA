//Given array nums containing n distinct numbers in the range [0,n], 
//return the only number in the range that is missing from the array

package Sorting;
import java.util.*;

public class missingNumber {

    public static int missing(int array[])
    {
       Arrays.sort(array);
       int i=0;
       while(i<array.length)
       {
        int correctIndex = i;
        if(array[i]==correctIndex)
        {
            i++;
        }
        else
        {
            return i;
        }
       }
       return -1;
    }

    public static void main(String[] args) {
        int nums[] ={9,1,4,3,2,7,6,5,0};
        int result = missing(nums);
        System.out.println(result);
    }
    
}
