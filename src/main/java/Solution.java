class Solution {
    public String reverseWords(String s) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : s.toCharArray()) {
            if (c == ' ') {
                result.append(word.reverse());
                word.setLength(0);
                result.append(' ');
            } else {
                word.append(c);
            }
        }

        result.append(word.reverse());
        return result.toString();
    }
}