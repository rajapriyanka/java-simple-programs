class Solution {
    public int earliestFinishTime(int[] landStartTime, int[] landDuration, int[] waterStartTime, int[] waterDuration) {
        int minFinishTime = Integer.MAX_VALUE;

        for (int i = 0; i < landStartTime.length; i++) {
            int landStart = landStartTime[i];
            int landDur = landDuration[i];

            for (int j = 0; j < waterStartTime.length; j++) {
                int waterStart = waterStartTime[j];
                int waterDur = waterDuration[j];

                // Case 1: land ride first
                int finishAfterLand = Math.max(waterStart, landStart + landDur) + waterDur;

                // Case 2: water ride first
                int finishAfterWater = Math.max(landStart, waterStart + waterDur) + landDur;

                // Update minimum finish time
                minFinishTime = Math.min(minFinishTime, Math.min(finishAfterLand, finishAfterWater));
            }
        }

        return minFinishTime;
    }
}
