class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> seen = new HashMap<>();

        // loop through the strings. sort each string and use the sorted string as key.
        // the original version of the string will be added to the list value of the map.
        // the next iteration checks if the current string sorted is a key, which would mean it's an anagram
        // if it is, add it to the list already in the map, if not, make the sorted current string a new key,
        // and save the og version of that current string as a list, then continue and repeat.
        // checking the string from hashmap guarantees O(1).

        for(String str : strs){
            char[] chars = str.toCharArray();
            Arrays.sort(chars);
            String sortedString = new String(chars);

            if(seen.containsKey(sortedString)){
                seen.get(sortedString).add(str);
            }
            else{
                List newAnagramGroup = new ArrayList<>();
                newAnagramGroup.add(str);
                seen.put(sortedString, newAnagramGroup);
            }
            
            // seen.computeIfAbsent(sortedString, k -> new ArrayList<>()).add(str);
        }

        return new ArrayList<>(seen.values());
    }
}
