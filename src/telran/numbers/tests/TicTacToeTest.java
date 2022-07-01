package telran.numbers.tests;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import telran.numbers.TicTacToeGame;


class TicTacToeTest {

	//matrix size
int Mat_i = 3;
int Mat_j = Mat_i;
char emptyMatrix[][] = new char[Mat_i][Mat_j];
	
@Test
void testEmptyMatrix() {
assertEquals(0, TicTacToeGame.tictactoeMove(emptyMatrix, 2, 2, 'x'));
}
@Test
	void testFullColumn() {
	
	char mWinColumn[][] = {
			{ 0, '0', 'x'},
			{'x', '0', '0'},
			{'x' , 0,  0 }
	};
	assertEquals(1, TicTacToeGame.tictactoeMove(mWinColumn, 0, 0, 'x'));
}
@Test
void testFullRow() {
	
	char mWinRow[][] = {
			{'x', '0', 'x'},
			{'0', '0',  0 },
			{'x' ,'x',  0 }
	};
	assertEquals(1, TicTacToeGame.tictactoeMove(mWinRow, 1, 2, '0'));
}
@Test
void testLeftDiag() {	
	char mWinLeftDiag[][] = {
			{'0', 'x', 0 },
			{'x' , 0, '0'},
			{ 0 , 'x','0'}
	};
	
	assertEquals(1, TicTacToeGame.tictactoeMove(mWinLeftDiag, 1, 1, '0'));
}
@Test
void testRightDiag() {
	char mWinRightDiag[][] = {
			{'0', '0',  0 },
			{'x', 'x', '0'},
			{'x' ,'x',  0 }
	};
assertEquals(1, TicTacToeGame.tictactoeMove(mWinRightDiag, 0, 2, 'x'));
}
@Test
void testGameDraw() {	
	char mDraw[][] = {
			{'0', '0', 'x'},
			{'x', 'x', '0'},
			{'0' ,'x',  0 }
	};
	
	assertEquals(3, TicTacToeGame.tictactoeMove(mDraw, 2, 2, 'x'));
	

	}

}