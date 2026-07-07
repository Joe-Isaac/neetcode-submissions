class Solution {
    public boolean isAnagram(String s, String t) {
        if(s == null || t == null){
            return false;
        }

        if(s.length() != t.length()){
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        Arrays.sort(sc);
        Arrays.sort(tc);

        String sortedS = new String(sc);
        String sortedT = new String(tc);

        if(sortedS.equalsIgnoreCase(sortedT)){
            return true;
        }
        else{
            return false;
        }
    }
}
