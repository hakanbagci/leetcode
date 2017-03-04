public int hammingDistance(int x, int y) {
    int result = x ^ y;
    int count = 0;

    for(int i = 0; i < 32; i++) {
        if((result & 1) == 1) {
            count++;
        }

        result = result >> 1;
    }

    return count;
}
