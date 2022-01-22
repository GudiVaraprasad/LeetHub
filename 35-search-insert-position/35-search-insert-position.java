class Solution 
{
    public int searchInsert(int[] nums, int target)
    {
        int pos = 0;
        int flag = 0;
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==target)
            {
                flag++;
                return i;
            }
            if(flag == 0)
            {
                if(nums[i]>target)
                {
                    flag++;
                    return i;
                }
                else if(i==nums.length-1)
                {
                    return nums.length;
                }
            }
        }
        return pos;
    }
}