class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> map = new HashMap<>();

        // Step 1: Count character frequencies
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        // Step 2: Convert map entries into a list
        List<Map.Entry<Character, Integer>> list =
            new ArrayList<>(map.entrySet());

        // Step 3: Sort by frequency in descending order
        list.sort((a, b) ->
            Integer.compare(b.getValue(), a.getValue()));

        // Step 4: Build the result
        StringBuilder res = new StringBuilder();

        for (var ele : list) {
            int n = ele.getValue();
            char c = ele.getKey();

            for (int i = 0; i < n; i++) {
                res.append(c);
            }
        }

        return res.toString();
    }
}