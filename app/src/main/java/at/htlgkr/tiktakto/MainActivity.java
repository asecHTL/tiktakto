package at.htlgkr.tiktakto;

import android.os.Bundle;
import android.view.Display;
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
        textView = findViewById(R.id.textView);
        textView.setText("Lets play TikTakTo :)");


        field00 = findViewById(R.id.field00);
        field01 = findViewById(R.id.field01);
        field02 = findViewById(R.id.field02);

        field10 = findViewById(R.id.field10);
        field11 = findViewById(R.id.field11);
        field12 = findViewById(R.id.field12);

        field20 = findViewById(R.id.field20);
        field21 = findViewById(R.id.field21);
        field22 = findViewById(R.id.field22);
    }


    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.field00){
            int temp = Modell.addFieldToPlayer(0,0);
            eventHandler(temp,field00);
        } else if (v.getId() == R.id.field01) {
            int temp = Modell.addFieldToPlayer(0,1);
            eventHandler(temp,field01);
        } else if (v.getId() == R.id.field02) {
            int temp = Modell.addFieldToPlayer(0,2);
            eventHandler(temp,field02);
        } else if (v.getId() == R.id.field10) {
            int temp = Modell.addFieldToPlayer(1,0);
            eventHandler(temp,field10);
        } else if (v.getId() == R.id.field11) {
            int temp = Modell.addFieldToPlayer(1,1);
            eventHandler(temp,field11);
        } else if (v.getId() == R.id.field12) {
            int temp = Modell.addFieldToPlayer(1,2);
            eventHandler(temp,field12);
        } else if (v.getId() == R.id.field20) {
            int temp = Modell.addFieldToPlayer(2,0);
            eventHandler(temp,field20);
        } else if (v.getId() == R.id.field21) {
            int temp = Modell.addFieldToPlayer(2,1);
            eventHandler(temp,field21);
        } else if (v.getId() == R.id.field22) {
            int temp = Modell.addFieldToPlayer(2,2);
            eventHandler(temp,field22);
            }


    }

    public void eventHandler(int returnValue,Button button){
        switch (returnValue){
            case 0 :
                //Feld wurde zu Player one hinzugefügt
                button.setText("X");
            case 1:
                textView.setText("Player One won !!!!!!");
            case 2:
                //Feld wurde zu Player two hinzugefügt
                button.setText("O");
            case 3:
                textView.setText("Player Two won !!!!!!");
            case 100:
                System.out.println("Error while playing");
            default:
                System.out.println("Undetected Error");
        }
    }
}