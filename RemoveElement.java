//Remove Element

// Remove all occurrences of a specified value val from the integer array nums in-place. The order of the remaining elements may change. Return the count of elements in nums that are not equal to val.
// Example:

// Input: nums = [3,2,2,3], val = 3
// Output: 2
// Explanation: The first two elements of nums are 2.

// Input: nums = [0,1,2,2,3,0,4,2], val = 2
// Output: 5
// Explanation: The first five elements of nums are 0, 1, 4, 0, 3.



class Solution {
    public int removeElement(int[] nums, int val) {
        
        int k=0;
        for(int i=0;i<nums.length;i++){
            if(val!=nums[i]){
               nums[k]=nums[i];
               k++;
            }
        }
        return k;
    }
}