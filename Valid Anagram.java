class Solution {
    public boolean isAnagram(String s, String t) {
        // sort the strings so that they are in the same order and check if they are the same
        
        char s1[] = s.toCharArray();
        char t1[] = t.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(t1);
        
        String s2 = Arrays.toString(s1);
        String t2 = Arrays.toString(t1);
        
        System.out.println(s1);
        System.out.println(t1);
        
        return s2.equals(t2);
    }
}
/*
Runtime: 25 ms, faster than 18.07% of Java online submissions for Valid Anagram.
Memory Usage: 47.6 MB, less than 5.60% of Java online submissions for Valid Anagram.
*/
