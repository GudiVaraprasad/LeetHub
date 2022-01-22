class Solution {
    public boolean isPalindrome(int x) {
        String org = Integer.toString(x);
        String rev="";
        for(int i=org.length() -1;i>=0;i--)
        {
            rev = rev + org.charAt(i);
        }
        return org.equals(rev);
    }
}