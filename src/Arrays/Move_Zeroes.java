package Arrays;
// LeetCode 283 - Move Zeroes
import java.util.Arrays;
import java.util.Scanner;

public class Move_Zeroes {
    static void moveZeroes(int[] nums) {
        int j = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                nums[j] = nums[i];
                if (i != j) nums[i] = 0;
                j++;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter array size: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        moveZeroes(arr);

        System.out.println("After moving zeroes:");
        System.out.println(Arrays.toString(arr));
    }
}
