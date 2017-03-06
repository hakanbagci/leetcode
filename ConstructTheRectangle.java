public int[] constructRectangle(int area) {
    double sqrtArea = Math.sqrt(area);
    // the maximum positive integer that is smaller than square root of area 
    int tempInt = (int)sqrtArea;

    int width = 1;
    int length = area;

    // iterate down to 1 to find two positive integers that when multiplied we get the given area.
    for (int i = tempInt; i > 0; i--) {
        if (area % i == 0) {
            width = i;
            length = area / width;
            break;
        }
    }

    return new int[] { length, width };
}
