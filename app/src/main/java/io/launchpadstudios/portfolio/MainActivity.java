package io.launchpadstudios.portfolio;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickAppButton(View view){
        // get text of the button
        Button b = (Button)view;
        String buttonText = b.getText().toString();

        // create a toast
        Context context = getApplicationContext();
        CharSequence text = String.format("This button will launch the %s app!", buttonText);
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
