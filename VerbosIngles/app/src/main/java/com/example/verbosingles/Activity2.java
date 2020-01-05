package com.example.verbosingles;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.verbosingles.javabean.IrregularVerb;
import com.example.verbosingles.javabean.ListIrregularVerbs;

import java.util.ArrayList;
import java.util.Random;

public class Activity2 extends AppCompatActivity {
    TextView tvVerbEspa;
    EditText etInfini;
    EditText etPast;
    EditText etPartic;
    TextView tvVerificar;
    Button btnSiguiente;
    Button btnFin;
    Button btnCompro;
    Button btnLimpiar;
    private int numInt;
    private int numAciertos;
    private int numFallos;
    private ArrayList<IrregularVerb> listaVerbos;
    private int numAlea;
    static final String NUM_ACIERTOS = "aciertos";
    static final String NUM_FALLOS = "fallos";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);
        tvVerbEspa = findViewById(R.id.tv_verbo_spa);
        etInfini = findViewById(R.id.etv_infin);
        etPast = findViewById(R.id.etv_pas);
        etPartic = findViewById(R.id.etv_partic);
        tvVerificar = findViewById(R.id.tv_verifi);
        btnSiguiente = findViewById(R.id.btn_siguiente);
        btnFin = findViewById(R.id.btn_fin);
        btnCompro = findViewById(R.id.btn_compro);
        btnLimpiar = findViewById(R.id.btn_limpiar);
        numInt = getIntent().getIntExtra(MainActivity.NUM_INTEN, 0);
        numAciertos =0;
        numFallos = 0;
        listaVerbos = new ArrayList<IrregularVerb>();
        ListIrregularVerbs verbos = new ListIrregularVerbs();
        verbos.insertarVerbos();
        listaVerbos = verbos.getListaVerbos();
        numAlea = new Random().nextInt(50);
        tvVerbEspa.setText(listaVerbos.get(numAlea).getSpanish());
    }

    public void comprobar(View view) {
        String vIntInf = etInfini.getText().toString().trim();
        String vIntPas = etPast.getText().toString().trim();
        String vIntPart = etPartic.getText().toString().trim();
        IrregularVerb verboAlea = listaVerbos.get(numAlea);
        if (vIntInf.equalsIgnoreCase(verboAlea.getBaseForm()) & vIntPas.equalsIgnoreCase(verboAlea.getPastSimple())
                & vIntPart.equalsIgnoreCase(verboAlea.getPastParticiple())){
            numAciertos++;
            tvVerificar.setText(R.string.msg_acierto);
        } else {
            numFallos++;
            if (!vIntInf.equalsIgnoreCase(verboAlea.getBaseForm())) {
                etInfini.setText(vIntInf + " " + verboAlea.getBaseForm().toUpperCase());
            }
            if (!vIntPas.equalsIgnoreCase(verboAlea.getPastSimple())) {
                etPast.setText(vIntPas + " " + verboAlea.getPastSimple().toUpperCase());
            }
            if (!vIntPart.equalsIgnoreCase(verboAlea.getPastParticiple())) {
                etPartic.setText(vIntPart + " " + verboAlea.getPastParticiple().toUpperCase());
            }
            tvVerificar.setText(R.string.msg_error);

        }
        if (numInt > (numAciertos + numFallos)){
            btnSiguiente.setVisibility(View.VISIBLE);
            btnSiguiente.setEnabled(true);
        } else {
            btnFin.setVisibility(View.VISIBLE);
            btnFin.setEnabled(true);
        }
        btnCompro.setEnabled(false);
        btnLimpiar.setEnabled(false);
    }

    public void limpiar(View view) {
        etInfini.setText("");
        etPast.setText("");
        etPartic.setText("");
        tvVerificar.setText("");
    }

    public void siguiente(View view) {
        ArrayList<Integer> numYaUsados = new ArrayList<Integer>();
        numYaUsados.add(numAlea);
        do {
            numAlea = new Random().nextInt(50);
        } while (numYaUsados.contains(numAlea));

        tvVerbEspa.setText(listaVerbos.get(numAlea).getSpanish());
        etInfini.setText("");
        etPast.setText("");
        etPartic.setText("");
        btnCompro.setEnabled(true);
        btnLimpiar.setEnabled(true);
        tvVerificar.setText("");
        btnSiguiente.setVisibility(View.INVISIBLE);
        btnSiguiente.setEnabled(false);
    }

    public void fin(View view) {
        Intent i = new Intent();
        i.putExtra(NUM_ACIERTOS, numAciertos);
        i.putExtra(NUM_FALLOS, numFallos);
        setResult(RESULT_OK, i);
        finish();
    }
}
