package android.kimr.quizproject;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class QuizProject extends Activity {
    private TextView answerText;
    private TextView question1;
    private Button TrueButton;
    private Button FalseButton;
    public TextView currentQuestion;

    public int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz_project);

        score = 0;

        question1 = (TextView) findViewById(R.id.question1);

        final Button buttonT = (Button) findViewById(R.id.TrueButton);
        buttonT.setOnClickListener(new View.OnClickListener() {
            public void onClick(View t) {
                // Perform action on click
                    Toast toast = Toast.makeText(getApplication(), "Incorrect", Toast.LENGTH_SHORT);
                    toast.show();
                //Log.i("BlogActivity", "title" + Question2.get().posts.get(score).title);
            }
        });
        final Button buttonF = (Button) findViewById(R.id.FalseButton);
        buttonF.setOnClickListener(new View.OnClickListener() {
            public void onClick(View f) {
                // Perform action on click
                    Toast toast = Toast.makeText(getApplication(), "Correct", Toast.LENGTH_SHORT);
                    toast.show();
                score ++;


            }
        });
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.quiz_project, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
