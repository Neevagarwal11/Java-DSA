package BinarySearch.Leetcode;

class BinarySearch1482 {
    public int minDays(int[] bloomDay, int m, int k) {

        if (m * (long) k > bloomDay.length || m * k > bloomDay.length) {
            return -1;
        }
        int lowerbound = Integer.MAX_VALUE;
        int upperbound = Integer.MIN_VALUE;

        for (int bloom : bloomDay) {
            lowerbound = Math.min(lowerbound, bloom);
            upperbound = Math.max(upperbound, bloom);
        }

        while (lowerbound < upperbound) {

            int mid = lowerbound + (upperbound - lowerbound) / 2;

            if (canMake(bloomDay, m, k, mid)) {
                upperbound = mid;
            } else {
                lowerbound = mid + 1;
            }

        }

        return lowerbound;

    }

    boolean canMake(int[] bloomDay, int total, int flowers, int mid) {
        int flowerCount = 0;

        for (int i = 0; i < bloomDay.length; i++) {
            if (bloomDay[i] <= mid) {
                flowerCount++;
                if (flowerCount == flowers) {
                    total--;
                    flowerCount = 0;
                    if (total == 0)
                        return true;
                }

            } else {
                flowerCount = 0;
            }
        }
        return false;

    }
}