class Solution {
    public int reverse(int x) {
        int revNum = 0;

        while (x != 0) {
            int rem = x % 10;

            // Check for overflow before multiplying revNum by 10
            if (revNum > Integer.MAX_VALUE / 10 || (revNum == Integer.MAX_VALUE / 10 && rem > 7)) {
                return 0;
            }
            if (revNum < Integer.MIN_VALUE / 10 || (revNum == Integer.MIN_VALUE / 10 && rem < -8)) {
                return 0;
            }

            revNum = (revNum * 10) + rem;
            x = x / 10;
        }

        return revNum;
    }
}
