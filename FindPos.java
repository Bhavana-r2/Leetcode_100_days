// Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

// If target is not found in the array, return [-1, -1].

// You must write an algorithm with O(log n) runtime complexity.

// Example 1:
// Input: nums = [5,7,7,8,8,10], target = 8
// Output: [3,4]



class Solution {
    public int[] searchRange(int[] nums, int target) {
        int first=-1;
        int last=-1;

    for(int i=0;i<nums.length;i++){
        if(target==nums[i]){
            if(first==-1){
                first=i;
            }
          last=i;  
        }
       
    }

    if(first>=0){
         return new int[]{first, last};
    }else{
        return new int[]  {-1,-1}; 
    }
     
    
   
    }
      
    }