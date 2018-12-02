class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
        List<String> matchingWords = new ArrayList<String>();
        for(String word : words){
            if(checkPattern(word, pattern))
                matchingWords.add(word);
        }
        return matchingWords;
    }
    public boolean checkPattern(String word, String pattern){
        Map<Character, Character> mapWords = new HashMap<Character, Character>();
        Map<Character, Character> mapPattern = new HashMap<Character, Character>();
        if(word.length() != pattern.length())
            return false;
        for(int i = 0; i < pattern.length(); i++){
            if(!mapPattern.containsKey(pattern.charAt(i)))
                mapPattern.put(pattern.charAt(i),word.charAt(i));
            if(!mapWords.containsKey(word.charAt(i)))
                mapWords.put(word.charAt(i), pattern.charAt(i));
            if(mapWords.get(word.charAt(i)) != pattern.charAt(i) || 
               mapPattern.get(pattern.charAt(i)) != word.charAt(i))
                return false;
        }
        return true;
    }
}