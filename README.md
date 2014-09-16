chessbrain
==========

java chess program by the bootcamp guys
This is a chess program being developed by the bootcamp guys. we are just practicing our java skills. 


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
		
		
//			Pawn *****************************
//			Pawn can only move one step forward
//			except for the first time move, where it can choose to move two steps
//			Pawn capture when passing
//			pawn can be white or black
//			pawn can only capture one step cross to its cell except for pawn capture
//			option to create any other piece when pawn reaches next side
//			pawn can not move backwards
		
//			rook *****************************
//			rook can only move horizontal or vertical in straight line
//			rook can move forward or reverse, left or right  
//			rook can move up to 7 cells if not obstructed by another piece
//			rook can capture the first different colored piece in its way
//			rook can only castle with king when following conditions are met
//			1. rook or the king has not been moved before
//			2. there are no pieces of any color between rook and king
//			3. castle can only be with same colored rook and king
//			4. different colored piece is not attacking any cells between rook and king
//			5. different colored piece is not attacking the king
//			6. rook has to occupy a space two steps right or 3 steps left for castling
//			7. castling can only be done once
//			rook can occupy any colored cell

//		bishop*****************************
//		bishop can only move diagonally in the same line
//		bishop can move forward or reverse, left or right  
//		bishop can move up to 7 cells if not obstructed by another piece
//		bishop can capture the first different colored piece in its way
//		bishop can never castle with king 
//		bishop can never occupy a different colored cell from its original position
		
//		knight*****************************
//		knight can only move 2.5 steps
//		knight can move forward or reverse, left or right 
//		knight can jump through other pieces
//		knight can capture a different colored piece in its future position
//		knight can never castle with king 

//		queen *****************************
//		queen can move like a rook or a bishop but not at the same time
//		queen can not move like knight  
//		queen can move up to 7 cells if not obstructed by another piece
//		queen can capture the first different colored piece in its way
//		queen can not castle with king 
//		queen can occupy any colored cell
		
//		king *****************************
//		king can move like a queen but only 1 step
//		king can not move to a cell which is being attacked by a different colored piece
//		king can not move like knight  
//		king can capture the first different colored piece in its way
//		king can occupy any colored cell
//		king can only castle with rook, if following conditions are met
//		1. rook or the king has not been moved before
//		2. there are no pieces of any color between rook and king
//		3. castle can only be with same colored rook and king
//		4. different colored piece is not attacking any cells between rook and king
//		5. different colored piece is not attacking the king
//		6. king has to occupy a space two steps right or 2 steps left for castling, no more no less
//		7. castling can only be done once
		
//		chess rules - lower priorirty
//		winning
//		stale mate
//		check
//		Castling
//		at the initiation of the game queens will occupy same colored cells as them
//		there can not be more then 9 same colored queens on the board
//		there can not be more then 10 same colored rook, knight or bishop on the board
//		there can not be more then 8 same colored pawns on the board
