

// User function Template for Java

class Solution {
    // Function to return the position of the first repeating element.
    public static int firstRepeated(int[] arr) {
        // Your code here
        int n = arr.length;
        HashMap<Integer, Integer> map = new HashMap<>();
        int first = Integer.MAX_VALUE;
        for(int i=0;i<n;i++){
            if(map.containsKey(arr[i])){
                int idx =map.get(arr[i]);
                if(idx<first){
                    first = idx;
                }
            }
            else{
                map.put(arr[i], i+1);
            }
        }
        return (first == Integer.MAX_VALUE) ? -1 : first;
    }
}
