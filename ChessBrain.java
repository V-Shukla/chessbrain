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
		
	}
	
	public class Pawn extends Piece
	{
		//rules for Pawn
		//moves one space forward
		//attacks diagonially
		//can move 2 spaces on first move
		//can attack en passant
		//when it makes it to the opposite side of the board it may be exchanged for another piece
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
