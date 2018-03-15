package Pieces;

public class Knight extends Piece{
	public Knight(String pos, String color) {
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
