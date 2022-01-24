class Solution {
    public int maximumWealth(int[][] accounts) {
        int m = accounts.length;
        int maxValue = 0;
        for(int i=0;i<m;i++)
        {
            int sum = 0;
            for(int j=0;j<accounts[i].length;j++)
            {
                sum = sum + accounts[i][j];
            }
            if(sum >= maxValue)
            {
                maxValue = sum;
            }
        }
        return maxValue;
    }
}