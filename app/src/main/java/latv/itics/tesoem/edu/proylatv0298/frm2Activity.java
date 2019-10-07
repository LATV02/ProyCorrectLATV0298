package latv.itics.tesoem.edu.proylatv0298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm2);
    }

    public void historia(View view){
        Intent historia = new Intent(this,frm3Activity.class);
        startActivity(historia);
    }

    public void ditribuciones(View view){
        Intent distribuciones = new Intent(this,frm4Activity.class);
        startActivity(distribuciones);
    }

    public void etimologia (View view){
        Intent etimologia = new Intent(this,frm5Activity.class);
        startActivity(etimologia);
    }

    public void patrocinio (View view){
        Intent patrocinio = new Intent(this,frm6Activity.class);
        startActivity(patrocinio);
    }
    public void cuota (View view) {
        Intent cuota = new Intent(this, frm7Activity.class);
        startActivity(cuota);
    }

    public void aplicacion (View view) {
        Intent aplicacion = new Intent(this, frm8Activity.class);
        startActivity(aplicacion);
    }

    public void implantacion (View view) {
        Intent implantacion = new Intent(this, frm9Activity.class);
        startActivity(implantacion);
    }

    public void entorno (View view) {
        Intent entorno = new Intent(this, frm10Activity.class);
        startActivity(entorno);
    }
}

