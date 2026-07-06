class Solution {
    public boolean hasDuplicate(int[] nums) {
        if(nums == null || nums.length == 0){
            return false;
        }

        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if((i < (nums.length - 1)) && nums[i] == nums[i + 1]){
                return true;
            }
        }

        // Set<Integer> seen = new HashSet<>();

        // for(int num: nums){
        //     if(!seen.add(num)){
        //         return true;
        //     }
        // }

        return false;
    }
}