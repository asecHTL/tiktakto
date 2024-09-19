package at.htlgkr.helloworld;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
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
            
        } else if (v.getId() == R.id.field01) {
            
        } else if (v.getId() == R.id.field02) {
            
        } else if (v.getId() == R.id.field10) {
            
        } else if (v.getId() == R.id.field11) {
            
        } else if (v.getId() == R.id.field12) {
            
        } else if (v.getId() == R.id.field20) {
            
        } else if (v.getId() == R.id.field21) {
            
        } else if (v.getId() == R.id.field22) {
            
        }
    }
}