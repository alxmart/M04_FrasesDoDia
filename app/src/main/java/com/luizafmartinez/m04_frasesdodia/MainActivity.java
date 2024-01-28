package com.luizafmartinez.m04_frasesdodia;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

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

    }

    public void exibirTodas(View view) {

        for ( String frase: frases) {
            System.out.println(frase);
        }

    }


}