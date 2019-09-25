package com.codeforgood.poder;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import org.w3c.dom.Text;

public class ExamResults extends AppCompatActivity {

    private int questions_correct;
    private double score;
    private TextView score_text;
    private Button nextbutton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_results);
        this.initialize();
    }

    public void initialize() {

        nextbutton = (Button) findViewById(R.id.next);
        nextbutton.setOnClickListener( new View.OnClickListener(){
            public void onClick (View v){
                //go to next page
                Intent intent = new Intent(ExamResults.this, HomePageActivity.class);
                startActivity(intent);
            }
        });


        Intent intent = getIntent();
        questions_correct = intent.getIntExtra("questions", -1);
        score = (double) questions_correct / 8.0; // this depends on the number being 8 questions
        score_text = (TextView) findViewById(R.id.score_percent);
        score_text.setText("" + score * 100 + "%");

    }


}