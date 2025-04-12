Leetcode Problem No. 560:

Problem Title: Subarray Sum Equals K
Solution : 

class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int curr = 0;
        Map<Integer, Integer> map = new HashMap();
        map.put(0, 1);
        for(int i : nums){
            curr += i;
            count += map.getOrDefault(curr - k, 0);
            map.put(curr, map.getOrDefault(curr, 0) + 1);
        }        
        return count;
    }
}

