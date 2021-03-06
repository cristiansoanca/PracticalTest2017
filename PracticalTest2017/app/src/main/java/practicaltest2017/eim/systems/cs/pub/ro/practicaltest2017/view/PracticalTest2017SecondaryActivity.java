package practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.view;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.R;
import practicaltest2017.eim.systems.cs.pub.ro.practicaltest2017.general.Constants;

public class PracticalTest2017SecondaryActivity extends AppCompatActivity {

    private ButtonClickListener buttonClickListener = new ButtonClickListener();
    private class ButtonClickListener implements View.OnClickListener {


        @Override
        public void onClick(View view) {
            switch (view.getId()) {
                case R.id.ok_button:
                    setResult(RESULT_OK, null);
                    break;
                case R.id.cancel_button:
                    setResult(RESULT_CANCELED, null);
                    break;
            }
            finish();
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test2017_secondary);

        TextView numberOfClicksTextView = findViewById(R.id.number_of_clicks_text_view);
        Button okButton = findViewById(R.id.ok_button);
        okButton.setOnClickListener(buttonClickListener);
        Button cancelButton = findViewById(R.id.cancel_button);
        cancelButton.setOnClickListener(buttonClickListener);

        Intent intent = getIntent();
        if (intent != null && intent.getExtras().containsKey(Constants.NUMBER_OF_CLICKS)) {
            int numberOfClicks = intent.getIntExtra(Constants.NUMBER_OF_CLICKS, -1);
            numberOfClicksTextView.setText(String.valueOf(numberOfClicks));
        }

    }
}
