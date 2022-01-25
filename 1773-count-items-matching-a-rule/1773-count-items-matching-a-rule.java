class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
       int ctr = 0;
        for(List<String> arr : items)
        {
            if(ruleKey.equals("type") && ruleValue.equals(arr.get(0)))
            {
                ctr++;
            }
            else if(ruleKey.equals("color") && ruleValue.equals(arr.get(1)))
            {
                ctr++;
            }
            else if(ruleKey.equals("name") && ruleValue.equals(arr.get(2)))
            {
                ctr++;
            }
        }
        return ctr; 
    }
}