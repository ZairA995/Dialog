package com.example.dialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity implements View.OnClickListener
{

    private Button but;
    public ConstraintLayout layout;
    Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but = (Button) findViewById(R.id.change_fon);
        layout = (ConstraintLayout) findViewById(R.id.layout);
        context = MainActivity.this;

    }
    @Override
    public void onClick(View v) {
        final CharSequence[] items = {getText(R.string.pink),
                getText(R.string.yellow), getText(R.string.green), getText(R.string.purple)
        };

        but.setOnClickListener(this);
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setTitle(R.string.message);


        builder.setItems(items, new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int item) {
                switch (item)
                {
                    case 0:
                        layout.setBackgroundResource(R.color.pink);
                        but.setBackgroundResource(R.color.pink_but);
                        break;
                    case 1:
                        layout.setBackgroundResource(R.color.yellow);
                        but.setBackgroundResource(R.color.yellow_but);
                        break;
                    case 2:
                        layout.setBackgroundResource(R.color.green);
                        but.setBackgroundResource(R.color.yellow_but);

                        break;
                    case 3:
                        layout.setBackgroundResource(R.color.purple);
                        but.setBackgroundResource(R.color.purple_but);
                        break;
                }
            }
        });
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }
}