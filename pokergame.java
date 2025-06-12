//-------------------------------------------------------------------------
// Name: Trevor Lee
// Program: Poker
// Last Modified: June 12, 2025
// Version Number: 10
//-------------------------------------------------------------------------

import arc.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.awt.Color.*;

public class pokergame{
	public static void main(String[] args){
		Console con = new Console("Poker Game", 1280, 720);
		BufferedImage imgPoker = con.loadImage("pokerimg.jpg");
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
			con.drawImage(imgPoker, 0, 0);
			
			for(intCount = 0; intCount < 10; intCount++){
				con.println("");
			}
			con.println("    Select option:");
			con.println("    Play - 1");
			con.println("    Leaderboard - 2");
			con.println("    Rules - 3");
			con.println("    Quit game - 4");
			con.print("    Selection: ");
			intChoice = con.readInt();
			if(intChoice == 1){
				con.clear();
				
				con.setBackgroundColor(Color.BLACK);
				
				
				con.println("What's your name?");
				strName = con.readLine();
				//Cheat code "statitan"
				if(strName.equalsIgnoreCase("statitan")){
					con.println("");
					con.println("Ahh, a distinguished VIP!");
					con.sleep(1000);
					con.println("You get 10 times more money to start than everyone else.");
					con.sleep(2000);
					intWallet = 10000;
				}else{		
					intWallet = 1000;
				}
				strGame = "N";
				intThing = 1;
				intBet = -500;
				
				while(intThing == 1 && (intBet <= 0 || intBet > intWallet)&&strGame == "N"){
					while(intBet <= 0 && (intBet < intWallet || intWallet != 0)){
						con.clear();
						con.println("You have "+intWallet+" dollars "+strName+", enjoy your game!");
						con.println("");
						con.print("How much do you want to bet: ");
						intBet = con.readInt();
						if(intWallet <= 0){
							con.println("Unfortunately you're out of money, better luck next time!");
							con.sleep(1000);
							intThing = 2;
							strGame = "Y";
							con.clear();
							System.out.println("No money");
							TextOutputFile board = new TextOutputFile("leadboard.txt", true);
							board.println(strName);
							board.println(intWallet);
							board.close();
							break;
						}else if(intBet <= 0 || intBet > intWallet){
							con.println("Very funny, please try again");
							con.sleep(1000);
							con.clear();
							intBet = -500;
							System.out.println("Bad Bet");
						}
					}
					if(strGame == "Y"){
						break;
					}
					//Main game
					con.clear();
					con.println("Your bet is: "+intBet+" dollars");
					intWallet = intWallet - intBet;
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
					con.sleep(1000);
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
					System.out.println(strWin);
					con.println("");
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
						con.println("Congratulations, "+strName+"! You got a three of a kind. You now have "+intWallet+" dollars");
					}else if(strWin == "2P"){
						intBet = intBet*2;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got 2 pairs. You now have "+intWallet+" dollars");
					}else if(strWin == "P"){
						intBet = intBet*1;
						intWallet = intWallet+intBet;
						con.println("Congratulations, "+strName+"! You got a pair of Jacks or higher");
						con.println("You still have "+intWallet+" dollars");
					}else if(strWin == "N"){
						con.println("How unfortunate "+strName+". You lost your bet. You now have "+intWallet+" dollars");
					}
					con.println("\nPlay again - 1");
					con.println("Quit to main menu - 2");
					con.print("What would you like to do? Select the number next to the option you choose: ");
					intThing = con.readInt();
					while(intThing != 1 && intThing != 2){
						con.clear();
						con.println("You have "+intWallet+" dollars");
						con.println("\nPlay again - 1");
						con.println("Quit to main menu - 2");
						con.print("Please pick either option 1 or 2: ");
						intThing = con.readInt();
					}
					if(intThing == 1){
						intBet = -500;
						con.clear();
						strGame = "N";
					}else if(intThing == 2){
						strGame = "Y";
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
				String strReader;
				int intCounter=0;
				String strNameTemp;
				String strWalletTemp;
				con.clear();
				con.setBackgroundColor(Color.BLACK);
				con.println("==Leaderboard==");
				strGame = "N";
				TextInputFile boar = new TextInputFile("leadboard.txt");
				while(boar.eof() == false){
					strReader = boar.readLine();
					strReader = boar.readLine();
					intCounter++;
					System.out.println("TEST: " +intCounter);
				}
				System.out.println(intCounter);
				boar.close();
				strLeaderboard = new String[intCounter][2];
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
                for(intCount = 0; intCount < intLC; intCount++){
                    con.println(strLeaderboard[intCount][0]+" | "+strLeaderboard[intCount][1]);
                }
                con.println("When you want to go back to the main menu, press \"y\"");
                while(con.getChar() != 'y'){
					System.out.println("Key press");
				}
				strGame = "Y";
				con.clear();
			}else if(intChoice == 3){
				//Rules
				con.clear();
				con.setBackgroundColor(Color.BLACK);
				con.println("Here's how to play video poker:");
				con.println("You tell me your name and I'll give you some money");
				con.println("You will be allowed to choose how much you want to bet");
				con.println("Once your bet is locked in, I'll give you 5 cards");
				con.println("You get to choose how many cards you want to switch");
				con.println("You could switch none of your cards, 1 of them, or all of them! The choice is yours");
				con.println("After choosing, your final hand will be analyzed");
				con.println("If you get a pair of Jacks or higher, you win!");
				con.println("Anything less and you lose your bet");
				con.println("\nHere are the winnings you could earn:");
				con.println("Royal Flush - 800x your bet");
				con.println("Straight Flush - 50x your bet");
				con.println("Four Of A Kind - 25x your bet");
				con.println("Full House - 9x your bet");
				con.println("Flush - 6x your bet");
				con.println("Straight - 4x your bet");
				con.println("Three Of A Kind - 3x your bet");
				con.println("Two Pairs - 2x your bet");
				con.println("A pair of Jacks or Higher - 1x your bet");
				con.println("\n\nWhen you want to go back to the main menu, press \"y\"");
                while(con.getChar() != 'y'){
					System.out.println("Key press");
				}
				strGame = "Y";
				con.clear();
			}else if(intChoice == 4){
				//Quit game
                con.closeConsole();
            }else if(intChoice == 69 || intChoice == 420){
				//Secret menu
				con.clear();
				con.setBackgroundColor(Color.BLACK);
				con.println("Congrats on finding the secret menu!");
				con.println("As your reward, here's a funny joke:");
				con.println("\nWhy do programmers perfer dark mode?");
				con.sleep(3000);
				con.println("\nBecause the light attracts bugs!");
				con.println("\n\nWhen you want to go back to the main menu, press \"y\"");
                while(con.getChar() != 'y'){
					System.out.println("Key press");
				}
				strGame = "Y";
				con.clear();
            }else if(intChoice == 2911){
				//Quick leaderboard clear - developer easter egg
				con.clear();
				TextOutputFile leaderboard = new TextOutputFile("leadboard.txt");
				leaderboard.close();
				System.out.println("Leaderboard cleared");
			}else{
				con.clear();
			}
		}
	}
}
