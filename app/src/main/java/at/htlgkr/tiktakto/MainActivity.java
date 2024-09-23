package at.htlgkr.tiktakto;

import static java.lang.String.valueOf;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.Display;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

    String[][]field = new String[3][3];
    Symbol symbol = Symbol.X;

    Button field00;
    Button field01;
    Button field02;
    Button field10;
    Button field11;
    Button field12;
    Button field20;
    Button field21;
    Button field22;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        textView = findViewById(R.id.textView);
        textView.setText("Lets play TikTakTo :)");

        field00 = findViewById(R.id.field00);
        field00.setOnClickListener(this);
        field01 = findViewById(R.id.field01);
        field01.setOnClickListener(this);
        field02 = findViewById(R.id.field02);
        field02.setOnClickListener(this);

        field10 = findViewById(R.id.field10);
        field10.setOnClickListener(this);
        field11 = findViewById(R.id.field11);
        field11.setOnClickListener(this);
        field12 = findViewById(R.id.field12);
        field12.setOnClickListener(this);

        field20 = findViewById(R.id.field20);
        field20.setOnClickListener(this);
        field21 = findViewById(R.id.field21);
        field21.setOnClickListener(this);
        field22 = findViewById(R.id.field22);
        field22.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.field00){
            Logic.addAndCheck(field,0,0,symbol);
            field00.setText(valueOf(symbol));
            field00.setClickable(false);
            setPlayerField(symbol,field00);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field01) {
            Logic.addAndCheck(field,0,0,symbol);
            field01.setText(valueOf(symbol));
            field01.setClickable(false);
            setPlayerField(symbol,field01);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field02) {
            Logic.addAndCheck(field,0,0,symbol);
            field02.setText(valueOf(symbol));
            field02.setClickable(false);
            setPlayerField(symbol,field02);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field10) {
            Logic.addAndCheck(field,0,0,symbol);
            field10.setText(valueOf(symbol));
            field10.setClickable(false);
            setPlayerField(symbol,field10);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field11) {
            Logic.addAndCheck(field,0,0,symbol);
            field11.setText(valueOf(symbol));
            field11.setClickable(false);
            setPlayerField(symbol,field11);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;
        } else if (v.getId() == R.id.field12) {
            Logic.addAndCheck(field,0,0,symbol);
            field12.setText(valueOf(symbol));
            field12.setClickable(false);
            setPlayerField(symbol,field12);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field20) {
            Logic.addAndCheck(field,0,0,symbol);
            field20.setText(valueOf(symbol));
            field20.setClickable(false);
            setPlayerField(symbol,field20);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field21) {
            Logic.addAndCheck(field,0,0,symbol);
            field21.setText(valueOf(symbol));
            field21.setClickable(false);
            setPlayerField(symbol,field21);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;

        } else if (v.getId() == R.id.field22) {
            Logic.addAndCheck(field,0,0,symbol);
            field22.setText(valueOf(symbol));
            field22.setClickable(false);
            setPlayerField(symbol,field22);
            checkWinner(symbol,field);
            Symbol symbolTemp = Logic.statusSymbol(symbol);
            symbol = symbolTemp;
            }


    }




    @SuppressLint("ResourceAsColor")
    public void setPlayerField(Symbol symbol, Button button){
        String temp = String.valueOf(symbol);
        if (temp.equals("X")){
            button.setBackgroundColor(R.color.black);
        }
    }


    public void checkWinner(Symbol symbol, String[][]array){
        boolean temp = Logic.checkCombined(array);
        if (temp == true){
            textView.setText("Player" + String.valueOf(symbol) + "Won");

        }

    }
}