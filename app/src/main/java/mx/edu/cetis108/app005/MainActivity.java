package mx.edu.cetis108.app005;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button btnTemas, btnNuevo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void btnTemas (View v){
        Intent btnTemas = new Intent(this, categoria.class);
        startActivity(btnTemas);
    }

    public void btnNuevo(View v) {
        Intent btnNuevo = new Intent(this, nuevo.class);
        startActivity(btnNuevo);
    }
}
