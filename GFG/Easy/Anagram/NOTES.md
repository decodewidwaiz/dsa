
          Anagram Checker

          - Summary: The function uses character arrays to check if two strings are anagrams. First, it converts the input strings into character arrays. Then, it sorts both arrays. Finally, it compares the sorted arrays using Arrays.equals(). If the sorted arrays are equal, it returns true indicating that the strings are anagrams; otherwise, it returns false.

          - Time Complexity: O(n log n), where n is the length of the longer string. This is dominated by the time complexity of sorting the character arrays using Arrays.sort(), which typically uses a variation of merge sort or quicksort with an average time complexity of O(n log n).
          - Space Complexity: O(n), where n is the length of the longer string. This is because the space used by the character arrays ch1 and ch2 is proportional to the length of the input strings.
          