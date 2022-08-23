class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> check = new HashSet<Integer>();
        
        for (int i=0; i<nums.length; i++){
            if (check.contains(nums[i])){
                return true;
            }
            check.add(nums[i]);
        }
        return false;
    }
}

/*
Runtime: 17 ms, faster than 39.07% of Java online submissions for Contains Duplicate.
Memory Usage: 71.5 MB, less than 21.94% of Java online submissions for Contains Duplicate.
*/
