public int[] nextGreaterElement(int[] findNums, int[] nums) {
    Set<Integer> unprocessedNums = new HashSet<>();
    Map<Integer, Integer> processedNums = new HashMap<>();

    for (int i = 0; i < nums.length; i++) {
        unprocessedNums.add(nums[i]);

        Iterator<Integer> iter = unprocessedNums.iterator();

        while (iter.hasNext()) {
            int uNum = iter.next();
            if (nums[i] > uNum) {
                processedNums.put(uNum, nums[i]);
                iter.remove();
            }
        }
    }

    int result[] = new int[findNums.length];

    for (int i = 0; i < findNums.length; i++) {
        if (unprocessedNums.contains(findNums[i])) {
            result[i] = -1;
        } else {
            result[i] = processedNums.get(findNums[i]);
        }
    }

    return result;
}
