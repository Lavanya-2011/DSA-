public class AnagramCheck {
    public static boolean isAnagram(String s, String t) {

        // Step 1: Check length
        if (s.length() != t.length()) {
            return false;
        }

        // Step 2: Create count array for 26 lowercase letters
        int[] count = new int[26];

        // Step 3: Count characters
        for (int i = 0; i < s.length(); i++) {
            count[s.charAt(i) - 'a']++;  // Increase for s
            count[t.charAt(i) - 'a']--;  // Decrease for t
        }

        // Step 4: Check if all counts are 0
        for (int num : count) {
            if (num != 0) {
                return false;
            }
        }

        // Step 5: If all zero, it's an anagram
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram")); // true
        System.out.println(isAnagram("rat", "car"));         // false
    }
}