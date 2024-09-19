package at.htlgkr.helloworld;

import android.widget.Button;

public class Logic {
    //Bei case 0 --> Feld nicht belegt
    //Bei case 1 --> Feld von Player one belegt
    //Bei case 2 --> Feld von Player two belegt


    int[][]boardStatus;

    public Logic(int[][] boardStatus) {
        this.boardStatus = new int[3][3];
    }

    public void checkStatus(int x,int y){
        if (boardStatus[x][y] == 0){

        } else if (boardStatus[x][y] == 1) {

        } else if (boardStatus[x][y] == 2) {

        }
        
    }


}
