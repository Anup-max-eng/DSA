class Solution {
    public int countCharacters(String[] words, String chars) {
        int totalLength = 0;
        HashMap<Character, Integer> charsMap = buildFreqMap(chars);

        for (String word : words) {
            if (canFormWord(word, charsMap)) {
                totalLength += word.length();
            }
        }

        return totalLength;
    }

    private HashMap<Character, Integer> buildFreqMap(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        return map;
    }

    private boolean canFormWord(String word, HashMap<Character, Integer> charsMap) {
        HashMap<Character, Integer> wordMap = new HashMap<>();

        for (char c : word.toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
            if (wordMap.get(c) > charsMap.getOrDefault(c, 0)) {
                return false;
            }
        }

        return true;
    }
}
