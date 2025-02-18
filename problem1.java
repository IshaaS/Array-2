// Time Complexity :O(n)
// Space Complexity :O(1)
// Did this code successfully run on Leetcode :yes
// Any problem you faced while coding this :no


// code along with comments explaining the approach:
// we are changing number to -1 if we find that index has its corresponding value. like hashmap
// but without using extra space.

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> result = new ArrayList<>();
        int n = nums.length;
        for(int i =0; i<n; i++){
            int temp= Math.abs(nums[i])-1;
            if(nums[temp]>0){
                nums[temp]=-1*nums[temp];
            }
        }
        for(int i =0; i<n; i++){
            if(nums[i]>0) result.add(i+1);
        }
        return result;
    }
}