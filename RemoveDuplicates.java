
// Given a sorted integer array nums, modify it in-place to remove duplicates and return the number of unique elements.
// The first k elements of the modified array should contain the unique elements in their original order. 
//The judge will verify your solution by comparing it to the expected output using assertions. 
//Example: for nums = [1,1,2], your function should return 2, and nums should become [1,2,_].




class Solution {
    public int removeDuplicates(int[] nums) {
    int n=nums.length;
    int j=0;
    for(int i=0;i<n;i++){
        if(nums[j]!=nums[i]){
            nums[j+1]=nums[i];
            j++;
        }
    }
    return j+1;
    }
}
