



// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        // Code Here
        Arrays.sort(arr);
        int n = arr.length;
        int largest = arr[n-1];
        int s = -1;
        for(int i:arr){
            if(i<largest) s = i;
        }
        return s;
    }
}