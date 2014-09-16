import java.awt.Color;

public class ChessBrain 
{

	public static void main(String[] args) 
	{
		
		//***************Idea******************
		/*Have the board set as a int[][] array, white pieces on the board will be 1, black pieces -1
		 * empty spaces will be 0. The white king will be 2 and the black king will be -2 since you cant actually
		 * "capture" a king.
		 */
		//piecesClass properties
				//pieces move
				//possible moves of the selected piece should be highlighted
					//future cell can not be occupied with the same color piece
					//after the move, if the kind of opposite color is attached, send the check message
				//pieces capture or get captured
					// no piece can capture another piece of the same color
					// two pieces can not share one cell
					// residing piece is considered captured when other piece moves in to it space
					//when piece is captured it moves out of the board
					// no pieces can occupy a space outside of the board unless captured
				//pieces can not jump other pieces to move in to an existing space regardless of the color, except for the knight
				//pieces can occupy any colored cell except for bishops
				//pieces have to be inside a cell, can not occupy a space in between the cells
				//for pawn, king and rook first move needs to set a flag
				
				//!!!!!!!!!!!!!!!!!!!!!idea!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				// rooks movement is same as extended pawn horizontal and vertical
				// bishop's movement is same as pawn capturing piece from cross cell
				// knights movement is equivalent to one pawn move and pawn capture with or without capture
				//queen moves as a combination of rook and bishop
				// king moves same as queen but is limited to only one adjacent step
				
				//!!!!!!!!!!!!!!!!!!!!!observation!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
				//only 3 types of capture exist
				// 1. pawn capturing in cross cell
				// 2. different colored pieces blocking movement of current piece being captured
				// 3. passing pawn capture
		
		public static void highlightSpaces(Piece piece) //maybe polymorphism can be used so any sub class can use this
														//Have to play around with it, here is the gist of my idea though
		{
			boolean[][] spaces = piece.highlightSpaces(); //Returns spaces a piece can move
			
			for(int row = 0; row < 8; row++)
			{
				for(int col = 0; col < 8; col++)
				{
					if(spaces[row][col]) //If a piece can move to a spot it highlights it
						highlight(row, col);
				}
					
			}
		}
	}
	
	public abstract class Piece
	{
		//variable to hold color of the piece
		//True if white, false if black
		protected boolean pieceColor;
		//integer array that holds the 2 numbers that make up the position of the piece
		//position[0] is the row, position[1] is the column
		//protected int[] position = new int[2];
		
		protected int currentRow; //I think having these as separate values will make the programm more readable
		protected int currentCol;
		
		
		protected Piece(boolean color, int startRow, int startColumn)
		{
			pieceColor = color;
			currentRow = startRow;
			currentCol = startColumn;
		}
		//Get color of Piece
		public boolean getColor()
		{
			//return the color of the piece
			return pieceColor;
		}
		
		//Set color of Piece
		public void setColor(boolean flag)
		{
			//set color to the passed color
			pieceColor = flag;
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
		
		/**
		 * Checks to see if a specific spot is taken
		 * @param color True if color is white, false if black
		 * @param row Row that we are looking at
		 * @param col Column that we are looking at
		 * @param board A copy of the current board
		 * @return Will return 1 if piece of own color is in the way, -1 if piece of other color is in the way
		 * returns 0 if the space is empty, 2 if it is the opposite king
		 */
		public int spaceIsTaken(boolean color, int row,int col,int[][] board)
		{
			if(color)//If it is white
			{
				if(board[row][col] == 1 || board[row][col] == 2) //Own piece or own king
					return 1;
				else if(board[row][col] == -1)//If opposite color piece is in the way
					return -1;
				else if(board[row][col] == -2)//If opposite king is in the way
					return 2;
				else			//If space is empty
					return 0;
			}
			else //If the piece is black
			{
				if(board[row][col] == -1 || board[row][col] == -2)//Black piece in the way
					return 1;
				else if(board[row][col] == 1)//White piece in the way
					return 1;
				else if(board[row][col] == 2)//White king in the way
					return 2;
				else //Space is empty
					return 0;
			}
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
		
		private int spacesMoved; //Count the number of spaces for castling
		
		//constructor for the rook class
		public Rook(boolean color, int startRow, int startColumn)
		{
			super(color, startRow, startColumn);
		}
		
		//Retuns spaces true if they should be highlighted
		public boolean[][] highlightSpaces(int[][] board)
		{
			boolean[][] spaces = new boolean[8][8];
			
			int i = 1;
			
			//If moving up the board
			while(currentRow + i <= 8)
			{
				int taken = spaceIsTaken(pieceColor, currentRow + i, currentCol, board);
				//spaceIsTaken is a method that will return 1 if the space is occupied by a piece of the same color
				//-1 if a piece of the opposite color occupies it, or 0 if it is empty
				
				if( taken == 1)//If same color is blocking the way
				{
					break;
				}
				else if(taken == -1) //Can capture but go no further
				{
					spaces[currentRow + i][currentCol] = true;
					break;
				}
				else if(taken == 2)
				{
					//putKingInCheck();
					//Method for putting the king in check
				}
				else //space is empty
					spaces[currentRow + i][currentCol] = true;
				
				i++;
			}
			
			i = 1;//reset the counter
			
			//If moving down the board
			while(currentRow + -i >= 0)
			{
				int taken = spaceIsTaken(pieceColor, currentRow - i, currentCol, board);
				if( taken == 1)
				{
					break;
				}
				else if(taken == -1)
				{
					spaces[currentRow - i][currentCol] = true;
					break;
				}
				else
					spaces[currentRow - i][currentCol] = true;
				
				i++;
			}
			
			i = 1;
			
			//if moving to the higher numbered columns
			while(currentCol + i <= 8)
			{
				int taken = spaceIsTaken(pieceColor, currentRow, currentCol + i, board);
				
				if(taken == 1)
				{
					break;
				}
				else if(taken == -1)
				{
					spaces[currentRow][currentCol + i] = true;
					break;
				}
				else
					spaces[currentRow][currentCol + i] = true;
				
				i++;
			}
			
			i = 1;
			
			//If moving to lower numbered columns
			while(currentCol - i >= 0)
			{
				int taken = spaceIsTaken(pieceColor, currentRow, currentCol - i, board);
				
				if(taken == 1)
				{
					break;
				}
				else if(taken == -1)
				{
					spaces[currentRow][currentCol - i] = true;
					break;
				}
				else
					spaces[currentRow][currentCol - i] = true;
				
				i++;
			}
			
		}
		
		//To get spaces moved for castling
		public int getSpacesMoved()
		{
			return spacesMoved;
		}
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
		//Functionality for castling with the rook should be located in this class
		//Just set the row and column for the rook manually
	}

	
}
