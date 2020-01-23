package test_place;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class TestesDiversos {
	public static void main(String[] args) {
//	
//		Position p = new Position(10, 10);
//		System.out.println(p);
//		
//		Board board = new Board(8, 10);
//		System.out.println(board);
	
		
		ChessMatch mt = new ChessMatch();
		UI.printBoard(mt.getPieces());
	
	
	}
	

}
