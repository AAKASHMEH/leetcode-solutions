class Solution {
    public boolean check(int[] nums) {

        return sort(nums, 0, 1, 0);
    }

    private boolean sort(int[] nums, int left, int right, int count) {

        if (right >= nums.length) {

            // Check last element with first element
            if (nums[nums.length - 1] > nums[0]) {
                count++;
            }

            return count <= 1;
        }

        if (nums[left] > nums[right]) {
            count++;
        }

        if (count > 1) {
            return false;
        }

        return sort(nums, left + 1, right + 1, count);
    }
}