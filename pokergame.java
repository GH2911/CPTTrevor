import arc.*;
public class pokergame{
	public static void main(String[] args){
		Console con = new Console();
		int intChoice;
		int intNum;
		int intWallet;
		int intBet;
		int intCount;
		int intCount2;
		int intSelect1;
		int intSelect2;
		int intSelect3;
		int intSelect4;
		int intSelect5;
		int intSelect6;
		String strName;
		String strCard;
		con.println("Poker game");
		con.println("Select option:");
		con.println("Play - 1");
		con.println("Leaderboard - 2");
		con.println("Quit game - 3");
		con.println("");
		con.print("Selection: ");
		intChoice = con.readInt();
		if(intChoice == 1){
			con.clear();
			con.println("What's your name?");
			strName = con.readLine();
			con.println("Here's your starting 1000 dollars "+strName+", enjoy your game!");
			intWallet = 1000;
			con.print("\nHow much do you want to bet: ");
			intBet = con.readInt();
			con.clear();
			con.println("Your bet is: "+intBet+" dollars");
			//Return the full thing, hand and reserve cards
			int intAll[][];
			intAll = new int[10][2];
			intAll = cards.card();
			//Separate hand and reserve
			int intHand[][];
			intHand = new int[5][2];
			for(intCount = 0; intCount<5; intCount++){
				intHand[intCount][0] = intAll[intCount][0];
				intHand[intCount][1] = intAll[intCount][1];
			}
			con.println("");
			//Code separate arrays
			int intReserve[][];
			intReserve = new int[5][2];
			for(intCount = 0; intCount < 5; intCount++){
				intReserve[intCount][0] = intAll[intCount+5][0];
				intReserve[intCount][1] = intAll[intCount+5][1];
			}
			con.println("Your cards are: ");
			TextInputFile hand = new TextInputFile("hand.txt");
			for(intNum = 0; intNum < 5; intNum++){
				strCard = hand.readLine();
				con.println(strCard);
			}
			//Card switcher tech
			con.print("\nHow many cards do you want to switch? ");
			intSelect1 = con.readInt();
			if(intSelect1 == 0){
				con.println("\nAs you wish, this is your final hand.");
			}else if(intSelect1 == 1){
				con.print("\nWhich card do you want to switch? Please select the number: ");
				intSelect2 = con.readInt();
				intSelect2 = intSelect2-1;
				intHand[intSelect2][0] = intReserve[intSelect2][0];
				intHand[intSelect2][1] = intReserve[intSelect2][1];
			}else if(intSelect1 == 2){
				con.println("\nWhich cards do you want to switch? Please select the number: ");
				intSelect2 = con.readInt();
				intSelect3 = con.readInt();
				intHand[intSelect2-1][0] = intReserve[intSelect2-1][0];
				intHand[intSelect2-1][1] = intReserve[intSelect2-1][1];
				intHand[intSelect3-1][0] = intReserve[intSelect3-1][0];
				intHand[intSelect3-1][1] = intReserve[intSelect3-1][1];
			}else if(intSelect1 == 3){
				con.println("\nWhich cards do you want to switch? Please select the number: ");
				intSelect2 = con.readInt();
				intSelect3 = con.readInt();
				intSelect4 = con.readInt();
				intHand[intSelect2-1][0] = intReserve[intSelect2-1][0];
				intHand[intSelect2-1][1] = intReserve[intSelect2-1][1];
				intHand[intSelect3-1][0] = intReserve[intSelect3-1][0];
				intHand[intSelect3-1][1] = intReserve[intSelect3-1][1];
				intHand[intSelect4-1][0] = intReserve[intSelect4-1][0];
				intHand[intSelect4-1][1] = intReserve[intSelect4-1][1];
			}else if(intSelect1 == 4){
				con.println("\nWhich cards do you want to switch? Please select the number: ");
				intSelect2 = con.readInt();
				intSelect3 = con.readInt();
				intSelect4 = con.readInt();
				intSelect5 = con.readInt();
				intHand[intSelect2-1][0] = intReserve[intSelect2-1][0];
				intHand[intSelect2-1][1] = intReserve[intSelect2-1][1];
				intHand[intSelect3-1][0] = intReserve[intSelect3-1][0];
				intHand[intSelect3-1][1] = intReserve[intSelect3-1][1];
				intHand[intSelect4-1][0] = intReserve[intSelect4-1][0];
				intHand[intSelect4-1][1] = intReserve[intSelect4-1][1];
				intHand[intSelect5-1][0] = intReserve[intSelect5-1][0];
				intHand[intSelect5-1][1] = intReserve[intSelect5-1][1];
			}else if(intSelect1 == 5){
				con.println("\nAll cards switched");
				intHand[0][0] = intReserve[0][0];
				intHand[0][1] = intReserve[0][1];
				intHand[1][0] = intReserve[1][0];
				intHand[1][1] = intReserve[1][1];
				intHand[2][0] = intReserve[2][0];
				intHand[2][1] = intReserve[2][1];
				intHand[3][0] = intReserve[3][0];
				intHand[3][1] = intReserve[3][1];
				intHand[4][0] = intReserve[4][0];
				intHand[4][1] = intReserve[4][1];
			}
			//Clear screen to make it cleaner
			con.clear();
			con.println("Your bet is: "+intBet+" dollars");
			con.println("\nYour final hand is: ");
			//Reorder the cards, give new names
			String strCards = "";
			String strSuit = "";
			for(intCount = 0; intCount < 5; intCount++){
				if(intHand[intCount][0] == 1){
					strCards = "Ace";
				}else if(intHand[intCount][0] == 2){
					strCards = "Two";
				}else if(intHand[intCount][0] == 3){
					strCards = "Three";
				}else if(intHand[intCount][0] == 4){
					strCards = "Four";
				}else if(intHand[intCount][0] == 5){
					strCards = "Five";
				}else if(intHand[intCount][0] == 6){
					strCards = "Six";
				}else if(intHand[intCount][0] == 7){
					strCards = "Seven";
				}else if(intHand[intCount][0] == 8){
					strCards = "Eight";
				}else if(intHand[intCount][0] == 9){
					strCards = "Nine";
				}else if(intHand[intCount][0] == 10){
					strCards = "Ten";
				}else if(intHand[intCount][0] == 11){
					strCards = "Jack";
				}else if(intHand[intCount][0] == 12){
					strCards = "Queen";
				}else if(intHand[intCount][0] == 13){
					strCards = "King";
				}
				if(intHand[intCount][1] == 1){
					strSuit = "Diamonds";
				}else if(intHand[intCount][1] == 2){
					strSuit = "Clubs";
				}else if(intHand[intCount][1] == 3){
					strSuit = "Hearts";
				}else if(intHand[intCount][1] == 4){
					strSuit = "Spades";
				}
			con.println(strCards+" of "+strSuit);
			}
			for(intCount = 0; intCount < 5; intCount++){
				con.println(intHand[intCount][0]+" - "+intHand[intCount][1]);
			}
		}
	}
}
