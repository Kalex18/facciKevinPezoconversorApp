package com.example.kalex.faccikevinpezoconversorapp;

import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.widget.EditText;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
private EditText cent, farent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
this.cent= (EditText)findViewById(R.id.txtcent);
this.farent= (EditText)findViewById(R.id.txtfarent);


this.cent.setOnEditorActionListener(new TextView.OnEditorActionListener() {


    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
       float faren;
       faren=(1.8f)*Float.parseFloat(cent.getText().toString())+32;

       farent.setText(""+faren);
        return false;
    }


});

this.farent.setOnEditorActionListener(new TextView.OnEditorActionListener() {
    @Override
    public boolean onEditorAction(TextView v, int actionId, KeyEvent event) {
 float centi;
 centi= (Float.parseFloat(farent.getText().toString())-32)/(1.8f);
        cent.setText(""+centi);
        return false;
    }
});
    }

    @Override
    protected void onStart() {

        super.onStart();

    }
}
