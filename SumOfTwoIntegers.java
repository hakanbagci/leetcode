// In this question + and - operators are not allowed
// Half Adder logic will be utilized for adding two integers
public int getSum(int a, int b) {
    // iterate until carry is 0
    while(b != 0) {
        // carry holds the set bits of a and b
        int carry = a & b;

        // xor is like add operation, but cannot handle carry
        // we use the calculated a&b to handle carry
        a = a ^ b;

        // carry is shifted by 1 to be added to next digit
        b = carry << 1;
    }

    return a;
}
