
          Two Sum

          - Summary: This Java code uses an array to find two numbers that add up to a target value.  It employs a nested loop approach: the outer loop iterates through each number in the input array, and the inner loop checks if the complement (target - current number) exists in the remaining elements. If a pair is found, their indices are returned; otherwise, it continues until either a pair is found or all combinations are checked. If no pair is found, it returns an array containing -1.

          - Time Complexity: O(n^2) because of the nested for loops. The algorithm iterates through all possible pairs of numbers in the input array.
          - Space Complexity: O(1). The space used by the algorithm is constant and does not depend on the size of the input array. It only uses a few integer variables.
          