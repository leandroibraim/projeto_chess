package tabuleiro;

import javax.swing.border.Border;

public class Piece {

	protected Position position;
	private Border board;
	
	public Piece(Border board) {
		this.board = board;
		position = null;
	}
	
	protected Border getBoard() {
		return board;
	}

	
}
