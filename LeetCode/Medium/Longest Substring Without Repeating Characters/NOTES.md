
          Longest Substring Without Repeating Characters

          - Summary: The code utilizes a HashMap to store characters and their counts within a sliding window.  It iterates through the string using two pointers, `i` and `j`, expanding the window (j++) and updating the HashMap. If a repeating character is found (map.size() < j - i + 1), the window shrinks from the left (i++) until the repetition is removed. The algorithm keeps track of the maximum window size (max) representing the length of the longest substring without repeating characters.

          - Time Complexity: O(n) because each character is visited and processed at most twice: once when the right pointer `j` expands the window and once (at most) when the left pointer `i` shrinks the window to remove repetitions. 
          - Space Complexity: O(min(m, n)), where n is the length of the string and m is the size of the character set. In the worst-case scenario, where all characters in the string are unique, the HashMap will store all characters, resulting in a space complexity proportional to the number of unique characters.
          