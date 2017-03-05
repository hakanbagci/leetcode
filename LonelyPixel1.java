public int findLonelyPixel(char[][] picture) {
    int numRows = picture.length;
    int numColumns = 0;
    if(numRows > 0) {
        numColumns = picture[0].length;
    }

    if(numRows == 0 || numColumns == 0) {
        return 0;
    }

    boolean[] rowStatus = new boolean[numRows];
    boolean[] colStatus = new boolean[numColumns];

    for (int i = 0; i < numRows; i++) {
        int numBs = 0;
        rowStatus[i] = true;
        for (int j = 0; j < numColumns; j++) {
            if (picture[i][j] == 'B') {
                ++numBs;
            }

            if (numBs > 1) {
                rowStatus[i] = false;
                break;
            }
        }
    }

    for (int i = 0; i < numColumns; i++) {
        int numBs = 0;
        colStatus[i] = true;
        for (int j = 0; j < numRows; j++) {
            if (picture[j][i] == 'B') {
                ++numBs;
            }

            if (numBs > 1) {
                colStatus[i] = false;
                break;
            }
        }
    }

    int result = 0;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numColumns; j++) {
            if (picture[i][j] == 'B' && rowStatus[i] && colStatus[j]) {
                ++result;
            }
        }
    }

    return result;
}
