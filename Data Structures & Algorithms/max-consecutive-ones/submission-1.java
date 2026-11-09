class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int i = 0;
        int count = 0;
        int maxLen = 0;
        for(i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
            }if(maxLen < count){
                maxLen = count;
            }
            else if(nums[i]==0){
                count = 0;
            }
        }
        return maxLen;
    }
}