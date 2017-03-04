public int islandPerimeter(int[][] grid) {
    int perimeter = 0;
    int numRows = grid.length;
    if(numRows <= 0) {
        return 0;
    }

    int numColumns = grid[0].length;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numColumns; j++) {
            // it is water -> continue
            if(grid[i][j] == 0) {
                continue;
            }

            // top row -> just add to perimeter
            if (i == 0) {
                ++perimeter;
            }

            // if we have top neighbor -> check
            if (i >= 1) {
                if (grid[i - 1][j] == 0) {
                    ++perimeter;
                }
            }

            // if we have bottom neighbor
            if (i < numRows - 1) {
                if (grid[i + 1][j] == 0) {
                    ++perimeter;
                }
            }

            // bottom row -> just add to perimeter
            if (i == numRows - 1) {
                ++perimeter;
            }

            // most left column -> just add to perimeter
            if (j == 0) {
                ++perimeter;
            }

            // if we have left neighbor
            if (j >= 1) {
                if (grid[i][j - 1] == 0) {
                    ++perimeter;
                }
            }

            // if we have right neighbor
            if (j < numColumns - 1) {
                if(grid[i][j + 1] == 0) {
                    ++perimeter;
                }
            }

            // most right column -> just add to perimeter
            if (j == numColumns - 1) {
                ++perimeter;
            }
        }
    }

    return perimeter;
}
