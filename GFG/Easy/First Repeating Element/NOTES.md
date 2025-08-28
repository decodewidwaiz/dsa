
          First Repeating Element

          - Summary: The code uses a HashMap to store array elements as keys and their indices as values. It iterates through the input array; if an element is already in the HashMap (meaning it's a repeated element), it updates the index of the first occurrence if the current index is smaller.  If an element is not in the HashMap, it's added with its index. Finally, it returns the index of the first repeated element or -1 if no element is repeated.

          - Time Complexity: O(n) because the code iterates through the array once. HashMap operations (containsKey, get, put) take constant time on average.
          - Space Complexity: O(n) in the worst case because the HashMap can store up to n key-value pairs if all elements are unique. In the best case it can be O(1) if all elements are same.
          