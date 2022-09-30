class Solution {
    public void reverseString(char[] s) {
        int i = 0;
        int j = s.length-1;
        
        while(i<j){
            char temp = s[i];
            s[i]=s[j];
            s[j]=temp;
            
            i++;
            j--;
        }
    }
}

/*
Runtime: 2 ms, faster than 40.67% of Java online submissions for Reverse String.
Memory Usage: 54.4 MB, less than 68.16% of Java online submissions for Reverse String.
*/
