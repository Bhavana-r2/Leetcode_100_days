// Convert Sorted Array to Binary Search Tree

// Given an integer array nums where the elements are sorted in ascending order, convert it to a 
// height-balanced binary search tree.

// Example 1:

// // Input: nums = [-10,-3,0,5,9]
// Output: [0,-3,9,-10,null,5]
// Explanation: [0,-10,5,null,-3,null,9] is also accepted:

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
            if (nums.length == 0) {
                return null;
            }
    
            return sortedArrayToBSTHelper(nums, 0, nums.length - 1);
        }
    
        private TreeNode sortedArrayToBSTHelper(int[] nums, int start, int end) {
            if (start > end) {
                return null;
            }
    
            int mid = start + (end - start) / 2;
            TreeNode root = new TreeNode(nums[mid]);
    
            root.left = sortedArrayToBSTHelper(nums, start, mid - 1);
            root.right = sortedArrayToBSTHelper(nums, mid + 1, end);
    
            return root;
        
        
        }
    }