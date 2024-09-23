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
}
