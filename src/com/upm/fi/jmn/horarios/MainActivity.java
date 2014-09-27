package com.upm.fi.jmn.horarios;

import com.upm.fi.jmn.horarios.R;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	public final static String EXTRA_MESSAGE = "AbrirImagen";
	Button botonFacultad, botonAluche;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        botonFacultad = (Button) findViewById(R.id.buttonFacultad);
        botonAluche = (Button) findViewById(R.id.buttonAluche);
        
        botonFacultad.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent intent = new Intent(MainActivity.this,Horario.class);
				intent.putExtra(EXTRA_MESSAGE, 1);
				startActivity(intent);
			}
		});
        
        botonAluche.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(MainActivity.this,Horario.class);
				intent.putExtra(EXTRA_MESSAGE, 2);
				startActivity(intent);
			}
		});
    }
}
