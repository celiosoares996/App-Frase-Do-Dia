package com.example.appfrasedodia;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

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

    public void gerarNovaFrase(View view){
        String[] frases = {
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "Nem todos os dias são bons, mas há algo bom em cada dia.",
                "O otimismo é a fé em ação. Nada se pode levar a efeito sem otimismo.",
                "Não deixe nada nem ninguém estragar o seu bom humor"
        };

        int numero = new Random().nextInt(4);

        TextView texto = findViewById(R.id.textResultado);
        texto.setText(frases[numero]);
    }
}