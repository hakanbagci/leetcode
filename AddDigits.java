public int addDigits(int num) {
    if (num == 0) {
        return 0;
    }

    // if a number is divisible by 9, then its sum of digits
    if (num % 9 == 0) {
        return 9;
    }

    return num % 9;
}
