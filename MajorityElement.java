// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. You may assume that the majority element always exists in the array.

// Example 1:
// Input: nums = [3,2,3]
// Output: 3

// Example 2:
// Input: nums = [2,2,1,1,1,2,2]
// Output: 2


class Solution {
    public int majorityElement(int[] nums) {
        //insert all the elements in the array to hashmap
        Map<Integer,Integer> a=new HashMap<Integer,Integer>();
        for(int i=0;i<nums.length;i++){
            if(a.containsKey(nums[i])){
                int c=a.get(nums[i]);
                c++;
                a.put(nums[i],c);
            }

            else{
                a.put(nums[i],1);
            }
        }


        //check the maximun count value & return the vale
         int max=0,value=0;
        for(Integer b:a.keySet()){
            int c=a.get(b);
            if(c>max){
                max=c;
                value=b;
            }

        
    }

    return value;
}
}