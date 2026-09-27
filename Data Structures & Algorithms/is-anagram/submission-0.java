class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        if (!(s.length() == t.length())) {
            return false;
        }
        int l = s.length();
        char[] sArray = s.toCharArray();
        char[] tArray = t.toCharArray();
        for (int i = 0; i < l; i++) {
            if (map1.containsKey(sArray[i])) {
                map1.put(sArray[i], map1.get(sArray[i]) + 1);
            }
            else {
                map1.put(sArray[i], 1);
            }
            if (map2.containsKey(tArray[i])) {
                map2.put(tArray[i], map2.get(tArray[i]) + 1);
            }
            else {
                map2.put(tArray[i], 1);
            }
        }
        return map1.equals(map2);
    }
}
