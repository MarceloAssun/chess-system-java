package application;


import chess.ChessMatch;

import boardgame.Board;
import boardgame.Position;


public class Program {

	public static void main(String[] args) {
		

		ChessMatch chessMatch  = new ChessMatch();
		UI.printBoard(chessMatch.getPieces());
		
		Board board = new Board(8, 8);

	}

}
