package com.example.por16002139.helloworld;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Date;

public class MainActivity extends AppCompatActivity {

//Declare a TextView and Button variable
    TextView dateToday;
    Button dateButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /* Find each unique 'id' in XML layout and set to corresponding TextView and Button variable defined above */
        dateToday = (TextView) findViewById(R.id.dateToday);
        dateButton = (Button) findViewById(R.id.dateButton);

        //Create a 'click' listener for the 'dateButton'
        dateButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //Set the 'dateToday' TextView equal to today's date
                dateToday.setText(new Date().toString());

            }

        });
        }
    }
}
