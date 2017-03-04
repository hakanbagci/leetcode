public boolean canWinNim(int n) {
    // If remainder is 1, 2 or 3, I take 1, 2 or 3 respectively in the first round
    // In consecutive rounds I take 4 - i stones, 
    // where i is the number of stones taken by the opponent.
    // If remainder is 0, the opponent can apply the same strategy and I lose.
    return (n % 4) != 0;
}
