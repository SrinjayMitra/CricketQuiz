package com.example.quizapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;





public class MainActivity extends AppCompatActivity {

    private String[] questions = new String[] {
            "1. Did David Warner win the Orange cap in the 2019 IPL for being the highest run scorer in the tournament?",
            "2. Is Rohit Sharma the ICC ODI Cricketer of the Year for 2019","3. Did Imran Tahir claim the Purple Cap for highest wicket taker in IPL 2019?",
            "4. Did Dhoni set a new record for most number of sixes by an individual in an ODI innings?",
            "5. Is Dhoni the ICC Best Cricketer of the Year 2019?","6. Did Virat Kohli become the first cricketer to win three top ICC honours in the same year?",
            "7. Is Virat Kohli the Indian player to make fastest century in the T20?",
           "8. Indian won ICC under 19 World Cup 2018, the final match took between India and Australia?",
            "9. Was Rishab Pant the ICC’s emerging player of the year 2018?",
            "10.  Was Virat Kohli the Indian cricketer did the miracle by making a century in 20 balls in T-20 match?",
            "11.  Rishab Pant the famous Indian player has been inducted into the ICC Hall of Fame in 2018 ?",
            "12.  Indra Nooyi has been appointed (in February 2018) as the first Independent female Director of the International Cricket Council (ICC) Board ?",
            "13. Pranav Dhanawade the first cricketer to score 1000 runs in an innings in any competitive match?",
            "14. In Eden Gardens Stadium Tendulkar completed his 100th Century?",
            "15. Is Sri Lanka First non test playing nation that beat India in International Cricket?"
    };

    private boolean[] answers = new boolean[]
            {true,true,false,true,false,true,false,true,true,false,false,true,true,false,true};


    private int score = 0;
    private int index = 0;

    private TextView Question;
    private Button yes;
    private Button no;
    private Button next;
    private Button previous;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Question = findViewById(R.id.Question);
        yes = findViewById(R.id.yes);
        no = findViewById(R.id.no);
        next = findViewById(R.id.next);
        previous = findViewById(R.id.previous);

        Question.setText(questions[index]);

        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if array is in bounds
                if (index <= questions.length - 1) {
                    // for condition when true
                    if (answers[index] == true) {
                        score++;
                        Toast.makeText(MainActivity.this, "CORRECT!!!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "INCORRECT!!", Toast.LENGTH_SHORT).show();
                    }
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (index < questions.length - 1) {
                                index++;
                                if (index < questions.length) {
                                    Question.setText(questions[index]);
                                }
                                // Disable the previous button if the current index is the first question
                                previous.setEnabled(index > 0);
                            }
                        }
                    });

                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (index > 0) {
                                index--;
                                if (index < questions.length) {
                                    Question.setText(questions[index]);
                                }
                                // Disable the next button if the current index is the last question
                                next.setEnabled(index < questions.length - 1);
                            }
                        }
                    });

                } else {
                    // Show the score when all questions are answered
                    Toast.makeText(MainActivity.this, "The Score is: " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // if array is in bounds
                if (index <= questions.length - 1) {
                    // for condition when true
                    if (answers[index] == false) {
                        score++;
                        Toast.makeText(MainActivity.this, "CORRECT!!!", Toast.LENGTH_SHORT).show();
                    } else {
                        Toast.makeText(MainActivity.this, "INCORRECT!!", Toast.LENGTH_SHORT).show();
                    }
                    next.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (index < questions.length - 1) {
                                index++;
                                if (index < questions.length) {
                                    Question.setText(questions[index]);
                                }
                                // Disable the previous button if the current index is the first question
                                previous.setEnabled(index > 0);
                            }
                        }
                    });

                    previous.setOnClickListener(new View.OnClickListener() {
                        @Override
                        public void onClick(View v) {
                            if (index > 0) {
                                index--;
                                if (index < questions.length) {
                                    Question.setText(questions[index]);
                                }
                                // Disable the next button if the current index is the last question
                                next.setEnabled(index < questions.length - 1);
                            }
                        }
                    });

                } else {
                    // Show the score when all questions are answered
                    Toast.makeText(MainActivity.this, "The Score is: " + score, Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}


