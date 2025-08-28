
          Remove Duplicates from Sorted Array

          - Summary: The code uses an integer array to store the input numbers. It employs a two-pointer approach: one pointer ('i') iterates through the array, and another ('j') tracks the index of the last unique element encountered. If 'nums[i]' is different from 'nums[j]', it means a new unique element is found; hence, 'j' is incremented, and 'nums[j]' is updated with 'nums[i]'. Finally, 'j+1' represents the length of the array with duplicates removed.

          - Time Complexity: O(n) because the code iterates through the input array once.
          - Space Complexity: O(1) because it uses only a constant amount of extra space (two integer variables 'i' and 'j').
          