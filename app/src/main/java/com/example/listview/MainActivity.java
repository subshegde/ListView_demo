package com.example.listview;

import android.os.Bundle;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    String list [] = {"Android","Dart","Flutter","Java","Python","VS Code","Android","Dart","Flutter","Java","Python","VS Code"};
    int images []={R.drawable.android,R.drawable.dart,R.drawable.flutter,R.drawable.java,R.drawable.python,R.drawable.vscode,
            R.drawable.android,R.drawable.dart,R.drawable.flutter,R.drawable.java,R.drawable.python,R.drawable.vscode};

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView1);
        CustomBaseAdapter customBaseAdapter = new CustomBaseAdapter(getApplicationContext(),list,images);
        listView.setAdapter(customBaseAdapter);


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
}