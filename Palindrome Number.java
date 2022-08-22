class Solution {
    public boolean isPalindrome(int x) {
        String s = Integer.toString(x);
        
        int i = 0;
        int j = s.length() -1;
        
        while (i<j){
            char start = s.charAt(i);
            char end = s.charAt(j);
            
            if (start != end){
                return false; 
            }
            i++;
            j--;
        }
        return true;
    }
}

/*
Runtime: 15 ms, faster than 51.05% of Java online submissions for Palindrome Number.
Memory Usage: 45 MB, less than 41.37% of Java online submissions for Palindrome Number.
*/
