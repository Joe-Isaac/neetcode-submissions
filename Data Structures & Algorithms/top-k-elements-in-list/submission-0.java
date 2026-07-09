class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> frequencyGroups = new HashMap<>();

        for(int num : nums){
            if(frequencyGroups.containsKey(num)){
                frequencyGroups.put(num, frequencyGroups.get(num) + 1);
            }
            else{
                frequencyGroups.put(num, 1);
            }
        }

        return frequencyGroups
            .entrySet()
            .stream()
            .sorted(Map.Entry.<Integer, Integer>comparingByValue().reversed())
            .limit(k)
            .mapToInt(Map.Entry::getKey)
            .toArray();
    }
}
