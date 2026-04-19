package com.frases.frasesdodia;

import android.os.Bundle;
import android.view.SoundEffectConstants;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    String[] frases = {
            "A tecnologia está evoluindo mais rápido do que a capacidade humana.Thomas Friedman",
            "O verdadeiro problema não é se as máquinas pensam, mas se os humanos o fazem.B. F. Skinner",
            "As únicas grandes companhias que conseguirão ter êxito são aquelas que consideram os seus produtos obsoletos antes que os outros o façam.Bill Gates",
            "Meus filhos terão computadores, sim, mas antes terão livros. Sem livros, sem leitura, os nossos filhos serão incapazes de escrever – inclusive a sua própria história.Bill Gates",
    };



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });


    }

    public void exibirTodas(View view){

        TextView texto = findViewById(R.id.textFrase);
        String textoResultado = "";
        for(String frase: frases){
            textoResultado = textoResultado + frase + "\n";
        }

        texto.setText(textoResultado);


    }

   public void gerarFrasesAleatoria(View view){

        int numeroAleatorio = new Random().nextInt(4);
        TextView texto = findViewById(R.id.textFrase);
        texto.setText(frases[numeroAleatorio]);
    }


}