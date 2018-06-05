package android.mild.rpc.firebaselogin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class ShowActivity extends AppCompatActivity {
    TextView textShowScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);
        textShowScore=(TextView) findViewById(R.id.textView5);
        textShowScore.setText(String.valueOf(getIntent().getExtras().getInt("Score")));
    }


    public void ClickPlay(View view) {
        Intent agian = new Intent(ShowActivity.this,GameActivity.class);
        startActivities(agian);
        finish();
    }

    private void startActivities(Intent agian) {
    }

    public void Exit(View view) {
        finish();
    }
}

