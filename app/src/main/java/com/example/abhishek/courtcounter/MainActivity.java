package com.example.abhishek.courtcounter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreTeamA = 0;
    int scoreTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayforTeamA(0);
        displayforTeamB(0);
    }

    public void addthreeforTeamA(View v)
    {
        scoreTeamA = scoreTeamA + 3;
        displayforTeamA(scoreTeamA);
    }
    public void addtwoforTeamA(View v){

        scoreTeamA = scoreTeamA + 2;
        displayforTeamA(scoreTeamA);
    }

    public void addoneforTeamA(View v){
        scoreTeamA = scoreTeamA + 1;
        displayforTeamA(scoreTeamA);
    }
    public void addthreeforTeamB(View v)
    {
        scoreTeamB = scoreTeamB + 3;
        displayforTeamB(scoreTeamB);
    }
    public void addtwoforTeamB(View v){

        scoreTeamB = scoreTeamB + 2;
        displayforTeamB(scoreTeamB);
    }

    public void addoneforTeamB(View v){
        scoreTeamB = scoreTeamB + 1;
        displayforTeamB(scoreTeamB);
    }

    public void resetScore(View v){
        scoreTeamA = 0;
        scoreTeamB = 0;
        displayforTeamA(scoreTeamA);
        displayforTeamB(scoreTeamB);

    }

    public void displayforTeamA(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }
    public void displayforTeamB(int score){
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }




}
