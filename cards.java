import arc.*;
public class cards{
	public static int[][] card(){
		int intCards[][];
		intCards = new int[52][3];
		
		int intValue;
		int intCount;
		int intSuit = 1;
		int intRandom;
		
		
		for(intCount = 0; intCount <= 3; intCount++){
			for(intValue = 1; intValue <= 13; intValue++){
				intCards[intValue - 1 + intCount * 13][0] = intValue;
				intCards[intValue - 1 + intCount * 13][1] = intSuit;
				intRandom = (int)(Math.random() * 100 + 1);
				intCards[intValue - 1 + intCount * 13][2] = intRandom;
			}
			intSuit += 1;
		}
		
		//Bubble Sorter
		int intCount2;
		int intCardTemp;
		int intSuitTemp;
		int intRandTemp;
		for(intCount2 = 0; intCount2 < 52-1; intCount2++){
			for(intCount = 0; intCount < 52-1; intCount++){
				if((intCards[intCount][2]) > (intCards[intCount+1][2])){
					intCardTemp = intCards[intCount][0];
					intCards[intCount][0] = intCards[intCount+1][0];
					intCards[intCount+1][0] = intCardTemp;
					intSuitTemp = intCards[intCount][1];
					intCards[intCount][1] = intCards[intCount+1][1];
					intCards[intCount+1][1] = intSuitTemp;
					intRandTemp = intCards[intCount][2];
					intCards[intCount][2] = intCards[intCount+1][2];
					intCards[intCount+1][2] = intRandTemp;
				}
			}
		}
		TextOutputFile hand = new TextOutputFile("hand.txt");
		String strCard = "";
		String strSuit = "";
		for(intCount = 0; intCount < 10; intCount++){
			if(intCards[intCount][0] == 1){
				strCard = "Ace";
			}else if(intCards[intCount][0] == 2){
				strCard = "Two";
			}else if(intCards[intCount][0] == 3){
				strCard = "Three";
			}else if(intCards[intCount][0] == 4){
				strCard = "Four";
			}else if(intCards[intCount][0] == 5){
				strCard = "Five";
			}else if(intCards[intCount][0] == 6){
				strCard = "Six";
			}else if(intCards[intCount][0] == 7){
				strCard = "Seven";
			}else if(intCards[intCount][0] == 8){
				strCard = "Eight";
			}else if(intCards[intCount][0] == 9){
				strCard = "Nine";
			}else if(intCards[intCount][0] == 10){
				strCard = "Ten";
			}else if(intCards[intCount][0] == 11){
				strCard = "Jack";
			}else if(intCards[intCount][0] == 12){
				strCard = "Queen";
			}else if(intCards[intCount][0] == 13){
				strCard = "King";
			}
			if(intCards[intCount][1] == 1){
				strSuit = "Diamonds";
			}else if(intCards[intCount][1] == 2){
				strSuit = "Clubs";
			}else if(intCards[intCount][1] == 3){
				strSuit = "Hearts";
			}else if(intCards[intCount][1] == 4){
				strSuit = "Spades";
			}
			hand.println(strCard+" of "+strSuit+" - "+(intCount+1));
		}
		int intFull[][];
		intFull = new int[10][2];
		for(intCount2 = 0; intCount2<10; intCount2++){
			intFull[intCount2][0] = intCards[intCount2][0];
			intFull[intCount2][1] = intCards[intCount2][1];
		}
		return intFull;								
	}
	//The hand calculations
	public static String winnings(int Array[][]){
		String strWin="";
		int intMath;
		int intFinal[][];
		int intCount;
		int intAce=0;
		int intTwo=0;
		int intThree=0;
		int intFour=0;
		int intFive=0;
		int intSix=0;
		int intSeven=0;
		int intEight=0;
		int intNine=0;
		int intTen=0;
		int intJack=0;
		int intQueen=0;
		int intKing=0;
		int intNum=0;
		boolean blnRFlush=false;
		boolean blnSFlush=false;
		boolean blnQuad=false;
		boolean blnBoat=false;
		boolean blnFlush=false;
		boolean blnStraight=false;
		boolean blnSet=false;
		boolean bln2Pair=false;
		boolean blnPair=false;
		boolean blnNth=false;
		boolean blnBroad=false;
		intFinal = new int[5][2];
		for(intCount = 0; intCount < 5; intCount++){
			intFinal[intCount][0] = Array[intCount][0];
			intFinal[intCount][1] = Array[intCount][1];
		}
		for(intCount = 0; intCount < 5; intCount++){
			if(intFinal[intCount][0] == 1){
				intAce = intAce+1;
			}else if(intFinal[intCount][0] == 2){
				intTwo = intTwo+1;
			}else if(intFinal[intCount][0] == 3){
				intThree = intThree+1;
			}else if(intFinal[intCount][0] == 4){
				intFour = intFour+1;
			}else if(intFinal[intCount][0] == 5){
				intFive = intFive+1;
			}else if(intFinal[intCount][0] == 6){
				intSix = intSix+1;
			}else if(intFinal[intCount][0] == 7){
				intSeven = intSeven+1;
			}else if(intFinal[intCount][0] == 8){
				intEight = intEight+1;
			}else if(intFinal[intCount][0] == 9){
				intNine = intNine+1;
			}else if(intFinal[intCount][0] == 10){
				intTen = intTen+1;
			}else if(intFinal[intCount][0] == 11){
				intJack = intJack+1;
			}else if(intFinal[intCount][0] == 12){
				intQueen = intQueen+1;
			}else if(intFinal[intCount][0] == 13){
				intKing = intKing+1;
			}
		}
		if(intAce == 4 || intTwo == 4 || intThree == 4 || intFour == 4 || intFive == 4 || intSix == 4 || intSeven == 4 || intEight == 4 || intNine == 4 || intTen == 4 || intJack == 4 || intQueen == 4 || intKing == 4){
			blnQuad = true;
		}else if(intAce == 3 || intTwo == 3 || intThree == 3 || intFour == 3 || intFive == 3 || intSix == 3 || intSeven == 3 || intEight == 3 || intNine == 3 || intTen == 3 || intJack == 3 || intQueen == 3 || intKing == 3){
			intAce = intAce-3;
			intTwo = intTwo-3;
			intThree = intThree-3;
			intFour = intFour-3;
			intFive = intFive-3;
			intSix = intSix-3;
			intSeven = intSeven-3;
			intEight = intEight-3;
			intNine = intNine-3;
			intTen = intTen-3;
			intJack = intJack-3;
			intQueen = intQueen-3;
			intKing = intKing-3;
			if(intAce == -1 || intTwo == -1 || intThree == -1 || intFour == -1 || intFive == -1 || intSix == -1 || intSeven == -1 || intEight == -1 || intNine == -1 || intTen == -1 || intJack == -1 || intQueen == -1 || intKing == -1){
				blnBoat = true;
			}else{
				blnSet = true;
			}
		}else if(intAce == 2 || intTwo == 2 || intThree == 2 || intFour == 2 || intFive == 2 || intSix == 2 || intSeven == 2 || intEight == 2 || intNine == 2 || intTen == 2 || intJack == 2 || intQueen == 2 || intKing == 2){
			intAce = intAce-2;
			intTwo = intTwo-2;
			intThree = intThree-2;
			intFour = intFour-2;
			intFive = intFive-2;
			intSix = intSix-2;
			intSeven = intSeven-2;
			intEight = intEight-2;
			intNine = intNine-2;
			intTen = intTen-2;
			intJack = intJack-2;
			intQueen = intQueen-2;
			intKing = intKing-2;
			
			if(intAce == 0){
				intNum = intNum+1;
			}
			if(intTwo == 0){
				intNum = intNum+1;
			}
			if(intThree == 0){
				intNum = intNum+1;
			}
			if(intFour == 0){
				intNum = intNum+1;
			}
			if(intFive == 0){
				intNum = intNum+1;
			}
			if(intSix == 0){
				intNum = intNum+1;
			}
			if(intSeven == 0){
				intNum = intNum+1;
			}
			if(intEight == 0){
				intNum = intNum+1;
			}
			if(intNine == 0){
				intNum = intNum+1;
			}
			if(intTen == 0){
				intNum = intNum+1;
			}
			if(intJack == 0){
				intNum = intNum+1;
			}
			if(intQueen == 0){
				intNum = intNum+1;
			}
			if(intKing == 0){
				intNum = intNum+1;
			}
			
			if(intNum == 2){
				bln2Pair = true;
			}else if(intNum == 1){
				if(intJack == 0 || intQueen == 0 || intKing == 0 || intAce == 0){
					blnPair = true;
				}else{
					blnPair = false;
				}
			}
		}else{
			blnNth = true;
		}
		if(intFinal[0][1] == intFinal[1][1] && intFinal[0][1] == intFinal[2][1] && intFinal[0][1] == intFinal[3][1] && intFinal[0][1] == intFinal[4][1]){
			blnFlush = true;
		}else{
			blnFlush = false;
		}
		//Resort cards for straight
		int intCount2;
		int intCardTemp;
		int intSuitTemp;
		int intRandTemp;
		for(intCount2 = 0; intCount2 < 5-1; intCount2++){
			for(intCount = 0; intCount < 5-1; intCount++){
				if((intFinal[intCount][0]) > (intFinal[intCount+1][0])){
					intCardTemp = intFinal[intCount][0];
					intFinal[intCount][0] = intFinal[intCount+1][0];
					intFinal[intCount+1][0] = intCardTemp;
					intSuitTemp = intFinal[intCount][1];
					intFinal[intCount][1] = intFinal[intCount+1][1];
					intFinal[intCount+1][1] = intSuitTemp;
				}
			}
		}
		intMath = intFinal[4][0] - intFinal[0][0];
		if(intMath == 4){
			blnStraight = true;
		}else if(intFinal[0][0] == 1 && intFinal[1][0] == 10 && intFinal[2][0] == 11 && intFinal[3][0] == 12 && intFinal[4][0] == 13){
			blnBroad = true;
		}
		if(blnFlush == true && blnBroad == true){
			blnRFlush = true;
		}else if(blnFlush == true && blnStraight == true){
			blnSFlush = true;
		}
		if(blnRFlush == true){
			strWin = "RF";
		}else if(blnSFlush == true){
			strWin = "SF";
		}else if(blnQuad == true){
			strWin = "Q";
		}else if(blnBoat == true){
			strWin = "B";
		}else if(blnFlush == true){
			strWin = "F";
		}else if(blnStraight == true || blnBroad == true){
			strWin = "St";
		}else if(blnSet == true){
			strWin = "S";
		}else if(bln2Pair == true){
			strWin = "2P";
		}else if(blnPair == true){
			strWin = "P";
		}else{
			strWin = "N";
		}
		return strWin;
	}
}
