package Pieces;

import board.Color;

public abstract class Piece {

	public String pos;
	public Color color;
	
	
	public Piece(String pos, Color color) {
		this.pos = pos;
		this.color=color;
	}
	
	public abstract boolean legalPath(int startFile, int startRank, int destFile, int destRank);
	
	public abstract Piece getPiece();
	
	public abstract int getFile();
	
	public abstract int getRank();
	
	public abstract void setFile();
	
	public abstract void setRank();

}
