package at.htlgkr.tiktakto;

public class Modell {
    //Modell Klasse (Spielfeld)



    public void addField(int x, int y){
        int playerRightNow = Logic.getPlayerRightNow();
        //Wenn 0 --> Player One am zug;
        if (playerRightNow == 0){
            int temp = Logic.checkStatusFieldPlayerOne(x,y);
            if (temp == 0){
                //Player Right Now auf 1 setzen
                Logic.setPlayerRightNow(1);
                //Feld ist Frei
                Logic.addFieldPlayerOne(x,y);
            } else if (temp == 1) {
                //Feld ist bereiets von Player One belegt
                //Text muss ausgeben das Fehler ist und Weil schelife solange Fehler!!!
            }
        }
    }





}
