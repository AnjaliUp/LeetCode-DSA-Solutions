class Solution {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        int low = 1;
        int high = num - 1;
        while (high >= low) {
            Long mid = (long) ((high + low) / 2);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid > num) {
                high = (int) (mid - 1);
            } else {
                low = (int) (mid + 1);
            }
        }
        return false;
    }
}