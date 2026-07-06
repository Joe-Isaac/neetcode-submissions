class Solution {
    public boolean hasDuplicate(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        int[] newNums = nums;

        for(int i = 0; i < nums.length; i++){
            for(int j = 0; j < newNums.length; j++){
                if(i == j){
                    continue;
                }

                if(nums[i] == nums[j]){
                    return true;
                }
            }
        }

        return false;
    }
}