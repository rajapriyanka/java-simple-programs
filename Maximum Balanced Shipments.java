class Solution {
    public int maxBalancedShipments(int[] weight) {
        int n = weight.length;
        int count = 0;
        int i = 0;

        while (i < n) {
            int maxWeight = weight[i];
            int j = i;

            while (j < n) {
                maxWeight = Math.max(maxWeight, weight[j]);

                if (weight[j] < maxWeight) {
                    count++;
                    break;
                }
                j++;
            }

            i = (j == i) ? i + 1 : j + 1; // if no progress, move forward to avoid infinite loop
        }

        return count;
    }
}
