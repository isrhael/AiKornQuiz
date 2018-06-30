package com.example.android.aikornquiz;

import android.os.Bundle;
import android.speech.tts.Voice;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.android.AikornQuizActivity;

public class AiQuizActivity extends AppCompatActivity {
    private AikornQuizActivity mQuestionLibrary = new AikornQuizActivity();

    private TextView mScoreView;
    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    private String[] mAnswer;
    private int mScore = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai_quiz);

        mScoreView = findViewById(R.id.score);
        mQuestionView = findViewById(R.id.question);
        mButtonChoice1 = findViewById(R.id.choice1);
        mButtonChoice2 = findViewById(R.id.choice2);
        mButtonChoice3 = findViewById(R.id.choice3);

        // Start of Button Listener for Button 1
        mButtonChoice1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My Logic for Button goes in here
                String ans = mButtonChoice1.getText().toString();


                if (ans.equalsIgnoreCase(mAnswer[0])) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code Optional
                    Toast.makeText(AiQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(AiQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });
        mAnswer =

        // End of Listener Button

        // Start of Button Listener for Button 2
        mButtonChoice2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My Logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code Optional
                    Toast.makeText(AiQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(AiQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        // End of Listener Button 2

        // Start of Button Listener for Button 3
        mButtonChoice3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //My Logic for Button goes in here
                String ans = mButtonChoice3.getText().toString();


                if (ans.equalsIgnoreCase(mAnswer[0])) {
                    mScore = mScore + 1;
                    updateScore(mScore);
                    updateQuestion();
                    //This line of code Optional
                    Toast.makeText(AiQuizActivity.this, "correct", Toast.LENGTH_SHORT).show();

                } else {
                    Toast.makeText(AiQuizActivity.this, "wrong", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                }

            }
        });

        // End of Listener Button 3

        private void updateQuestion () {
            mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
            mButtonChoice1.setText(mQuestionLibrary.getChoices1(mQuestionNumber));
            mButtonChoice2.setText(mQuestionLibrary.getChoices2(mQuestionNumber));
            mButtonChoice3.setText(mQuestionLibrary.getChoices3(mQuestionNumber));

            mAnswer = mQuestionLibrary.getmCorrectAnswers(mQuestionNumber);
            mQuestionNumber++;
        }

        private void updateScore(int point){
            mScoreView.setText("" + mScore);
        }

    }


    private void updateScore(int mScore) {
    }

    private void updateQuestion() {
    }
}
