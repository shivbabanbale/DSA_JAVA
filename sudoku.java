public class sudoku {

    public static boolean issafe(int sudoku[][], int row, int column, int digit) {

        // for row
        for (int i = 0; i <= 8; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }

        }

        // for column
        for (int i = 0; i <= 8; i++) {
            if (sudoku[i][column] == digit) {
                return false;
            }
        }

        // for grid
        int sr = (row / 3) * 3;
        int sc = (column / 3) * 3;
        for (int i = sr; i < sr + 3; i++) {
            for (int j = sc; j < sc + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true;

    }

    public static boolean sudokuSolver(int sudoku[][], int row, int column) {

        if (row == 9) {
            return true;
        }

        int nextrow = row, nextcolumn = column + 1;
        if (column + 1 == 9) {
            nextrow = row + 1;
            nextcolumn = 0;
        }
        if (sudoku[row][column] != 0) {
            return (sudokuSolver(sudoku, nextrow, nextcolumn));
        }

        for (int digit = 1; digit <= 9; digit++) {
            if (issafe(sudoku, row, column, digit)) {
                sudoku[row][column] = digit;
                if (sudokuSolver(sudoku, nextrow, nextcolumn)) {
                    return true;
                }
                sudoku[row][column] = 0;
            }
        }
        return false;
    }

    public static void printer(int sudoku[][]) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String args[]) {
        int sudoku[][] = {
                { 0, 0, 8, 0, 0, 0, 0, 0, 0 },
                { 4, 9, 0, 1, 5, 7, 0, 0, 2 },
                { 0, 0, 3, 0, 0, 4, 1, 9, 0 },
                { 1, 8, 5, 0, 6, 0, 0, 2, 0 },
                { 0, 0, 0, 0, 2, 0, 0, 6, 0 },
                { 9, 6, 0, 4, 0, 5, 3, 0, 0 },
                { 0, 3, 0, 0, 7, 2, 0, 0, 4 },
                { 0, 4, 9, 0, 3, 0, 0, 5, 7 },
                { 8, 2, 7, 0, 0, 9, 0, 1, 3 }
        };
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution is exist ");
            printer(sudoku);
        } else {
            System.out.println("Solutin does not exist");
        }

    }
}
