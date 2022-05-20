package sg.edu.rp.c346.id20042741.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class AnswerActivity2 extends AppCompatActivity {

    TextView tvAns;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer2);
        tvAns = findViewById(R.id.qna2);
        Intent parsedAns = getIntent();
        String getAns = parsedAns.getStringExtra("Answer");

        tvAns.setText("Q2 answer is: " + getAns);

    }
}