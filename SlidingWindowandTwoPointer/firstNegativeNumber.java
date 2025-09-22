// You are given an array arr[] of size N and a window size K.
// For every window (contiguous subarray of length K), find the first negative integer in that window.
// If a window does not contain a negative integer, put 0 in the answer.

// Example:

// Input: arr = [12, -1, -7, 8, -15, 30, 16, 28], K = 3
// Output: [-1, -1, -7, -15, -15, 0]

package SlidingWindowandTwoPointer;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import java.util.Scanner;

public class firstNegativeNumber {

    public static List<Integer> negativeNumber(int arr[], int k){
        Deque<Integer> dq = new ArrayDeque<Integer>();
        List<Integer> result =  new ArrayList<Integer>();
        for(int i=0;i<k;i++)
        {
          if(arr[i]<0)
          dq.addLast(i);
        }
        //Window Sliding
        for(int i=k;i<arr.length;i++){
            //Record first negative of previous window
            if(!dq.isEmpty())
            result.add(arr[dq.peekFirst()]);
            else
            result.add(0);

            //Remove indices out of current window
            while(!dq.isEmpty() && dq.peekFirst()<=i-k){
                dq.pollFirst();  
            }

            //Add current element if negative
            if(arr[i]<0)
            dq.addLast(i);
        }

        //First negative of last window
        if(!dq.isEmpty())
        result.add(arr[dq.peekFirst()]);
        else
        result.add(0);
        
        return result;   
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0)
        {
            int n=sc.nextInt();
            int k = sc.nextInt();
            int arr[]= new int[n];
            for(int i=0;i<n;i++)
            {
              arr[i]=sc.nextInt();
            }
            List<Integer> result = negativeNumber(arr,k);
           System.out.print(result);   
        }
      sc.close();
    }
}



// What does i - k mean?

// i → current element we are processing (entering the window).

// k → size of the window.

// i - k → index just before the start of the current window.

// Any index ≤ i - k is no longer inside the window and should be removed.
// : Breaking the while condition
// !dq.isEmpty()          // deque has elements
// dq.peekFirst() <= i - k // the first negative is outside current window


// If both are true → the first negative in deque is no longer in window → remove it.

// dq.pollFirst() → removes the front element.
// arr = [12, -1, -7, 8, -15], k = 3
// i = 4 (element = -15)
// Window = [8, -15, ???]  // window starts at i - k + 1 = 2
// Deque before removal: [1, 2]  // indices of -1 and -7
// Check deque front:
// dq.peekFirst() = 1
// i - k = 4 - 3 = 1
// Condition true → remove 1
// Deque now: [2]
// dq.peekFirst() = 2
// 2 <= 1? false → stop
