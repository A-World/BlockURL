package aworld.preventad;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button blkButton = (Button)findViewById(R.id.blockbutton );

        blkButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView =
                                (TextView)findViewById(R.id.resultText );
                        myTextView.setText("Block Button clicked");
                        myTextView.setTextColor(Color.BLUE);
                    }
                }
        );

        Button unblkButton = (Button)findViewById(R.id.unblockbutton );

        unblkButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        TextView myTextView =
                                (TextView)findViewById(R.id.resultText );
                        myTextView.setText("UnBlock Button clicked");
                        myTextView.setTextColor(Color.RED);
                    }
                }
        );

        Button resetButton = (Button)findViewById(R.id.resetbutton );

        resetButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v)
                    {
                        TextView myTextView =
                                (TextView)findViewById(R.id.resultText );
                        myTextView.setText("Reset Button clicked");
                        myTextView.setTextColor(Color.GREEN);
                    }
                }
        );
    }
}