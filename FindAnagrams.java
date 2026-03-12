
import java.util.*;

public class FindAnagrams {

    public static List<Integer> findAnagrams(String s, String p) {

        List<Integer> result = new ArrayList<>();

        if (s.length() < p.length())
            return result;

        int[] pCount = new int[26];
        int[] sCount = new int[26];

        // Count characters in p
        for (char c : p.toCharArray()) {
            pCount[c - 'a']++;
        }

        int k = p.length();

        for (int i = 0; i < s.length(); i++) {

            // Add current character to window
            sCount[s.charAt(i) - 'a']++;

            // Remove character if window size exceeds k
            if (i >= k) {
                sCount[s.charAt(i - k) - 'a']--;
            }

            // Compare frequency arrays
            if (Arrays.equals(pCount, sCount)) {
                result.add(i - k + 1);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        String s = "cbaebabacd";
        String p = "abc";

        List<Integer> ans = findAnagrams(s, p);

        System.out.println(ans);
    }
}