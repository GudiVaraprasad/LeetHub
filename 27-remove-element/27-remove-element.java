import java.util.*;

class Solution {

  public int removeElement(int[] nums, int val) {
    int ctr = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == val) {
        ctr++;
        nums[i] = 50;
      }
    }
    Arrays.sort(nums);

    /*
     * System.out.println("Count = " + ctr);
     * 
     * System.out.println("\nSorted Array Elements : "); for (int i = 0; i <
     * nums.length; i++) { System.out.print(nums[i] + " "); }
     */

    int k = nums.length - ctr;

    return k;
    // System.out.println("\nOutput = " + k);
  } // 0 1 2 2 3 0 4 2

  public static void main(String args[]) {
    Scanner in = new Scanner(System.in);
    System.out.print("Enter size of array : ");
    int n = in.nextInt();

    int[] nums = new int[n];

    System.out.print("Enter array elements : ");
    for (int i = 0; i < nums.length; i++) {
      nums[i] = in.nextInt();
    }

    System.out.print("Enter the value : ");
    int val = in.nextInt();

    Solution obj = new Solution();
    System.out.println(obj.removeElement(nums, val));
    // obj.removeElement(nums, val);
    in.close();
  }
}