package io.launchpadstudios.portfolio;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
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

        // get toast string
        Resources res = getResources();
        String text = String.format(res.getString(R.string.toast_text), buttonText);

        // create a toast
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context, text, duration);
        toast.show();
    }
}
