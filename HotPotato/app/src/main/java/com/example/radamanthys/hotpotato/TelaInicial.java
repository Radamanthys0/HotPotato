package com.example.radamanthys.hotpotato;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TelaInicial extends AppCompatActivity {

    Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_inicial);

        start = (Button) findViewById (R.id.btnStart);

        start.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) { // chama a tela de conexao dos players

                Intent trocatela = new
                        Intent(TelaInicial.this, TelaConexaoPlayer.class);
                TelaInicial.this.startActivity(trocatela);
                TelaInicial.this.finish();

            }
        });
    }
}
