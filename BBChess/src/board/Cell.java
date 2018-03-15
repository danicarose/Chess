package board;

public class Cell {
	String position;
	String name; 
	boolean hasPiece;
	
	//cell constructor 
	public Cell(String name){
		hasPiece = false;
		//this.position = position;
		this.name = name;
	}
	

	
	public String toString(){
		return this.name;
	}
}
