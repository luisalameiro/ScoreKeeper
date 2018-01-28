package com.lameiro.e.scorekeeper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.lameiro.e.scorekeeper.R;

public class MainActivity extends AppCompatActivity {

    int scoreTeamA = 0;
    int scoreTeamB = 0;
    int set = 1;
    int setTeamA = 0;
    int setTeamB = 0;
    String scoreA;
    String scoreB;
    int tieBreak = 0;
    int numberOfSetsTeamA = 0;
    int numberOfSetsTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
    }

    /**
     * Adds Points for Team A.
     */

    public void TeamAScored (View v) {
        if (tieBreak == 0) {
            if (scoreTeamA <30){ scoreTeamA = scoreTeamA + 15;
                displayForTeamA(scoreTeamA);}
            else {
                if (scoreTeamA == 30){ scoreTeamA = scoreTeamA + 10;
                    displayForTeamA(scoreTeamA);}
                else{ if (scoreTeamA==40){
                            if(scoreTeamB < 40){scoreTeamA = 0;
                                displayForTeamA(scoreTeamA);
                                scoreTeamB = 0;
                                displayForTeamB(scoreTeamB);
                                if (setTeamA < 5) { setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}}
                                else {if (setTeamB < 5 && setTeamA<6){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    numberOfSetsTeamA=numberOfSetsTeamA+1;
                                    set=set+1;
                                    scoreTeamA = 0;
                                    scoreTeamB = 0;
                                    displayForTeamA(scoreTeamA);
                                    displayForTeamB(scoreTeamB);
                                    setTeamB=0;
                                    setTeamA=0;
                                    if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                    set=7;
                                    scoreTeamA=50;
                                    scoreTeamB=50;}
                                            }
                                        else{if (setTeamA==5 && setTeamB==6){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    displayMessageA("Tie break");
                                    displayMessageB("Tie break");
                                    scoreTeamA = 0;
                                    scoreTeamB = 0;
                                    tieBreak = 1;
                                }
                                else{if (setTeamA==5 && setTeamB==5){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}}
                                    else{if (setTeamA==6 && setTeamB==5) {setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    numberOfSetsTeamA=numberOfSetsTeamA+1;
                                    set=set+1;
                                    scoreTeamA = 0;
                                    scoreTeamB = 0;
                                    displayForTeamA(scoreTeamA);
                                    displayForTeamB(scoreTeamB);
                                        setTeamB=0;
                                        setTeamA=0;
                                    if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                        set=7;
                                        scoreTeamA=50;
                                        scoreTeamB=50;}
                                }}}}}}
                            else{if (scoreA=="Adv."){  scoreTeamA = 0;
                                        displayForTeamA(scoreTeamA);
                                        scoreTeamB = 0;
                                        scoreA = "0";
                                        scoreB = "0";
                                        displayForTeamB(scoreTeamB);
                                if (setTeamA < 5) { setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}}
                                else {if (setTeamB < 5 && setTeamA<6){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    numberOfSetsTeamA=numberOfSetsTeamA+1;
                                    set=set+1;
                                    scoreTeamA = 0;
                                    scoreTeamB = 0;
                                    displayForTeamA(scoreTeamA);
                                    displayForTeamB(scoreTeamB);
                                    setTeamB=0;
                                    setTeamA=0;
                                    if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                        set=7;
                                        scoreTeamA=50;
                                        scoreTeamB=50;}}
                                else{if (setTeamA==5 && setTeamB==6){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    displayMessageA("Tie break");
                                    displayMessageB("Tie break");
                                    scoreTeamA = 0;
                                    scoreTeamB = 0;
                                    tieBreak = 1;
                                }
                                else{if (setTeamA==5 && setTeamB==5){setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}}
                                    else{if (setTeamA==6 && setTeamB==5) {setTeamA = setTeamA +1;
                                    if (set==1){displayForTeamASet1(setTeamA);}
                                    if (set==2){displayForTeamASet2(setTeamA);}
                                    if (set==3){displayForTeamASet3(setTeamA);}
                                    if (set==4){displayForTeamASet4(setTeamA);}
                                    if (set==5){displayForTeamASet5(setTeamA);}
                                    numberOfSetsTeamA=numberOfSetsTeamA+1;
                                    set=set+1;
                                        scoreTeamA = 0;
                                        scoreTeamB = 0;
                                        displayForTeamA(scoreTeamA);
                                        displayForTeamB(scoreTeamB);
                                        setTeamB=0;
                                        setTeamA=0;
                                    if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                        set=7;
                                        scoreTeamA=50;
                                        scoreTeamB=50;}}
                                }}}}
                                        }

                                else{if (scoreB=="Adv."){scoreB="40";
                                    displayMessageB(scoreB);
                                    scoreA ="40";
                                    displayMessageA(scoreA);}
                                else {
                                if (scoreB == "40") {
                                    scoreA = "Adv.";
                                    displayMessageA(scoreA);
                                }

                                    else{scoreA ="Adv.";
                                displayMessageA(scoreA);}}
                            } }}}}}

                                else{if (scoreTeamA<6){scoreTeamA = scoreTeamA+1;
                                    displayForTeamA(scoreTeamA);}
                                    else{if (scoreTeamA==6 && scoreTeamB<6){
                                        scoreTeamA = scoreTeamA+1;
                                        displayForTeamA(scoreTeamA);
                                        setTeamA = setTeamA +1;
                                        if (set==1){displayForTeamASet1(setTeamA);}
                                        if (set==2){displayForTeamASet2(setTeamA);}
                                        if (set==3){displayForTeamASet3(setTeamA);}
                                        if (set==4){displayForTeamASet4(setTeamA);}
                                        if (set==5){displayForTeamASet5(setTeamA);}
                                        numberOfSetsTeamA=numberOfSetsTeamA+1;
                                        set=set+1;
                                        scoreTeamA = 0;
                                        scoreTeamB = 0;
                                        displayForTeamA(scoreTeamA);
                                        displayForTeamB(scoreTeamB);
                                        setTeamB=0;
                                        setTeamA=0;
                                        tieBreak=0;
                                        if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                            set=7;
                                            scoreTeamA=50;
                                            scoreTeamB=50;}}
                                    else{if (scoreTeamA>6 && scoreTeamB<scoreTeamA){
                                        scoreTeamA = scoreTeamA+1;
                                        displayForTeamA(scoreTeamA);
                                        setTeamA = setTeamA +1;
                                        if (set==1){displayForTeamASet1(setTeamA);}
                                        if (set==2){displayForTeamASet2(setTeamA);}
                                        if (set==3){displayForTeamASet3(setTeamA);}
                                        if (set==4){displayForTeamASet4(setTeamA);}
                                        if (set==5){displayForTeamASet5(setTeamA);}
                                        numberOfSetsTeamA=numberOfSetsTeamA+1;
                                        set=set+1;
                                        scoreTeamA = 0;
                                        scoreTeamB = 0;
                                        displayForTeamA(scoreTeamA);
                                        displayForTeamB(scoreTeamB);
                                        setTeamB=0;
                                        setTeamA=0;
                                        tieBreak=0;
                                        if (set>3 && numberOfSetsTeamA>2){displayMessageA("Winner");
                                            set=7;
                                            scoreTeamA=50;
                                            scoreTeamB=50;}}
                                            else{scoreTeamA = scoreTeamA+1;
                                                displayForTeamA(scoreTeamA);}}
                               }}}






    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayMessageA(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_a_score);
        priceTextView.setText(message);
    }

    public void displayForTeamASet1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set1TeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamASet2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set2TeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamASet3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set3TeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamASet4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set4TeamA);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamASet5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set5TeamA);
        scoreView.setText(String.valueOf(score));
    }




    /**
     * Adds 3 Point for Team B.
     */

    public void TeamBScored (View v) {
        if (tieBreak == 0) {
            if (scoreTeamB <30){ scoreTeamB = scoreTeamB + 15;
                displayForTeamB(scoreTeamB);}
            else {
                if (scoreTeamB == 30){ scoreTeamB = scoreTeamB + 10;
                    displayForTeamB(scoreTeamB);}
                else{ if (scoreTeamB == 40){
                    if(scoreTeamA < 40){scoreTeamB = 0;
                        displayForTeamB(scoreTeamB);
                        scoreTeamA = 0;
                        displayForTeamA(scoreTeamA);
                        if (setTeamB < 5) { setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}}
                        else {if (setTeamA < 5 && setTeamB<6){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                            numberOfSetsTeamB=numberOfSetsTeamB+1;
                            set=set+1;
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            displayForTeamA(scoreTeamA);
                            displayForTeamB(scoreTeamB);
                            setTeamB=0;
                            setTeamA=0;
                            if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                                set=7;
                                scoreTeamA=50;
                                scoreTeamB=50;}}
                        else{if (setTeamB==5 && setTeamA==6){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                            displayMessageB("Tie break");
                            displayMessageA("Tie break");
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            tieBreak = 1;

                        }

                        else{if (setTeamB==5 && setTeamA==5){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}}
                            else{if (setTeamB==6 && setTeamA==5) {setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                            numberOfSetsTeamB=numberOfSetsTeamB+1;
                            set=set+1;
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            displayForTeamA(scoreTeamA);
                            displayForTeamB(scoreTeamB);
                                setTeamB=0;
                                setTeamA=0;
                            if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                                set=7;
                                scoreTeamA=50;
                                scoreTeamB=50;}}
                        }}}}}
                    else{ if (scoreB=="Adv."){  scoreTeamB = 0;
                        displayForTeamB(scoreTeamB);
                        scoreTeamA = 0;
                        scoreB = "0";
                        scoreA = "0";
                        displayForTeamA(scoreTeamA);
                        if (setTeamB < 5) { setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}}
                        else {if (setTeamA < 5 && setTeamB<6){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                            numberOfSetsTeamB=numberOfSetsTeamB+1;
                            set=set+1;
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            displayForTeamA(scoreTeamA);
                            displayForTeamB(scoreTeamB);
                            setTeamB=0;
                            setTeamA=0;
                            if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                                set=7;
                                scoreTeamA=50;
                                scoreTeamB=50;}}
                        else{if (setTeamB==5 && setTeamA==6){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                            displayMessageB("Tie break");
                            displayMessageA("Tie break");
                            scoreTeamA = 0;
                            scoreTeamB = 0;
                            tieBreak = 1;

                        }

                        else{if (setTeamB==5 && setTeamA==5){setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}}
                            else{if (setTeamB==6 && setTeamA==5) {
                            setTeamB = setTeamB +1;
                            if (set==1){displayForTeamBSet1(setTeamB);}
                            if (set==2){displayForTeamBSet2(setTeamB);}
                            if (set==3){displayForTeamBSet3(setTeamB);}
                            if (set==4){displayForTeamBSet4(setTeamB);}
                            if (set==5){displayForTeamBSet5(setTeamB);}
                                numberOfSetsTeamB=numberOfSetsTeamB+1;
                                set=set+1;
                                scoreTeamA = 0;
                                scoreTeamB = 0;
                                displayForTeamA(scoreTeamA);
                                displayForTeamB(scoreTeamB);
                                setTeamB=0;
                                setTeamA=0;
                                if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                                    set=7;
                                    scoreTeamA=50;
                                    scoreTeamB=50;}}
                        }}}}
                        }

                       else { if (scoreA=="Adv."){scoreA="40";
                            displayMessageA(scoreA);
                            scoreB ="40";
                            displayMessageB(scoreB);}
                        else {
                            if (scoreA == "40") {
                                scoreB = "Adv.";
                                displayMessageB(scoreB);
                            }

                    else{scoreB ="Adv.";
                        displayMessageB(scoreB);}


                    }}}}}}}

                    else{if (scoreTeamB<6){scoreTeamB = scoreTeamB+1;
                        displayForTeamB(scoreTeamB);}
                    else{if (scoreTeamB==6 && scoreTeamA<6){
                        scoreTeamB = scoreTeamB+1;
                        displayForTeamB(scoreTeamB);
                        setTeamB = setTeamB +1;
                        if (set==1){displayForTeamBSet1(setTeamB);}
                        if (set==2){displayForTeamBSet2(setTeamB);}
                        if (set==3){displayForTeamBSet3(setTeamB);}
                        if (set==4){displayForTeamBSet4(setTeamB);}
                        if (set==5){displayForTeamBSet5(setTeamB);}
                        numberOfSetsTeamB=numberOfSetsTeamB+1;
                        set=set+1;
                        scoreTeamB = 0;
                        scoreTeamA = 0;
                        displayForTeamA(scoreTeamA);
                        displayForTeamB(scoreTeamB);
                        setTeamB=0;
                        setTeamA=0;
                        tieBreak=0;
                        if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                            set=7;
                            scoreTeamA=50;
                            scoreTeamB=50;}
                    }
                    else{if (scoreTeamB>6 && scoreTeamA<scoreTeamB){
                        scoreTeamB = scoreTeamB+1;
                        displayForTeamB(scoreTeamB);
                        setTeamB = setTeamB +1;
                        if (set==1){displayForTeamBSet1(setTeamB);}
                        if (set==2){displayForTeamBSet2(setTeamB);}
                        if (set==3){displayForTeamBSet3(setTeamB);}
                        if (set==4){displayForTeamBSet4(setTeamB);}
                        if (set==5){displayForTeamBSet5(setTeamB);}
                        numberOfSetsTeamB=numberOfSetsTeamB+1;
                        set=set+1;
                        scoreTeamA = 0;
                        scoreTeamB = 0;
                        displayForTeamA(scoreTeamA);
                        displayForTeamB(scoreTeamB);
                        setTeamB=0;
                        setTeamA=0;
                        tieBreak=0;
                        if (set>3 && numberOfSetsTeamB>2){displayMessageB("Winner");
                            set=7;
                            scoreTeamA=50;
                            scoreTeamB=50;}}
                    else{scoreTeamB = scoreTeamB+1;
                        displayForTeamB(scoreTeamB);}}
        }}}



    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    private void displayMessageB(String message) {
        TextView priceTextView = (TextView) findViewById(R.id.team_b_score);
        priceTextView.setText(message);
    }

    public void displayForTeamBSet1(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set1TeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBSet2(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set2TeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBSet3(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set3TeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBSet4(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set4TeamB);
        scoreView.setText(String.valueOf(score));
    }

    public void displayForTeamBSet5(int score) {
        TextView scoreView = (TextView) findViewById(R.id.set5TeamB);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * Resets both scores.
     */
    public void reset (View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        setTeamA = 0 ;
        setTeamB = 0 ;
        set = 1 ;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        displayForTeamASet1(setTeamA);
        displayForTeamASet2(setTeamA);
        displayForTeamASet3(setTeamA);
        displayForTeamASet4(setTeamA);
        displayForTeamASet5(setTeamA);
        displayForTeamBSet1(setTeamB);
        displayForTeamBSet2(setTeamB);
        displayForTeamBSet3(setTeamB);
        displayForTeamBSet4(setTeamB);
        displayForTeamBSet5(setTeamB);
        numberOfSetsTeamA = 0;
        numberOfSetsTeamB = 0;
    }

}