package at.htlgkr.tiktakto;

import android.util.Log;

public class Modell {

    //Bei Case 0 --> Feld wurde zu Player One hinzugefügt
    //Bei Case 1 --> Player One hat gewonnen
    //Bei Case 2---> Feld wurde zu Plyer two hinzugefügt
    //Bei Case 3 --> Player two hat gwooenn
    //Bei Case 100 --> Error

    public static int addFieldToPlayer(int x, int y){
        int playerRightNow = Logic.getPlayerRightNow();
        //Wenn 0 --> Player One am zug;
        if (playerRightNow == 0){
            //Überpüft ob das Feld bereits belegt ist oder Frei ist
            int temp = Logic.checkStatusFieldPlayerOne(x,y);
            //Wenn temp == 0 -- > Feld ist Frei
            if (temp == 0){
                Logic.setPlayerRightNow(1);
                //Player One bekommt das Feld bei kords 0|0
                Logic.addFieldPlayerOne(x,y);
                //Überpüft ob spiel bereits zu ende ist --->
                if (Logic.checksIfGameOver()){
                    //Game Over Player One hat gewoonen
                    return 1;
                }
                return 0;
            } else if (temp == 1) {
                //Feld ist bereiets von Player One belegt
                //Text muss ausgeben das Fehler ist und Weil schelife solange Fehler!!!
                int checkAgain = 1;
                do {
                    System.out.println("Field is already selected by Player One");
                    System.out.println("Please cklick othe field");
                    checkAgain = Logic.checkStatusFieldPlayerOne(x,y);
                    if (checkAgain != 1 || checkAgain != 2){
                        Logic.setPlayerRightNow(1);
                        //Player One bekommt das Feld bei kords 0|0
                        Logic.addFieldPlayerOne(x,y);
                        //Überpüft ob spiel bereits zu ende ist --->
                        if (Logic.checksIfGameOver()){
                            //Game Over Player One hat gewoonen
                            return 1;
                        }
                        return 0;
                    }
                }while (checkAgain == 1 || checkAgain == 2);
            }else if (temp == 2){
                //Feld ist bereiets von Player Two belegt
                //Text muss ausgeben das Fehler ist und Weil schelife solange Fehler!!!
                int checkAgain = 2;
                do {
                    System.out.println("Field is already selected by Player Two");
                    System.out.println("Please cklick othe field");
                    checkAgain = Logic.checkStatusFieldPlayerOne(x,y);
                    if (checkAgain != 1 || checkAgain != 2){
                        Logic.setPlayerRightNow(1);
                        //Player One bekommt das Feld bei kords 0|0
                        Logic.addFieldPlayerOne(x,y);
                        //Überpüft ob spiel bereits zu ende ist --->
                        if (Logic.checksIfGameOver()){
                            //Game Over Player One hat gewoonen
                            return 1;
                        }
                        return 0;
                    }
                }while (checkAgain == 1 || checkAgain == 2);
            }




            //Player two wenn playerRightNow == 1
        } else if (playerRightNow == 1) {
            //Überpüft ob das Feld bereits belegt ist oder Frei ist
            int temp = Logic.checkStatusFieldPlayerOne(x,y);
            //Wenn temp == 0 -- > Feld ist Frei
            if (temp == 0){
                Logic.setPlayerRightNow(0);
                //Player two bekommt das Feld bei kords 0|0
                Logic.addFieldPlayerTwo(x,y);
                //Überpüft ob spiel bereits zu ende ist --->
                if (Logic.checksIfGameOver()){
                    //Game Over Player One hat gewoonen
                    return 3;

                }
                return 2;
            } else if (temp == 1) {
                //Feld ist bereiets von Player One belegt
                //Text muss ausgeben das Fehler ist und Weil schelife solange Fehler!!!
                int checkAgain = 1;
                do {
                    System.out.println("Field is already selected by Player One");
                    System.out.println("Please cklick othe field");
                    checkAgain = Logic.checkStatusFieldPlayerOne(x,y);
                    if (checkAgain != 1 || checkAgain != 2){
                        Logic.setPlayerRightNow(1);
                        //Player One bekommt das Feld bei kords 0|0
                        Logic.addFieldPlayerTwo(x,y);
                        //Überpüft ob spiel bereits zu ende ist --->
                        if (Logic.checksIfGameOver()){
                            //Game Over Player One hat gewoonen
                            return 3;
                        }
                        return 2;
                    }
                }while (checkAgain == 1 || checkAgain == 2);
            }else if (temp == 2){
                //Feld ist bereiets von Player Two belegt
                //Text muss ausgeben das Fehler ist und Weil schelife solange Fehler!!!
                int checkAgain = 2;
                do {
                    System.out.println("Field is already selected by Player Two");
                    System.out.println("Please cklick othe field");
                    checkAgain = Logic.checkStatusFieldPlayerOne(x,y);
                    if (checkAgain != 1 || checkAgain != 2) {
                        Logic.setPlayerRightNow(1);
                        //Player One bekommt das Feld bei kords 0|0
                        Logic.addFieldPlayerTwo(x, y);
                        //Überpüft ob spiel bereits zu ende ist --->
                        if (Logic.checksIfGameOver()) {
                            //Game Over Player One hat gewoonen
                            return 3;
                        }
                        return 2;
                    }
                }while (checkAgain == 1 || checkAgain == 2);
            }
        }
        return 100;
    }








}
