package sg.edu.rp.c346.id20042741.demoriddle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class AnswerActivity extends AppCompatActivity {
TextView ans1Tv;
TextView ans2Tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_answer);

        ans1Tv = findViewById(R.id.ans1);
        ans2Tv = findViewById(R.id.ans2);

        Intent getAns = getIntent();
        String firstAns = getAns.getStringExtra("AnsOne");
        String secondAns = getAns.getStringExtra("AnsTwo");

        ans1Tv.setText("The answer is: " + firstAns);
        ans2Tv.setText("The answer is: " + secondAns);

    }
}