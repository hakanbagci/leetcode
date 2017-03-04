public int findMaxConsecutiveOnes(int[] nums) {
    int globalMaxOnes = 0;
    int maxOnes = 0;

    for (int num : nums) {
        if (num == 1) {
            ++maxOnes;
        } else {
            globalMaxOnes = Math.max(globalMaxOnes, maxOnes);
            maxOnes = 0;
        }
    }

    // At the end maxOnes can be greater than globalMaxOnes.
    // Hence return the maximum of two.
    return Math.max(globalMaxOnes, maxOnes);
}
