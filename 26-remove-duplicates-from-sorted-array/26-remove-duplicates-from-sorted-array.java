class Solution {

  public int removeDuplicates(int[] nums) {

    int ctr = 0;
    if (nums.length <= 0) {
      return 0;
    } else {
      for (int i = 0; i < nums.length - 1; i++) {
        if (nums[i] != nums[i + 1]) {
          nums[ctr++] = nums[i];
        }
      }
      nums[ctr++] = nums[nums.length - 1];
      return ctr;
    }
  }
}