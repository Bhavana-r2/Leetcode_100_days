// Reverse Words in a String

// Given an input string s, reverse the order of the words.
// A word is defined as a sequence of non-space characters. The words in s will be separated by at least one space.
// Return a string of the words in reverse order concatenated by a single space.

// Example 1:

// Input: s = "the sky is blue"
// Output: "blue is sky the"

import java.util.Stack;

class Solution {
    public String reverseWords(String s) {
        Stack<Character> a = new Stack<>();
        String n = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (c == ' ' && !a.isEmpty()) {
                while (!a.isEmpty()) {
                    n = n + a.pop();
                }
                if (!n.isEmpty()) {
                    n = n + ' ';
                }
            } else if (c != ' ') {
                a.push(c);
            }
        }

        while (!a.isEmpty()) {
            n = n + a.pop();
        }

        // Remove leading and trailing spaces
        n = n.trim();

        return n;
    }
}
