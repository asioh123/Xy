package com.example.assy.xyproject;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    boolean turn=true;
    String [] gameRow;
    String ButtonPress;
    int click=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gameRow = new String[9];

    }






    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;



    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void ClickClick(View sender)
    {
        Button bt = (Button) sender;

    }

    public void numClick(View sender)
    {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);

        // set title
        alertDialogBuilder.setTitle("Your Title");

        // set dialog message
        alertDialogBuilder
                .setMessage("Click yes to exit!")
                .setCancelable(false)
                .setPositiveButton("ok",new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog,int id) {
                        // if this button is clicked, close
                        // current activity
                        MainActivity.this.finish();
                    }
                });

        // create alert dialog
        AlertDialog alertDialog = alertDialogBuilder.create();

        // show it



        Button bt = (Button) sender;

        ButtonPress= bt.getText().toString();

        int number=Integer.parseInt(ButtonPress);



        if(gameRow[number]==null)
        {
            if (turn ==true)
            {
                gameRow[number]="o";
                bt.setBackgroundResource(R.drawable.ofinal);
                turn=false;
                click++;
            }
            else
            {
                gameRow[number]="x";
                bt.setBackgroundResource(R.drawable.xfinal);
                turn=true;
                click++;
            }
        }
        else
        {
            return;
        }


        if(gameRow[0]=="o" && gameRow[1]=="o" && gameRow[2]=="o")//line 1
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[0]=="x" && gameRow[1]=="x" && gameRow[2]=="x")//line 1
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[3]=="x" && gameRow[4]=="x" && gameRow[5]=="x")//line 2
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[3]=="o" && gameRow[4]=="o" && gameRow[5]=="o")//line 2
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[6]=="o" && gameRow[7]=="o" && gameRow[8]=="o")//line 3
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[6]=="x" && gameRow[7]=="x" && gameRow[8]=="x")//line 3
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[0]=="x" && gameRow[3]=="x" && gameRow[6]=="x")//line 4
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[0]=="o" && gameRow[3]=="o" && gameRow[6]=="o")//line 4
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[1]=="x" && gameRow[4]=="x" && gameRow[7]=="x")//line 5
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[1]=="o" && gameRow[4]=="o" && gameRow[7]=="o")//line 5
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[2]=="x" && gameRow[5]=="x" && gameRow[8]=="x")//line 6
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[2]=="o" && gameRow[5]=="o" && gameRow[8]=="o")//line 6
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[0]=="x" && gameRow[4]=="x" && gameRow[8]=="x")//line 7
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[0]=="o" && gameRow[4]=="o" && gameRow[8]=="o")//line 7
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(gameRow[2]=="x" && gameRow[4]=="x" && gameRow[6]=="x")//line 8
        {
            alertDialog.setMessage("player X wins");
            alertDialog.show();
        }
        else if(gameRow[2]=="o" && gameRow[4]=="o" && gameRow[6]=="o")//line 8
        {
            alertDialog.setMessage("player O wins");
            alertDialog.show();
        }
        else if(click==9)//defult
        {
            alertDialog.setMessage("Tow losers");
            alertDialog.show();
        }

    }

}
