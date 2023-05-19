package sg.edu.rp.c346.id22012732.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView btnModule1 = findViewById(R.id.module1);
        TextView btnModule2 = findViewById(R.id.module2);

        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C346");
                intent.putExtra("name", "Android Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("semester", '1');
                intent.putExtra("credit", '4');
                intent.putExtra("venue", "W66M");
                startActivity(intent);


            }
        });
        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("code", "C349");
                intent.putExtra("name", "iPad Programming");
                intent.putExtra("year", 2020);
                intent.putExtra("semester", '1');
                intent.putExtra("credit", '4');
                intent.putExtra("venue", "W66M");
                startActivity(intent);
            }
        });
    }
}
