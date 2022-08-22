class Solution {
    public boolean isPalindrome(String s) {
        String dupe = s.replaceAll("\\p{Punct}", "");
        dupe = dupe.replaceAll(" ", "");
        dupe = dupe.toLowerCase();
        
        int i = 0;
        int j = dupe.length() - 1;
        
        while (i<j){
            char start = dupe.charAt(i);
            char end = dupe.charAt(j);
            
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
Runtime: 35 ms, faster than 38.24% of Java online submissions for Valid Palindrome.
Memory Usage: 48 MB, less than 19.02% of Java online submissions for Valid Palindrome.
*/
