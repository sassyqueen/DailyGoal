package dailygoal.android.myapplicationdev.com.dailygoal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.buttonOK);
        btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View arg0) {
                // Get the RadioGroup object 1
                RadioGroup rg1 = (RadioGroup) findViewById(R.id.radioGroup1);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId1 = rg1.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb1 = (RadioButton) findViewById(selectedButtonId1);
                //Show a Toast that display the text on the selected radio button
                Log.i("Value r1",  rb1.getText().toString());

                // Get the RadioGroup object 2
                RadioGroup rg2 = (RadioGroup) findViewById(R.id.radioGroup2);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId2 = rg2.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb2 = (RadioButton) findViewById(selectedButtonId2);
                //Show a Toast that display the text on the selected radio button
                Log.i("Value r2",  rb2.getText().toString());


                // Get the RadioGroup object 3
                RadioGroup rg3 = (RadioGroup) findViewById(R.id.radioGroup3);
                // Get the Id of the selected radio button in the RadioGroup
                int selectedButtonId3 = rg3.getCheckedRadioButtonId();
                // Get the radio button object from the Id we had gotten above
                RadioButton rb3 = (RadioButton) findViewById(selectedButtonId3);
                //Show a Toast that display the text on the selected radio button
                Log.i("Value r3",  rb3.getText().toString());

                EditText etPersonalReflection = (EditText) findViewById(R.id.editTextReflection);
                String etValue = etPersonalReflection.getText().toString();

                String[] values = {rb1.getText().toString(), rb2.getText().toString(), rb3.getText().toString(), etValue};

                Intent intent = new Intent(MainActivity.this, Summary.class);

                intent.putExtra("values", values);

                startActivity(intent);

            }});

    }
}
