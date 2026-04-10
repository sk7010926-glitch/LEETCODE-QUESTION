class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length-1;
        int maxlen=0;
        int i=0;
        while(i<nums.length){
            if(i>maxlen){
                return false;
            }
            maxlen=Math.max(maxlen,i+nums[i]);
            if(maxlen>=n){
                return true;
            }
            i++;
        }
        return false;
    }
}