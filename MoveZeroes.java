public void moveZeroes(int[] nums) {
    int numZeroes = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == 0) {
            numZeroes++;
        }
    }

    int curIndex = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] != 0) {
            nums[curIndex] = nums[i];
            curIndex++;
        }
    }

    for (int i = curIndex; i < nums.length; i++) {
        nums[i] = 0;
    }
}
