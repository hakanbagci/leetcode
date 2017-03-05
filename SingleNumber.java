public int singleNumber(int[] nums) {
    // If we xor two same numbers we get 0.
    // Then if we xor all the numbers in the array, we get the single number.
    int result = nums[0];
    for (int i = 1; i < nums.length; i++) {
        result = result ^ nums[i];
    }

    return result;
}
