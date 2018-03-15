package board;

import board.Cell;
import java.lang.*;

import Pieces.Bishop;
import Pieces.King;
import Pieces.Knight;
import Pieces.Pawn;
import Pieces.Piece;
import Pieces.Queen;
import Pieces.Rook;

public class Board {
	public static Cell[][] board;
	
	//instantiated in Game class
	public Board(){
		board = new Cell[8][8];
		
		for (int y=0; y<8; y++) {
			for (int x=0; x<8; x++) {
				if ((x + y) % 2 == 1){
					board[x][y] = new Cell("##" + " ");
				}else{
					board[x][y] = new Cell("  " + " ");
				}
			}
		}
		instantiatePieces(board);
	}

	/* 
	 * Creates instances of pieces and places them on their specific cells when game is started (hard coded)
	 */
	public void instantiatePieces(Cell[][] b){
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){
				if(y==1){
					//get String value of position to pass into Piece constructor for pawns
					String pos = ((char)(x+97) + Integer.toString(8-y));
					//System.out.println(pos);
					//create black pawn pieces
					Piece bp = new Pawn(pos, "black");
					//place the pawn to the cell 
					b[x][y].name = "bp" + " ";	
				}else if(y==6){
					String pos = (Integer.toString(x) + Integer.toString(8-y));
					Piece wp = new Pawn(pos, "white");
					b[x][y].name = "wp" + " ";
				}
			}
			
			//Rooks
			Piece bR = new Rook("a8", "black");
			b[0][0].name = "bR" + " ";
			Piece bR2 = new Rook("h8", "black");
			b[7][0].name = "bR" + " ";
			
			Piece wR = new Rook("a1", "white");
			b[0][7].name = "wR" + " ";
			Piece wR2 = new Rook("h1", "white");
			b[7][7].name = "wR" + " ";
			
			//Knights
			Piece bN = new Knight("b8", "black");
			b[1][0].name = "bN" + " ";
			Piece bN2 = new Knight("g8", "black");
			b[6][0].name = "bN" + " ";
			
			Piece wN = new Knight("b1", "white");
			b[1][7].name = "wN" + " ";
			Piece wN2 = new Knight("g1", "white");
			b[6][7].name = "wN" + " ";
			
			//Bishops 
			Piece bB = new Bishop("c8", "black");
			b[2][0].name = "bB" + " ";
			Piece bB2 = new Bishop("f8", "black");
			b[5][0].name = "bB" + " ";
			
			Piece wB = new Bishop("c1", "white");
			b[2][7].name = "wB" + " ";
			Piece wB2 = new Bishop("f1", "white");
			b[5][7].name = "wB" + " ";
			
			//Queens
			Piece bQ = new Queen("d8", "black");
			b[3][0].name = "bQ" + " ";
			
			Piece wQ = new Queen("d1", "white");
			b[3][7].name = "wQ" + " ";
			
			//Kings
			Piece bK = new King("e8", "black");
			b[4][0].name = "bK" + " ";
			
			Piece wK = new King("e1", "white");
			b[4][7].name = "wK" + " ";
		}
	}
	
/*	public Cell getCell(String pos, Cell[][] c){
		int x = Character.getNumericValue(pos.charAt(0));
		int y = Character.getNumericValue(pos.charAt(1));
		
		return c[x][y];
	}*/

	public static void printBoard(Cell[][] board){
		for(int i=0; i<8; i++){
			for(int j=0; j<8; j++){
				System.out.print(board[j][i] + "");
			}
			System.out.println(8-i);
		}
		for(char x='a'; x<='h'; x++){
			System.out.print(" " + x + " ");
		}
		System.out.println("\n");
	}
	
	public void start(){
		printBoard(board);
	}
}
