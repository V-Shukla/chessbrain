import java.awt.Color;

public class ChessBrain 
{

	public static void main(String[] args) 
	{

	}
	
	public abstract class Piece
	{
		//variable to hold color of the piece
		String pieceColor;
		//integer array that holds the 2 numbers that make up the position of the piece
		int[] position = new int[2];
		
		//Get color of Piece
		public String getColor()
		{
			//return the color of the piece
			return pieceColor;
		}
		
		//Set color of Piece
		public void setColor(String c)
		{
			//set color to the passed color
			pieceColor = c;
		}
		
		//Get position of Piece in [1, 2] format
		public int[] getPosition()
		{
			//return the position of the piece
			return position;
		}
		
		//Set position of Piece in [1, 2] format
		public void setPosition(int[] p)
		{
			//set the horizontal value to the first passed value
			position[0] = p[0];
			//set vertical value as the second passed value
			position[1] = p[1];
		}
		
// 		this will get the appropriate color of cell. 		
//		cellAdd = row+column;
//		
//		if ( (cellAdd mod 2) == 0)
//
//		{
//		    isEven = true
//		}
//
//		else
//
//		{
//		    isEven = false
//		}
		
	}
	
	public class Pawn extends Piece
	{
		//rules for Pawn2
		//select of an appropriate color for the current
		//pawn position is known by selection of the pawn
		int[][] currentPosition = cell[row][column];

//		pawn can be white or black, pawn color is obtained from brain class

//		Pawn can only move one step forward
//		except for the first time move, where it can choose to move two steps
		
		int i=1; //keep track of number of cells to be highlighted
		int[][] highlight; 
		int[][] highlightCell = 0;//keeps track of number of cells to be highlighted
		
			//if the color is white and row is 2, pawn is at initial position
			if (moveColor==true || row == 2) {	
				highlight[i][i] = cell[row+1][column]; 
				i++;
				highlight[i][i] = cell[row+2][column];
				i++;
	
			}
			//if the color is black and row is 7, pawn is at initial position
			else if (moveColor==false || row == 7){ 
				highlight[i][i] = cell[row+1][column];
				i++;
				highlight[i][i] = cell[row+2][column];
				i++;
				
			}
			
			//if pawn is not at initial position can not move more then one step
			else{
				highlight[i][i] = cell[row+1][column]; 
				i++;
			}
			

//		pawn can only capture one step cross to its cell except for 
//		option to create any other piece when pawn reaches next side
//		pawn can not move backwards
//			en passant Pawn capture when passing
		

	}
	
	public class Rook extends Piece
	{
		//rules for Rook
		//moves vertically any number of places
		//moves horizontally any number of places
		//may castle with the King
	}
	
	public class Knight extends Piece
	{
		//rules for Knight
		//moves 2 squares horizontally and 1 square vertically
		//or moves 1 square horizontally and 2 square vertically
		//It can jump pieces
	}
	
	public class Bishop extends Piece
	{
		//rules for Bishop
		//moves diagonally in any direction any number of spaces
	}
	
	public class Queen extends Piece
	{
		//rules for Queen
		//moves any number of spaces in any direction
	}
	
	public class King extends Piece
	{
		//rules for King
		//can move any 1 space in any direction
		//may castle with the rook
	}

	
}
