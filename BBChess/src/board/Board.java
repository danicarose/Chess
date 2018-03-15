package board;

import board.Cell;
import java.lang.*;

public class Board {
	public static Cell[][] board;
	
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
		instantiatePieces();
	}
	
	public Cell getCell(String pos, Cell[][] c){
		int x = Character.getNumericValue(pos.charAt(0));
		int y = Character.getNumericValue(pos.charAt(1));
		
		return c[x][y];
	}
	
	public void instantiatePieces(){
		for(int y=0; y<8; y++){
			for(int x=0; x<8; x++){
				if(y==1){
					
				}
				
					
				
			}
		}
	}
	
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
