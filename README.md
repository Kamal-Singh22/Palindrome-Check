# Palindrome-Check
Write a program to check if a given string is a palindrome. A palindrome is a word, phrase, or sequence of characters that reads the same forward and backward (ignoring spaces, punctuation, and capitalization).
Explanation:
The isPalindrome method removes any non-alphanumeric characters and converts the string to lowercase to handle spaces, punctuation, and case insensitivity.
Then it uses two pointers (left and right) to compare characters from both ends of the string.
If at any point characters do not match, the method returns false.
If the loop completes successfully, the method returns true, indicating the string is a palindrome.
