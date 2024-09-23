package at.htlgkr.tiktakto;

public class Logic {
    public String[][]battleField;


    public static boolean addAndCheck(String[][]field,int x, int y, Symbol symbol){
        String temp = field[x][y];
        if (temp == null){
            field[x][y] = String.valueOf(symbol);
        }
        return false;

    }

    public static Symbol statusSymbol(Symbol symbol){
        if (symbol == Symbol.O){
            return Symbol.X;
        }else {
            return Symbol.O;
        }
    }



    public static boolean checkCombined(String[][]board){
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == board[i][1] && board[i][1] == board[i][2]) {
                return true;
            }
        }

        // Überprüfung der Spalten (vertikal)
        for (int i = 0; i < 3; i++) {
            if (board[0][i] == board[1][i] && board[1][i] == board[2][i]) {
                return true;
            }
        }

        // Überprüfung der Diagonalen
        if (board[0][0] == board[1][1] && board[1][1] == board[2][2]) {
            return true;
        }

        if (board[0][2] == board[1][1] && board[1][1] == board[2][0]) {
            return true;
        }

        // Kein Gewinner gefunden
        return false;
    }
}
