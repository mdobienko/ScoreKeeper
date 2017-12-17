package xyz.marcinddobienko.scorekeeper;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.DigitalClock;
import android.widget.TextView;

/**
 * Made by Marcin Dobienko
 */

public class MainActivity extends AppCompatActivity {

    /**
     * All variables for team A
     * <p>
     * Main score for goals
     */
    int scoreTeamA = 0;

    /**
     * Number of yellow cards
     */
    int yellowCardTeamA = 0;

    /**
     * Number of red cards
     */
    int redCardTeamA = 0;

    /**
     * All variables for team B
     * <p>
     * Main score for goals
     */
    int scoreTeamB = 0;
    /**
     * Number of yellow cards
     */
    int yellowCardTeamB = 0;

    /**
     * Number of red cards
     */
    int redCardTeamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);

    }

    /**
     * Displays the given score for Team A.
     */
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add goal (1 point) to score for Team A.
     */
    public void displayGoals(View v) {
        scoreTeamA++;
        displayForTeamA(scoreTeamA);
    }

    /**
     * Display the red cards for team A
     */
    public void diplayRedCardsForTeamA(int redCard) {
        TextView cardView = (TextView) findViewById(R.id.team_a_red_card);
        cardView.setText(String.valueOf(redCard));

    }

    /**
     * add 1 red card to score for Team A.
     */
    public void addRedCardsTeamA(View v) {
        redCardTeamA++;
        diplayRedCardsForTeamA(redCardTeamA);
    }

    /**
     * Display the yellow cards for team A
     */
    public void diplayYellowCardsForTeamA(int yellowCard) {
        TextView cardView = (TextView) findViewById(R.id.team_a_yellow_card);
        cardView.setText(String.valueOf(yellowCard));
    }

    /**
     * add 1 yellow card to score for Team A.
     */
    public void addYellowCardTeamA(View v) {
        yellowCardTeamA++;
        diplayYellowCardsForTeamA(yellowCardTeamA);
    }

    /**
     * Reset all values(scores, red and yellow cards) on the screen to 0
     */

    public void resetAll(View v) {
        scoreTeamA = 0;
        scoreTeamB = 0;
        redCardTeamA = 0;
        redCardTeamB = 0;
        yellowCardTeamA = 0;
        yellowCardTeamB = 0;
        displayForTeamA(scoreTeamA);
        displayForTeamB(scoreTeamB);
        diplayRedCardsForTeamA(redCardTeamA);
        diplayRedCardsForTeamB(redCardTeamB);
        diplayYellowCardsForTeamA(yellowCardTeamA);
        diplayYellowCardsForTeamB(yellowCardTeamB);

    }

    /**
     * Displays the given score for Team B
     */
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    /**
     * add 1 goal to score for Team B
     */
    public void displayGoalB(View v) {
        scoreTeamB++;
        displayForTeamB(scoreTeamB);
    }

    /**
     * Display the red cards for team B
     */
    public void diplayRedCardsForTeamB(int redCard) {
        TextView cardView = (TextView) findViewById(R.id.team_b_red_card);
        cardView.setText(String.valueOf(redCard));

    }

    /**
     * add 1 red card to score for Team B
     */
    public void addRedCardsTeamB(View v) {
        redCardTeamB++;
        diplayRedCardsForTeamB(redCardTeamB);
    }

    /**
     * Display the yellow cards for team B
     */
    public void diplayYellowCardsForTeamB(int yellowCard) {
        TextView cardView = (TextView) findViewById(R.id.team_b_yellow_card);
        cardView.setText(String.valueOf(yellowCard));
    }

    /**
     * add 1 yellow card to score for Team B
     */
    public void addYellowCardTeamB(View v) {
        yellowCardTeamB++;
        diplayYellowCardsForTeamB(yellowCardTeamB);
    }

    //digital clock
    public class Clock extends Activity {
        @Override
        public void onCreate(Bundle savedInstanceState) {  // all classes should extend activity
            super.onCreate(savedInstanceState); // Create a new activity
            setContentView(R.layout.activity_main);// Displays the main screen for Clocks
            DigitalClock digital = (DigitalClock) findViewById(R.id.digital_clock);
        }
    }
}

