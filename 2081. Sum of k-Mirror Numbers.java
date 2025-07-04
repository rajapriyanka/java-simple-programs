class Solution {

      public long kMirror(int base, int count) {
        long sum = 0; 
        for (int length = 1; ; ++length) {
           
            int start = (int) Math.pow(10, (length - 1) / 2);
            int end = (int) Math.pow(10, (length + 1) / 2);

            for (int i = start; i < end; i++) {
                long palindrome = i;
            for (int j = length % 2 == 0 ? i : i / 10; j > 0; j /= 10) {
                    palindrome = palindrome * 10 + j % 10; 
                }
                String baseRepresentation = Long.toString(palindrome, base);
              
                // Check if the base representation is a palindrome
                if (isPalindrome(baseRepresentation.toCharArray())) {
                    sum += palindrome; // Add current palindrome to sum
                    if (--count == 0) { // Decrement count and check if 'n' k-mirror numbers are found
                        return sum; // Return the sum if 'n' k-mirror numbers are found
                    }
                }
            }
        }
    }

    // This method checks if the character array forms a palindrome
    private boolean isPalindrome(char[] charArray) {
        // Compare characters from opposite ends moving towards the center
        for (int i = 0, j = charArray.length - 1; i < j; i++, j--) {
            if (charArray[i] != charArray[j]) {
                return false; // Return false if mismatch is found
            }
        }
        return true; // Return true if the entire array is a palindrome
    }
}
