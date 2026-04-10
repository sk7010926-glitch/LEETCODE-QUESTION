class Solution {
    public int singleNumber(int[] nums) {
        int s=nums.length;
        int t=0;
        for(int i=0;i<s;i++){
            t=t^nums[i];
        }
        return t;
    }
}