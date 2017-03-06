public String[] findRelativeRanks(int[] nums) {
    int length = nums.length;

    // Since each score is unique we can use a hashmap to store the indexes of each score before sorting.
    // After sorting we can get the old index from the map and set the ranks of each athlete using the sorted array.
    Map<Integer, Integer> indexMap = new HashMap<Integer, Integer>();
    for (int i = 0; i < length; i++) {
        indexMap.put(nums[i], i);
    }

    Arrays.sort(nums);
    String[] result = new String[length];

    for (int i = 0; i < length; i++) {
        int index = indexMap.get(nums[i]);
        if (i == length - 1) {
            result[index] = "Gold Medal";
        } else if (i == length - 2) {
            result[index] = "Silver Medal";
        } else if (i == length - 3) {
            result[index] = "Bronze Medal";
        } else {
            result[index] = (length - i) + "";
        }
    }

    return result;
}
