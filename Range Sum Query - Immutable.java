Leetcode Problem No. 303:

Problem Title: Range Sum Query - Immutable
Link : https://leetcode.com/problems/range-sum-query-immutable/


Solution : 

class NumArray {
    private int[] pref;

    public NumArray(int[] nums) {
        pref = new int[nums.length];
        pref[0] = nums[0];

        for (int i = 1; i < nums.length; i++) {
            pref[i] = pref[i - 1] + nums[i];
        }
    }

    public int sumRange(int left, int right) {
        return left == 0 ? pref[right] : pref[right] - pref[left - 1];
    }
}


