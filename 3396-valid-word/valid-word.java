class Solution {
    public boolean isValid(String word) {
        int length = 0;
        int vowel = 0;
        int consonant = 0;

        for (char ch : word.toCharArray()) {
            if (!Character.isLetterOrDigit(ch)) {
                return false; 
            }

            length++;

            if (Character.isLetter(ch)) {
                char lower = Character.toLowerCase(ch);
                if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        return length >= 3 && vowel >= 1 && consonant >= 1;
    }
}
