class Solution {
    public int findKthPositive(int[] arr, int k) {
        int n = arr.length;
        int missingCount = arr[0] - 1; // Count of missing numbers before the first element
        if (missingCount >= k) {
            return k; // The kth missing number is less than the first element
        }
        
        for (int i = 1; i < n; i++) {
            int diff = arr[i] - arr[i - 1] - 1; // Count of missing numbers between the current and previous element
            if (missingCount + diff >= k) {
                // The kth missing number is between the previous and current element
                return arr[i - 1] + (k - missingCount);
            }
            
            missingCount += diff;
        }
        
        // The kth missing number is greater than the last element
        return arr[n - 1] + (k - missingCount);
    }
}
