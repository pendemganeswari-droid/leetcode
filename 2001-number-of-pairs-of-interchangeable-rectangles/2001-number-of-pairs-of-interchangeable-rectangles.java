
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<Long, Long> hm = new HashMap<>();
        long count = 0;

        for (int[] rectangle : rectangles) {
            int w = rectangle[0];
            int h = rectangle[1];

            int g = gcd(w, h);
            w /= g;
            h /= g;

            long ratio = (long) w * 100001 + h;

            long freq = hm.getOrDefault(ratio, 0L);

            count += freq;

            hm.put(ratio, freq + 1);
        }

        return count;
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
