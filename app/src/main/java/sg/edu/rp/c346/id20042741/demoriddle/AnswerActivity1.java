package sg.edu.rp.c346.id20042741.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

public class AnswerActivity1 extends AppCompatActivity {

    TextView tvAnswer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer1);

        Intent intentReceived  = getIntent();
        String questionSelected = intentReceived.getStringExtra("Question");
        tvAnswer = findViewById(R.id.textView);
        //tvAnswer.setText("In second activity");
        tvAnswer.setText(questionSelected + " answer is: Queue");
    }
}