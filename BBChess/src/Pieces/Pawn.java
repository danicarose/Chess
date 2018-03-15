package Pieces;

import board.Color;

public class Pawn extends Piece{
	public Pawn(String pos, Color color) {
		super(pos, color);
	}

	public Piece getPiece() {

		return this;
	}

	public boolean legalPath(int startFile, int startRank, int destFile, int destRank) {
		return false;
	}

	public int getFile() {

		return 0;
	}

	public int getRank() {

		return 0;
	}

	public void setFile() {

	}

	public void setRank() {

	}

}
