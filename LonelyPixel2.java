public int findBlackPixel(char[][] picture, int N) {
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
        rowStatus[i] = false;
        for (int j = 0; j < numColumns; j++) {
            if (picture[i][j] == 'B') {
                ++numBs;
            }
        }

        if (numBs == N) {
            rowStatus[i] = true;
        }
    }

    for (int i = 0; i < numColumns; i++) {
        int numBs = 0;
        colStatus[i] = false;
        for (int j = 0; j < numRows; j++) {
            if (picture[j][i] == 'B') {
                ++numBs;
            }
        }

        if (numBs == N) {
            colStatus[i] = true; 
        }
    }

    int result = 0;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numColumns; j++) {
            if (picture[i][j] == 'B' && rowStatus[i] && colStatus[j]) {

                boolean isSame = true;

                for (int m = 0; m < numRows; m++) {
                    if (picture[m][j] == 'B') {
                        for (int n = 0; n < numColumns; n++) {
                            if (picture[i][n] != picture[m][n]) {
                                isSame = false;
                                break;
                            }
                        }   
                    }
                    if(!isSame) {
                        break;
                    }
                }

                if (isSame) {
                    ++result;
                }
            }
        }
    }

    return result;
}
