package SlidingWindowandTwoPointer;
import java.util.Scanner;

public class maxConsecutiveOnes {

    // Function to find the maximum consecutive 1's after flipping at most k zeros
    public static int MaxConsecutive(int[] arr, int k) {
        int left = 0, zeros = 0, maxLength = 0;

        for (int right = 0; right < arr.length; right++) {
            if (arr[right] == 0) zeros++;

            // Shrink window if zeros exceed k
            if (zeros > k) {
                if (arr[left] == 0) zeros--;  // decrement zeros if leaving a zero
                left++;                       // always move left
            }

            // Update max length of consecutive 1's
            maxLength = Math.max(maxLength, right - left + 1);
        }
        return maxLength;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of test cases: ");
        int t = sc.nextInt();  // number of test cases

        while (t-- > 0) {
            System.out.print("Enter size of array (n) and max flips (k): ");
            int n = sc.nextInt();  // array size
            int k = sc.nextInt();  // maximum zeros you can flip

            int[] arr = new int[n];
            System.out.print("Enter " + n + " array elements (0 or 1): ");
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();  // read each element
            }

            int result = MaxConsecutive(arr, k);
            System.out.println("Maximum consecutive 1's after flipping " + k + " zeros: " + result);
        }

        sc.close();
    }
}
