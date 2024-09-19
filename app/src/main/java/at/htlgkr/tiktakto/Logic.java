package at.htlgkr.tiktakto;

public class Logic {
//Bei case 0 --> Feld nicht belegt
    //Bei case 1 --> Feld von Player one belegt
    //Bei case 2 --> Feld von Player two belegt
    //Bei case 3 --> Fehler bei Regestrierung von Feld Status


    static int[][]boardStatusPlayerOne = new int[3][3];
    static int[][]boardStatusPlayerTwo = new int[3][3];

    static int playerRightNow = 0;

    public static int getPlayerRightNow() {
        return playerRightNow;
    }

    public static int checkStatusFieldPlayerOne(int x, int y){
        if (boardStatusPlayerOne[x][y] == 0){
            return 0;
        } else if (boardStatusPlayerOne[x][y] == 1) {
            return 1;
        } else if (boardStatusPlayerOne[x][y] == 2) {
            return 2;
        }else {
            return 3;
        }

    }
    public static int checkStatusFieldPlayerTwo(int x,int y){
        if (boardStatusPlayerTwo[x][y] == 0){
            return 0;
        } else if (boardStatusPlayerTwo[x][y] == 1) {
            return 1;
        } else if (boardStatusPlayerTwo[x][y] == 2) {
            return 2;
        }else {
            return 3;
        }

    }

    public static void addFieldPlayerOne(int x, int y){
        boardStatusPlayerOne[x][y] = 1;
        playerRightNow = playerRightNow + 1;
    }

    public static void addFieldPlayerTwo(int x, int y){
        boardStatusPlayerOne[x][y] = 2;
        playerRightNow = playerRightNow - 1;
    }
}
