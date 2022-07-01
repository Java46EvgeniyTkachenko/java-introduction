package telran.numbers;

public class TicTacToeGame {
/**
 * 
 * @param matrix square matrix (nRows == nColumns; where nRows >= 3)
 * @param nRow (number of row)
 * @param nCol (number of column)
 * @param symb (being filled symbol either 'x' or '0')
 * @return 0 - game isn't over; 1 - game is over with the winner's move; 3 - game is over with draw
 */
	public static int tictactoeMove(char matrix[][], int nRow, int nCol, char symb) {
		matrix[nRow][ nCol] = symb;
		if (TableFull(matrix)) return 3;
		if(FullRow(matrix, nRow, symb) || FullCol(matrix, nCol, symb)) return 1;
		if (LeftDiag(matrix, symb) || RightDiag(matrix, symb)) return 1;
		return 0;
	}
	private static boolean TableFull(char[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] != 'x' & matrix[i][j] != '0') {
					return false;
				}
			}
		}
		return true;
	}
	private static boolean RightDiag(char[][] matrix, char symb) {
			for (int i = 0, j = matrix.length - 1; i < matrix.length ; i++, j--) {
				if (matrix[i][j] != symb) {
					return false;
				}
			}
		return true;
	}

	private static boolean LeftDiag(char[][] matrix, char symb) {		
			for (int i = 0, j = 0; i < matrix.length & j < matrix.length; i++, j++) {
				if (matrix[i][j] != symb) {
					return false;
				}
			}
		
		return true;
		
	}
	
	private static boolean FullCol(char[][] matrix, int column, char symb) {
			for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][column] != symb) {
				return false;
			}
		}
		return true;
	}
	private static boolean FullRow(char[][] matrix, int row, char symb) {
			for (int j = 0; j < matrix.length; j++) {
			if (matrix[row][j] != symb) {
				return false;
			}
		}
		return true;
	}

}
