
//1. Two Sum

// Given an array of integers nums and an integer target, find and return the indices of two numbers in the array 
//such that their sum equals the target. It is guaranteed that there is exactly one solution, 
//and each element in the array can only be used once. The order of the output indices does not matter.
// Constraints include an array length between 2 and 10^4, element values between -10^9 and 10^9, and a target value between -10^9 and 10^9.

class Solution {
    public static int[] twoSum(int[] nums, int target) {
       int n = nums.length;
       for (int i = 0; i < n - 1; i++) {
           for (int j = i + 1; j < n; j++) {
               if (nums[i] + nums[j] == target) {
                   return new int[] { i, j };
               }
           }
       }
       // No solution found
       return new int[0];
   }

}
