package com.example.quizapp;

import static com.example.quizapp.R.id.question;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private String[] questions={"Java is a person?",
            "Java was introduced in 1233?",
            "Java made using python?",
             "Java has abstract classes?",
             "Java is invented before C++?"};
    private boolean[] ans={false,false,false,true,false};
    private int index=0;
    private int score=0;
    Button yes,no;
    TextView question;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        yes=findViewById(R.id.button);
        no=findViewById(R.id.button2);
        question=findViewById(R.id.question);
        question.setText(questions[0]);

       yes.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               if(index<=questions.length-1){
                   if(ans[index]==true){
                       score++;
                   }
                   index++;
                   if(index<=questions.length-1){
                       question.setText(questions[index]);
                   }
                   else
                   {
                       Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                   }
               }
               else{
                   Toast.makeText(MainActivity.this, "Restart to play again!", Toast.LENGTH_SHORT).show();
               }
           }
       });
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(index<=questions.length-1){
                    if(ans[index]==false){
                        score++;
                    }
                    index++;
                    if(index<=questions.length-1){
                        question.setText(questions[index]);
                    }
                    else
                    {
                        Toast.makeText(MainActivity.this, "Your Score is "+score, Toast.LENGTH_SHORT).show();
                    }
                }
                else{
                    Toast.makeText(MainActivity.this, "Restart to play again!", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}