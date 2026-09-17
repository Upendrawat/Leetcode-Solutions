class Solution {
    public String reverseWords(String str) {
       if (str == null || str.trim().isEmpty()) {
            return str;
        }

        String[] words = str.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
           
            StringBuilder word = new StringBuilder(words[i]);
            result.append(word.reverse());

            if (i < words.length - 1) {
                result.append(" ");
            }
        }


        return result.toString();
    }
}