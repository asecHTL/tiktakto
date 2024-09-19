package at.htlgkr.tiktakto;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    TextView textView;

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
        textView.findViewById(R.id.textView);
        textView.setText("Lets play TikTakTo :)");


        field00.findViewById(R.id.field00);
        field01.findViewById(R.id.field01);
        field02.findViewById(R.id.field02);

        field10.findViewById(R.id.field10);
        field11.findViewById(R.id.field11);
        field12.findViewById(R.id.field12);

        field20.findViewById(R.id.field20);
        field21.findViewById(R.id.field21);
        field22.findViewById(R.id.field22);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.field00){
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(0,0);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(0,0);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(0,0);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(0,0);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }
        } else if (v.getId() == R.id.field01) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(0,1);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(0,1);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(0,1);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(0,1);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }
        } else if (v.getId() == R.id.field02) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(0,2);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(0,2);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(0,2);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(0,2);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }
        } else if (v.getId() == R.id.field10) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(1,0);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(1,0);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(1,0);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(1,0);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }
        } else if (v.getId() == R.id.field11) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(1,1);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(1,1);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(1,1);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(1,1);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }
        } else if (v.getId() == R.id.field12) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(1,2);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(1,2);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(1,2);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(1,2);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }

        } else if (v.getId() == R.id.field20) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(2,0);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(2,0);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(2,0);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(2,0);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }

        } else if (v.getId() == R.id.field21) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(2,1);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(2,1);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(2,1);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(2,1);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }

        } else if (v.getId() == R.id.field22) {
            int i = Logic.getPlayerRightNow();
            if (i == 0){
                //Player 1
                int statusField = Logic.checkStatusFieldPlayerOne(2,2);
                if (statusField == 0){
                    Logic.addFieldPlayerOne(2,2);
                    field00.setText("Player One");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }else {
                //Player 2
                int statusField = Logic.checkStatusFieldPlayerTwo(2,2);
                if (statusField == 0){
                    Logic.addFieldPlayerTwo(2,2);
                    field00.setText("Player Two");
                } else if (statusField == 1) {
                    textView.setText("Field is already taken by Player one!");
                } else if (statusField == 2) {
                    textView.setText("Field already taken by Player two!");
                }
            }

        }
    }
}