package com.example.verbosingles;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etNom;
    EditText numInt;
    TextView resul;
    static final String NUM_INTEN = "num de intentos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etNom = findViewById(R.id.et_nom);
        numInt = findViewById(R.id.et_num_int);
        resul = findViewById(R.id.tv_resul);
    }

    public void acceder(View view) {
        int intentos;
        if (etNom.getText().toString().isEmpty() | numInt.getText().toString().isEmpty()){
            Toast.makeText(this, R.string.toast_rellenar, Toast.LENGTH_SHORT).show();
        } else {
            intentos = Integer.parseInt(numInt.getText().toString());
            Intent i = new Intent(this, Activity2.class);
            i.putExtra(NUM_INTEN, intentos);
            startActivityForResult(i, 1);
        }
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        if (resultCode == RESULT_OK) {
            int aciertos = data.getIntExtra(Activity2.NUM_ACIERTOS, 1);
            int fallos = data.getIntExtra(Activity2.NUM_FALLOS, 1);
            resul.setText(String.format(getString(R.string.aciertos_fallos), aciertos, fallos));
        }
    }
}
