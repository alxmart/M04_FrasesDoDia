package com.luizafmartinez.m04_frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "Only easy day was yesterday.",
            "Missão dada é missão cumprida.",
            "Qual é Curió, vai cantar o que pra nós?"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void gerarFrase(View view) {

        TextView texto = findViewById(R.id.textResultado);

        int numeroAleatorio = new Random().nextInt(3);

        texto.setText(frases[numeroAleatorio]);
    }

    public void exibirTodas(View view) {

        TextView texto = findViewById(R.id.textResultado);

        String textoResultado = "";

        for ( String frase: frases) {
            textoResultado = textoResultado + frase + "\n";
        }
        texto.setText(textoResultado);
    }

}