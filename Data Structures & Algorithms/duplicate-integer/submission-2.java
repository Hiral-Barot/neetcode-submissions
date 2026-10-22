class Solution {
    public boolean hasDuplicate(int[] nums) {
        boolean isDuplicate =  false;
        Arrays.sort(nums);
        for(int i=1; i<nums.length; i++){
            // for(int j=i+1; j<nums.length; j++){
                if(nums[i-1] == nums[i]){
                    isDuplicate = true;
                }
            //}
        }

        return isDuplicate;
    }
}