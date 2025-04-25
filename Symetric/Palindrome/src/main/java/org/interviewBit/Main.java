package org.interviewBit;

/* Given a string, determine if it is a palindrome. While checking for a palindrome, you have to ignore spaces,
case, and all special characters; i.e. consider only alphanumeric characters.

Check the sample test case for reference.
Return 0 / 1 ( 0 for false, 1 for true ) for this problem  */

public class Main {
    public int isPalindrome(String A) {
        StringBuilder sb = new StringBuilder();
        for (char c : A.toCharArray()) {
            if (Character.isLetterOrDigit(c)) {
                sb.append(Character.toLowerCase(c));
            }
        }

        String cleaned = sb.toString();

        int left = 0, right = cleaned.length() - 1;
        while (left < right) {
            if (cleaned.charAt(left) != cleaned.charAt(right)) {
                return 0;
            }
            left++;
            right--;
        }

        return 1;
    }
}

