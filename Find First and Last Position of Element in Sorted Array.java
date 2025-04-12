Leetcode Problem No. 32:

Problem Titie:  Find First and Last Position of Element in Sorted Array

Solution : 

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] res = {-1, -1};
        res[0] = findBound(nums, target, true);
        if (res[0] != -1) {
            res[1] = findBound(nums, target, false);
        }
        return res;
    }

    private int findBound(int[] nums, int target, boolean isFirst) {
        int left = 0, right = nums.length - 1, ans = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (nums[mid] == target) {
                ans = mid;
                if (isFirst) right = mid - 1;
                else left = mid + 1;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return ans;
    }
}
