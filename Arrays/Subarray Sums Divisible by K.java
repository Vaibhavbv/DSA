//BRUTE FORCE
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int count = 0;
        for(int i=0; i<n; i++){
            int sum = 0;
            for(int j=i; j<n; j++){
                sum += nums[j];
                if(sum % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
// OPTIMIZED
class Solution{
    public int subarraysDivByK(int[] A, int K) {
        int count = 0;
        int[] prefixSumFrequency = new int[K];
        prefixSumFrequency[0] = 1; // To handle subarrays starting from index 0.

        int sum = 0;
        for (int num : A) {
            sum = (sum + num) % K;
            if (sum < 0) sum += K; // Handle negative sum

            // If the prefix sum has already been encountered, add its frequency to the count
            count += prefixSumFrequency[sum];

            // Update the prefix sum frequency
            prefixSumFrequency[sum]++;
        }

        return count;
    }
}
