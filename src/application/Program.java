package application;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		ChessMatch chessMactch = new ChessMatch();
		UI.printBoard(chessMactch.getPieces());
		

	}

}
