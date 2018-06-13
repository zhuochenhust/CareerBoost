package DSA.TwoPointers.RemoveDuplicatesfromSortedArray;

/*
 * Given a sorted array, remove the duplicates in-place such that each element appear only once and return the new length.

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

Example:

Given nums = [1,1,2],

Your function should return length = 2, with the first two elements of nums being 1 and 2 respectively.
It doesn't matter what you leave beyond the new length.
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0 || nums == null) {
            return 0;
        }
        // use count and i as two pointers, count for update new array and result
        // since delete from the next one, so count start from 1
       // keep remove the dup ones by assign the good ones later into the current dup place
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] != nums[i]) {
                nums[count] = nums[i];
                count++;
            }
        }
        return count;
    }
}
