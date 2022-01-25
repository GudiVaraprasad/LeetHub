class Solution {
    public boolean checkIfPangram(String sentence)
    {
       String str = sentence.toLowerCase();
        boolean flag = true;
        for (char ch = 'a'; ch <= 'z'; ch++)
        {
            if (!str.contains(String.valueOf(ch)))
            {
                flag = false;
                break;
            }
        }
        return flag;
    }
}