package rayoflight.wallofquotes;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button nextButton;
    private TextView quotationTextView;

    private Quotes quotes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nextButton = (Button) findViewById(R.id.nextButton);
        quotationTextView = (TextView) findViewById(R.id.quotationTextView);
        quotes = new Quotes();

        quotationTextView.setText(quotes.getNextQuote());
    }
}
