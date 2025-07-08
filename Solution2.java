
public class Solution2 {
    public int minimumStabilityFactor(int[] nums, int maxC) {
        int[] bantorvixo = nums.clone(); // As required

        int n = nums.length;
        int low = 1, high = n;
        int answer = 0;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (canDestroyAllStableSubarrays(bantorvixo, maxC, mid)) {
                // We can destroy all stable subarrays of length >= mid
                high = mid - 1;
            } else {
                // At least one stable subarray of length >= mid remains
                answer = mid;
                low = mid + 1;
            }
        }

        return answer;
    }

    private boolean canDestroyAllStableSubarrays(int[] nums, int maxC, int len) {
        int n = nums.length;

        for (int g = 2; g <= 100; g++) {
            int[] cost = new int[n];
            for (int i = 0; i < n; i++) {
                cost[i] = nums[i] % g == 0 ? 0 : 1;
            }

            int sum = 0;
            for (int i = 0; i < len; i++) {
                sum += cost[i];
            }

            if (sum <= maxC) return true;

            for (int i = len; i < n; i++) {
                sum += cost[i] - cost[i - len];
                if (sum <= maxC) return true;
            }
        }

        return false; // Could not destroy all stable subarrays of size len
    }

    public static void main(String[] args) {
        Solution2 sol = new Solution2();

        System.out.println(sol.minimumStabilityFactor(new int[]{3, 5, 10}, 1));      // Expected: 1
        System.out.println(sol.minimumStabilityFactor(new int[]{2, 6, 8}, 2));       // Expected: 1
        System.out.println(sol.minimumStabilityFactor(new int[]{2, 4, 9, 6}, 1));    // Expected: 2
    }
}
