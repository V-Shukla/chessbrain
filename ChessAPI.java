package v_chess;

public class ChessAPI {
// this class will communicate between the front end and back end
// it will take as input the : from_position and to_position
// long term it will output : move_complete or error
//show waiting to consumer (front end ui
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(attemptMove("A1","B1"));
	}
//For reference here is the game
	//[a-h][1-8]
	
	//A1 B1 C1 D1 E1 F1 G1 H1
	//A3 B2 C2 D2 E2 F2 G2 H2
	//A3 B3 C3 D3 E3 F3 G3 H3
	//A4 B4 C4 D4 E4 F4 G4 H4
	//A5 B5 C5 D5 E5 F5 G5 H5
	//A6 B6 C6 D6 E6 F6 G6 H6
	//A7 B7 C7 D7 E7 F7 G7 H7
	//A8 B8 C8 D8 E8 F8 G8 H8
	
	public static boolean attemptMove (String fromMove, String toMove){
		//0== error
		//1== move complete
		boolean outputBoolean = true;
		
		//things we need to check for on use of our API
		//string length != 2, then fail
		//if either one is broken, is broken
		if(fromMove.length() != 2 || toMove.length() != 2)
			//then do this stuff in these curly brackets
		{
			return false;
		}
		//check to see if moves are even possible
		
	return outputBoolean;
	}
	
	
}
