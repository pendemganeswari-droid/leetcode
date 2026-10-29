
class Solution {
    public long interchangeableRectangles(int[][] rectangles) {
        HashMap<String, Long> hm = new HashMap<>();
        long count = 0;

        for (int[] r : rectangles) {
            int w = r[0];
            int h = r[1];

            int g = gcd(w, h);
            String ratio = (w / g) + "/" + (h / g);

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