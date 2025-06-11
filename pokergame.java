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
		int intThing=1;
		String strGame="Y";
		String strName;
		String strCard;
		String strWin;
		while(strGame.equals("Y")){
			con.println("Poker game");
			con.println("Select option:");
			con.println("Play - 1");
			con.println("Leaderboard - 2");
			con.println("Rules - 3");
			con.println("Quit game - 4");
			con.println("");
			con.print("Selection: ");
			intChoice = con.readInt();
			if(intChoice == 1){
				con.clear();
				con.println("What's your name?");
				strName = con.readLine();		
				intWallet = 1000;
				strGame = "N";
				intThing = 1;
				intBet = -500;
				
				while(intThing == 1 && (intBet <= 0 || intBet > intWallet)){
					while(intBet <= 0 || intBet > intWallet){
						con.println("You have "+intWallet+" dollars "+strName+", enjoy your game!");
						con.println("");
						con.print("How much do you want to bet: ");
						intBet = con.readInt();
						if(intBet <= 0 || intBet > intWallet){
							con.println("Very funny, please try again");
							con.sleep(1000);
							con.clear();
						}
					}
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
					//E
					hand.close();
					//Card switcher tech
					con.print("\nHow many cards do you want to switch? ");
					intSelect1 = con.readInt();
					System.out.println(intSelect1);
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
					}else{
						con.println("I'm going to assume you just wanted to switch no cards");
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
					//Now for the logic calculations
					strWin = cards.winnings(intHand);
					con.println("\n"+strWin);
					if(strWin == "RF"){
						intBet = intBet*800;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a royal flush. You now have "+intWallet+" dollars");
					}else if(strWin == "SF"){
						intBet = intBet*50;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a straight flush. You now have "+intWallet+" dollars");
					}else if(strWin == "Q"){
						intBet = intBet*25;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a four of a kind. You now have "+intWallet+" dollars");
					}else if(strWin == "B"){
						intBet = intBet*9;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a full house. You now have "+intWallet+" dollars");
					}else if(strWin == "F"){
						intBet = intBet*6;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a flush. You now have "+intWallet+" dollars");
					}else if(strWin == "St"){
						intBet = intBet*4;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a straight. You now have "+intWallet+" dollars");
					}else if(strWin == "S"){
						intBet = intBet*3;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a straight. You now have "+intWallet+" dollars");
					}else if(strWin == "2P"){
						intBet = intBet*2;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got 2 pairs. You now have "+intWallet+" dollars!");
					}else if(strWin == "P"){
						intBet = intBet*1;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a pair of Jacks or higher.");
						con.println("You still have "+intWallet+" dollars!");
					}else if(strWin == "N"){
						intWallet = intWallet-intBet;
						con.println("How unfortunate "+strName+". You lost your bet. You now have "+intWallet+" dollars.");
					}
					con.println("\nPlay again - 1");
					con.println("Quit to main menu - 2");
					con.print("What would you like to do? Select the number next to the option you choose: ");
					intThing = con.readInt();
					strGame = "Y";
					while(intThing != 1 && intThing != 2){
						con.clear();
						con.println("You have "+intWallet+" dollars");
						con.println("\nPlay again - 1");
						con.println("Quit to main menu - 2");
						con.print("Please pick either option 1 or 2: ");
						intThing = con.readInt();
					}
					if(intThing == 1){
						con.clear();
					}else if(intThing == 2){
						con.clear();
						// Save to leaderboard
						TextOutputFile lead = new TextOutputFile("leadboard.txt", true);
						lead.println(strName);
						lead.println(intWallet);
						lead.close();
					}
				}
			}else if(intChoice == 2){
				//Leaderboard
				String strLeaderboard[][];
				int intLC=0;
				String strNameTemp;
				String strWalletTemp;
				con.clear();
				con.println("=== LEADERBOARD ===");
				strGame = "N";
				strLeaderboard = new String[100][2];
				TextInputFile board = new TextInputFile("leadboard.txt");
                while(board.eof() == false){
					strLeaderboard[intLC][0] = board.readLine();
					strLeaderboard[intLC][1] = board.readLine();
					intLC++;
				}

				
				for(intCount2 = 0; intCount2 < intLC - 1; intCount2++) {
                    for(intCount = 0; intCount < intLC - intCount2 - 1; intCount++) {
                        if(Integer.parseInt(strLeaderboard[intCount][1]) < Integer.parseInt(strLeaderboard[intCount + 1][1])){
                        strNameTemp = strLeaderboard[intCount][0];
						strLeaderboard[intCount][0] = strLeaderboard[intCount+1][0];
						strLeaderboard[intCount+1][0] = strNameTemp;
						strWalletTemp = strLeaderboard[intCount][1];
						strLeaderboard[intCount][1] = strLeaderboard[intCount+1][1];
						strLeaderboard[intCount+1][1] = strWalletTemp;
                        }
                    }
                }
                for (intCount = 0; intCount < intLC; intCount++){
                    con.println(strLeaderboard[intCount][0]+" | "+strLeaderboard[intCount][1]);
                }
                con.println("When you want to go back to the main menu, press \"y\"");
                while(con.getChar() != 'y'){
					System.out.println("MM Test");
				}
				
				strGame = "Y";
				con.clear();
				
			}
		}
	}
}
