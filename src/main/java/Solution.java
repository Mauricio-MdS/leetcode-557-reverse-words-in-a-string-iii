class Solution {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (String word : words) {
            reversedWords.append(new StringBuilder(word).reverse().append(" "));
        }

        return reversedWords.deleteCharAt(reversedWords.length() -1).toString();
    }
}