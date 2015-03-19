package com.bruno51615.aftermath;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.RelativeLayout;
import android.widget.Button;
import android.widget.EditText;
import android.graphics.Color;
import android.content.res.Resources;
import android.util.TypedValue;
import android.view.View;


public class Crafting extends ActionBarActivity
{

    private Button buttonCamp, buttonSurvival, buttonWeapons, buttonAmmo, buttonMedical, buttonFood;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_crafting);

        buttonCamp = (Button)findViewById(R.id.camp);
        buttonSurvival = (Button)findViewById(R.id.survival);
        buttonWeapons = (Button)findViewById(R.id.weapons);
        //TODO add the other buttons

        buttonWeapons.setOnClickListener
                (
                        // Callback
                        new Button.OnClickListener()
                        {
                            public void onClick(View v)
                            {
                                Intent intent = new Intent(v.getContext(), Weapons.class);
                                startActivity(intent);
                            }
                        }

                );

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_crafting, menu);
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
