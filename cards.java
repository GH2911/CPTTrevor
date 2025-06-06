import arc.*;
public class cards{
	public static int[][] card(){
		int intCards[][];
		intCards = new int[52][3];
		//Diamonds
		intCards[0][0] = 1;
		intCards[0][1] = 1;
		intCards[0][2] = (int)(Math.random()*100+1);
		intCards[1][0] = 2;
		intCards[1][1] = 1;
		intCards[1][2] = (int)(Math.random()*100+1);
		intCards[2][0] = 3;
		intCards[2][1] = 1;
		intCards[2][2] = (int)(Math.random()*100+1);
		intCards[3][0] = 4;
		intCards[3][1] = 1;
		intCards[3][2] = (int)(Math.random()*100+1);
		intCards[4][0] = 5;
		intCards[4][1] = 1;
		intCards[4][2] = (int)(Math.random()*100+1);
		intCards[5][0] = 6;
		intCards[5][1] = 1;
		intCards[5][2] = (int)(Math.random()*100+1);
		intCards[6][0] = 7;
		intCards[6][1] = 1;
		intCards[6][2] = (int)(Math.random()*100+1);
		intCards[7][0] = 8;
		intCards[7][1] = 1;
		intCards[7][2] = (int)(Math.random()*100+1);
		intCards[8][0] = 9;
		intCards[8][1] = 1;
		intCards[8][2] = (int)(Math.random()*100+1);
		intCards[9][0] = 10;
		intCards[9][1] = 1;
		intCards[9][2] = (int)(Math.random()*100+1);
		intCards[10][0] = 11;
		intCards[10][1] = 1;
		intCards[10][2] = (int)(Math.random()*100+1);
		intCards[11][0] = 12;
		intCards[11][1] = 1;
		intCards[11][2] = (int)(Math.random()*100+1);
		intCards[12][0] = 13;
		intCards[12][1] = 1;
		intCards[12][2] = (int)(Math.random()*100+1);
		//Clubs
		intCards[13][0] = 1;
		intCards[13][1] = 2;
		intCards[13][2] = (int)(Math.random()*100+1);
		intCards[14][0] = 2;
		intCards[14][1] = 2;
		intCards[14][2] = (int)(Math.random()*100+1);
		intCards[15][0] = 3;
		intCards[15][1] = 2;
		intCards[15][2] = (int)(Math.random()*100+1);
		intCards[16][0] = 4;
		intCards[16][1] = 2;
		intCards[16][2] = (int)(Math.random()*100+1);
		intCards[17][0] = 5;
		intCards[17][1] = 2;
		intCards[17][2] = (int)(Math.random()*100+1);
		intCards[18][0] = 6;
		intCards[18][1] = 2;
		intCards[18][2] = (int)(Math.random()*100+1);
		intCards[19][0] = 7;
		intCards[19][1] = 2;
		intCards[19][2] = (int)(Math.random()*100+1);
		intCards[20][0] = 8;
		intCards[20][1] = 2;
		intCards[20][2] = (int)(Math.random()*100+1);
		intCards[21][0] = 9;
		intCards[21][1] = 2;
		intCards[21][2] = (int)(Math.random()*100+1);
		intCards[22][0] = 10;
		intCards[22][1] = 2;
		intCards[22][2] = (int)(Math.random()*100+1);
		intCards[23][0] = 11;
		intCards[23][1] = 2;
		intCards[23][2] = (int)(Math.random()*100+1);
		intCards[24][0] = 12;
		intCards[24][1] = 2;
		intCards[24][2] = (int)(Math.random()*100+1);
		intCards[25][0] = 13;
		intCards[25][1] = 2;
		intCards[25][2] = (int)(Math.random()*100+1);
		//Hearts
		intCards[26][0] = 1;
		intCards[26][1] = 3;
		intCards[26][2] = (int)(Math.random()*100+1);
		intCards[27][0] = 2;
		intCards[27][1] = 3;
		intCards[27][2] = (int)(Math.random()*100+1);
		intCards[28][0] = 3;
		intCards[28][1] = 3;
		intCards[28][2] = (int)(Math.random()*100+1);
		intCards[29][0] = 4;
		intCards[29][1] = 3;
		intCards[29][2] = (int)(Math.random()*100+1);
		intCards[30][0] = 5;
		intCards[30][1] = 3;
		intCards[30][2] = (int)(Math.random()*100+1);
		intCards[31][0] = 6;
		intCards[31][1] = 3;
		intCards[31][2] = (int)(Math.random()*100+1);
		intCards[32][0] = 7;
		intCards[32][1] = 3;
		intCards[32][2] = (int)(Math.random()*100+1);
		intCards[33][0] = 8;
		intCards[33][1] = 3;
		intCards[33][2] = (int)(Math.random()*100+1);
		intCards[34][0] = 9;
		intCards[34][1] = 3;
		intCards[34][2] = (int)(Math.random()*100+1);
		intCards[35][0] = 10;
		intCards[35][1] = 3;
		intCards[35][2] = (int)(Math.random()*100+1);
		intCards[36][0] = 11;
		intCards[36][1] = 3;
		intCards[36][2] = (int)(Math.random()*100+1);
		intCards[37][0] = 12;
		intCards[37][1] = 3;
		intCards[37][2] = (int)(Math.random()*100+1);
		intCards[38][0] = 13;
		intCards[38][1] = 3;
		intCards[38][2] = (int)(Math.random()*100+1);
		//Spades
		intCards[39][0] = 1;
		intCards[39][1] = 4;
		intCards[39][2] = (int)(Math.random()*100+1);
		intCards[40][0] = 2;
		intCards[40][1] = 4;
		intCards[40][2] = (int)(Math.random()*100+1);
		intCards[41][0] = 3;
		intCards[41][1] = 4;
		intCards[41][2] = (int)(Math.random()*100+1);
		intCards[42][0] = 4;
		intCards[42][1] = 4;
		intCards[42][2] = (int)(Math.random()*100+1);
		intCards[43][0] = 5;
		intCards[43][1] = 4;
		intCards[43][2] = (int)(Math.random()*100+1);
		intCards[44][0] = 6;
		intCards[44][1] = 4;
		intCards[44][2] = (int)(Math.random()*100+1);
		intCards[45][0] = 7;
		intCards[45][1] = 4;
		intCards[45][2] = (int)(Math.random()*100+1);
		intCards[46][0] = 8;
		intCards[46][1] = 4;
		intCards[46][2] = (int)(Math.random()*100+1);
		intCards[47][0] = 9;
		intCards[47][1] = 4;
		intCards[47][2] = (int)(Math.random()*100+1);
		intCards[48][0] = 10;
		intCards[48][1] = 4;
		intCards[48][2] = (int)(Math.random()*100+1);
		intCards[49][0] = 11;
		intCards[49][1] = 4;
		intCards[49][2] = (int)(Math.random()*100+1);
		intCards[50][0] = 12;
		intCards[50][1] = 4;
		intCards[50][2] = (int)(Math.random()*100+1);
		intCards[51][0] = 13;
		intCards[51][1] = 4;
		intCards[51][2] = (int)(Math.random()*100+1);
		//Bubble Sorter
		int intCount;
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
}
