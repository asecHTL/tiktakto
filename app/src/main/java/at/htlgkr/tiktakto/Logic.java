package at.htlgkr.tiktakto;

public class Logic {



    public static boolean addAndCheck(String[][]field,int x, int y, Symbol symbol){
        String temp = field[x][y];
        if (temp == null){
            field[x][y] = String.valueOf(symbol);
        }
        return false;

    }

    public static boolean checkTie(String[][]board){
        boolean temp = false;
        for (int i = 0; i < board.length; i++){
            for (int j = 0; j < board[i].length; j++){
                String x = board[i][j];
                if (x != null){
                    temp = true;
                }
            }
        }
        return temp;
    }


    public static Symbol statusSymbol(Symbol symbol){
        if (symbol == Symbol.O){
            return Symbol.X;
        }else {
            return Symbol.O;
        }
    }
    public static boolean checkDiagonal(String[][] board, Symbol symbol) {
        int counter = 0;
        for (int i = 0;i < 3; i++){
            String symbolInBoard = board[i][i];
            String symbolInput = String.valueOf(symbol);
            System.out.println(symbolInBoard);
            System.out.println(symbolInput);
            if (symbolInput.equals(symbolInBoard)){
                counter++;
                if (counter == 3){
                    return true;
                }
            }
        }
        int counter2 = 0;
        for (int j = 2; j >= 0 ; j--){
            String symbolInBoard = board[j][board.length-1 - j];
            String symbolInput = String.valueOf(symbol);
            System.out.println(symbolInBoard);
            System.out.println(symbolInput);
            if (symbolInput.equals(symbolInBoard)){
                counter2++;
                if (counter2 == 3){
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean checkHorizontal(String[][] board, Symbol symbol){
        for (int i = 0; i < board.length; i++){
            String tempij = board[i][0];
            String tempi1j = board[i][1];
            String tempi2j = board[i][2];

            String temp = String.valueOf(symbol);
            if (temp.equals(tempij) && temp.equals(tempi1j) && temp.equals(tempi2j)){
                return true;
            }
        }
        return false;
    }

    public static boolean checkVertikal(String[][] board, Symbol symbol){
        for (int i = 0; i < board.length; i++){
            String tempij = board[0][i];
            String tempi1j = board[1][i];
            String tempi2j = board[2][i];

            String temp = String.valueOf(symbol);
            if (temp.equals(tempij) && temp.equals(tempi1j) && temp.equals(tempi2j)){
                return true;
            }
        }
        return false;
    }









}
