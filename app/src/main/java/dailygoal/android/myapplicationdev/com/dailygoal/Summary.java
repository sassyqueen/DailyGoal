package dailygoal.android.myapplicationdev.com.dailygoal;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

public class Summary extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_summary);
        // Get the intent so as to get the "things" inside the intent
        Intent i = getIntent();
        // Get the String array named "info" we passed in
        String[] values = i.getStringArrayExtra("values");
        // Get the TextView object
        TextView tv1 = (TextView) findViewById(R.id.textViewResults);
        // Display the name and age on the TextView
        tv1.setText("Read up on materials before class: " + values[0] + "\nArrive on time so as to not miss important part of lesson: " + values[1]
        + "\nAttempt the problem myself: " + values[2]  + "\nMy personal reflection today: " + values[3]);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                        .setAction("Action", null).show();
                Intent intent = new Intent(Summary.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

}
