package com.upm.fi.jmn.horarios;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

public class Horario extends Activity {

	public final static String EXTRA_MESSAGE = "AbrirImagen";
	Button botonVolver;
	ImageView imagen;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_horario);

		imagen = (ImageView) findViewById(R.id.imageViewHorario);
		
		Intent intent = getIntent();
		int opcion = intent.getIntExtra(EXTRA_MESSAGE, 1);
		imagen = (ImageView) findViewById(R.id.imageViewHorario);
		
		switch (opcion) {
		case 1:
			imagen.setImageResource(R.drawable.ida591);
			break;
		case 2:
			imagen.setImageResource(R.drawable.vuelta591);
			break;
		default:
			break;
		}
		
		botonVolver = (Button) findViewById(R.id.buttonVolver);        
        botonVolver.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				finish();
			}
		});
	}
}
