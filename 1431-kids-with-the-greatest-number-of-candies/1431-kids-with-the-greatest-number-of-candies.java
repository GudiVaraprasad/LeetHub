class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max = Arrays.stream(candies).max().getAsInt();
        ArrayList<Boolean> ans = new ArrayList<>();
        
        for(int i=0;i<candies.length;i++){
            candies[i] +=  extraCandies;
            if(candies[i]>=max)
            {
                ans.add(true);
            } else {
                ans.add(false);
            }
        }
        return ans;
    }
}