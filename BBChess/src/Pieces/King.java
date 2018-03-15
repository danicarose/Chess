package Pieces;

public class King extends Piece{

	public King(String pos, String color) {
		super(pos, color);
	}

	public boolean legalPath(int startFile, int startRank, int destFile, int destRank) {
		return false;
	}

	public Piece getPiece() {
		return this;
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
