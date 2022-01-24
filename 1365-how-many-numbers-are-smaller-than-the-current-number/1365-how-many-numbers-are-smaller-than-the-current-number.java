class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] ans = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            int ctr = 0;
            for(int j=0;j<nums.length;j++)
            {
                if(nums[j] < nums[i])
                {
                   ctr++;
                }
            }
            ans[i] = ctr;
        }
        return ans;
    }
}