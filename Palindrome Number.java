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
