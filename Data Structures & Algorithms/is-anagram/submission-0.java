class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> countS = new HashMap<>();
        HashMap<Character, Integer> countT = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            countS.put(c, countS.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            countT.put(c, countT.getOrDefault(c, 0) + 1);
        }
        return countS.equals(countT);
    }
}
