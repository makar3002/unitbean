package com.example.test2;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {
    TextView title, time, description;
    ProgressBar loader;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        setTitle("Статья");

        Intent intent = getIntent();
        title = (TextView) findViewById(R.id.title);
        time = (TextView) findViewById(R.id.time);
        description = (TextView) findViewById(R.id.details);

        title.setText(intent.getStringExtra("title"));
        time.setText(intent.getStringExtra("publishedAt"));
        description.setText(intent.getStringExtra("description"));

    }
    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
}

