public List<Integer> findDisappearedNumbers(int[] nums) {
    for (int i = 0; i < nums.length; i++) {
        // Here we use absolute value to ensure the index is positive.
        // Nums array is being modified, 
        // therefore we can have either positive or negative of the actual value at index i
        int index = Math.abs(nums[i]) - 1;
        nums[index] = -Math.abs(nums[index]);
    }

    List<Integer> result = new ArrayList<>();
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] > 0) {
            result.add(i + 1);
        }
    }

    return result;
}
