import java.io.*;
import java.util.*;

class code {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            String s = br.readLine(); // Input string
            Solution obj = new Solution();
            String res = obj.encode(s); // Encodes the string
            System.out.println(res); // Outputs the encoded string
            System.out.println("~"); // Adds "~" after each result
        }
    }
}

class Solution {
    public static String encode(String s) {
        StringBuilder result = new StringBuilder();
        int count = 1;

        // Traverse the string to count consecutive characters
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++; // Increment count if characters are the same
            } else {
                result.append(s.charAt(i)).append(count); // Append character and its count
                count = 1; // Reset count for the next character
            }
        }

        // Append the last character and its count
        result.append(s.charAt(s.length() - 1)).append(count);

        return result.toString();
    }
}
