class Solution {
    public int[] twoSum(int[] nums, int target) {
        if(nums == null){
            return new int[2];
        }

        for(int i = 0; i < nums.length; i ++){
            for(int j = 0; j < nums.length; j++){
                if(j == i){
                    continue;
                }

                if(nums[i] + nums[j] == target){
                    int[] response = {i, j};
                    Arrays.sort(response);
                    return response;
                }
            }
        }

        return new int[2];
    }
}
