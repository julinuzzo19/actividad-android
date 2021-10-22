package com.example.buenosmodales;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Instancias para manejar los botones
    private Button btn_gracias;
    private Button btn_estornudar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Asocio las instancias a la interfaz
        btn_gracias = (Button)findViewById(R.id.btn_gracias);
        btn_estornudar = (Button)findViewById(R.id.btn_estornudar);

        // Registro un listener para cada botón
        btn_gracias.setOnClickListener(graciasListener);
        btn_estornudar.setOnClickListener(estornudarListener);

    }

    // Listener para el botón Gracias
    private View.OnClickListener graciasListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // Muestro el mensaje "De nada"
            Toast.makeText(MainActivity.this, "De nada!",
                    Toast.LENGTH_LONG).show();
        }
    };

    // Listener para el botón Estornudar
    private View.OnClickListener estornudarListener = new View.OnClickListener() {

        @Override
        public void onClick(View v) {
            // Muestro el mensaje "Salud!“
            Toast.makeText(MainActivity.this, "Salud!",
            Toast.LENGTH_LONG).show();
        }
    };




   // @Override
    //public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
      //  getMenuInflater().inflate(R.menu.main, menu);
        //return true;
    //}

}