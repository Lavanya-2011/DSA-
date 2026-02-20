public class FindFirstOccurrence {

    // Function to find first occurrence
    public static int strStr(String haystack, String needle) {

        int n = haystack.length();
        int m = needle.length();

        // Loop through haystack
        for (int i = 0; i <= n - m; i++) {

            int j = 0;

            // Compare characters
            while (j < m && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }

            // If all characters matched
            if (j == m) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        // Example 1
        System.out.println(strStr("sadbutsad", "sad"));  // Output: 0

        // Example 2
        System.out.println(strStr("leetcode", "leeto")); // Output: -1
    }
}