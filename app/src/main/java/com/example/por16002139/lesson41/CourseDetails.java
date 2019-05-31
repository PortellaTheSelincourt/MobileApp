package com.example.por16002139.lesson41;

import android.support.v4.app.NavUtils;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class CourseDetail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.course_details);

        ImageView employerIconImageView = findViewById(R.id.employer_icon);
        TextView employerTextView = findViewById(R.id.employer);
        TextView jobTitleTextView = findViewById(R.id.job_title);
        TextView jobDescriptionTextView = findViewById(R.id.job_description);
        TextView jobDatesTextView = findViewById(R.id.job_dates);

        if (getIntent().getExtras() != null) {

            String employer = getIntent().getStringExtra("employer");
            String jobTitle = getIntent().getStringExtra("job_title");
            String jobDescription = getIntent().getStringExtra("job_description");
            String jobDates = getIntent().getStringExtra("job_dates");

            employerIconImageView.setImageResource(R.drawable.ic_work_blue_grey_48dp);
            employerTextView.setText(employer);
            jobTitleTextView.setText(jobTitle);
            jobDescriptionTextView.setText(jobDescription);
            jobDatesTextView.setText(jobDates);

        }

        Toolbar toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle(R.string.job_detail_activity_title);
        toolbar.setTitleTextColor(ContextCompat.getColor(getApplicationContext(), android.R.color.white));
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        if (actionbar != null) {
            actionbar.setDisplayHomeAsUpEnabled(true);
        }

    }

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