class Solution {
    public boolean hasDuplicate(int[] nums) {
        // List<Integer> list = new ArrayList<>();
        Set<Integer> seen = new HashSet<>();

        for(int num: nums){
            if(!seen.add(num)){
                return true;
            }
        }

        return false;
    }
}