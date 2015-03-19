package com.bruno51615.aftermath;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;


public class MainActivity extends ActionBarActivity
{


    private RelativeLayout mainPage;
    private Button button;
    private EditText username, password;
    private Resources r;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        // TODO: Disable XML only from this class
        setContentView(R.layout.activity_main);

        // Starts layout
        mainPage = new RelativeLayout(this);
        mainPage.setBackgroundColor(Color.WHITE);



        // Starts button
        button = new Button(this);
        button.setBackgroundColor(Color.RED);
        button.setText("Log in");
        button.setId(R.id.button);

        button.setOnClickListener
                (
                  // Callback
                  new Button.OnClickListener()
                  {
                        public void onClick(View v)
                        {
                            Intent intent = new Intent(v.getContext(), Crafting.class);
                            startActivity(intent);
                        }
                  }

                );



        // Start log in field
        username = new EditText(this);
        username.setId(R.id.username);
        username.setHint("username");
        password = new EditText(this);
        password.setId(R.id.password);
        password.setHint("password");



        // Adding details
        RelativeLayout.LayoutParams buttonDetails = new RelativeLayout.LayoutParams
                (
                  RelativeLayout.LayoutParams.WRAP_CONTENT,
                  RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        RelativeLayout.LayoutParams usernameDetails = new RelativeLayout.LayoutParams
                (
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        RelativeLayout.LayoutParams passwordDetails = new RelativeLayout.LayoutParams
                (
                        RelativeLayout.LayoutParams.WRAP_CONTENT,
                        RelativeLayout.LayoutParams.WRAP_CONTENT
                );

        buttonDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        buttonDetails.addRule(RelativeLayout.CENTER_VERTICAL);

        passwordDetails.addRule(RelativeLayout.ABOVE, button.getId());
        passwordDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        passwordDetails.setMargins(0, 0, 0, 50);

        usernameDetails.addRule(RelativeLayout.ABOVE, password.getId());
        usernameDetails.addRule(RelativeLayout.CENTER_HORIZONTAL);
        usernameDetails.setMargins(0, 0, 0, 50);

        // Resources
        r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 200, r.getDisplayMetrics()); // Convert DPI to Pixels
        password.setWidth(px);
        username.setWidth(px);

        // Add to the view
        mainPage.addView(button, buttonDetails);
        mainPage.addView(password, passwordDetails);
        mainPage.addView(username, usernameDetails);


        // Display to the screen
        setContentView(mainPage);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

}
