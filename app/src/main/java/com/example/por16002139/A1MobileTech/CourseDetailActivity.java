package com.example.por16002139.A1MobileTech;

import android.content.Intent;
import android.support.v4.app.NavUtils;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.por16002139.lesson41.R;

public class CourseDetailActivity extends AppCompatActivity {
    //on creation sets the layout
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_course_detail);

        ImageView courseIconImageView = findViewById(R.id.course_icon);
        TextView CourseNameTextView = findViewById(R.id.Course_Name);
        TextView CourseTypeTextView = findViewById(R.id.Course_Type);
        TextView CourseDescriptionTextView = findViewById(R.id.Course_description);
//share button
        final Button ShareBtn = findViewById(R.id.ShareBtn);

        ShareBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(android.content.Intent.ACTION_SEND);
                intent.setType("text/plain");
                String shareBodyText = "Your sharing message goes here";
                intent.putExtra(android.content.Intent.EXTRA_SUBJECT, "Subject/Title");
                intent.putExtra(android.content.Intent.EXTRA_TEXT, shareBodyText);
                startActivity(Intent.createChooser(intent, "Choose sharing method"));
            }
        });

        if (getIntent().getExtras() != null) {

            String CourseName = getIntent().getStringExtra("Course_Name");
            String CourseType = getIntent().getStringExtra("Course_Type");
            String CourseDescription = getIntent().getStringExtra("Course_description");
            courseIconImageView.setImageResource(R.drawable.bath_logo_2);
            CourseNameTextView.setText(CourseName);
            CourseTypeTextView.setText(CourseType);
            CourseDescriptionTextView.setText(CourseDescription);
        }
       Toolbar toolbar = findViewById(R.id.toolbar);
       toolbar.setTitle(R.string.Course_detail_activity_title);
       toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.white));
       setSupportActionBar(toolbar);
       ActionBar actionbar = getSupportActionBar();
       if (actionbar != null) {
           actionbar.setDisplayHomeAsUpEnabled(true);
        }

    }
    //on creation adds a Up/Home button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            // Respond to the action bar's Up/Home button
            case android.R.id.home:
                NavUtils.navigateUpFromSameTask(this);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }


}
