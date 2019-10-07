package latv.itics.tesoem.edu.proylatv0298;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class frm9Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm9);
    }
    public void regresar(View view) {
        Intent regresar = new Intent(this, frm2Activity.class);
        startActivity(regresar);
    }
}
