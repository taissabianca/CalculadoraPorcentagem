package com.example.aluno.calculadoraporcentagem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText valor1;
    private EditText valor2;
    private TextView resultado;
    private Button calcular;
    private Button limpar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        valor1 = (EditText) findViewById(R.id.valor1);
        valor2 = (EditText) findViewById(R.id.valor2);
        calcular = (Button) findViewById(R.id.calcular);
        limpar = (Button) findViewById(R.id.limpar);
        resultado = (TextView) findViewById(R.id.resultado);

        calcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    // Busca o valor digitado como String e converte pra Double
                    Double v1 = Double.parseDouble(valor1.getText().toString());
                    Double v2 = Double.parseDouble(valor2.getText().toString());

                    //fazendo a conta do botão mais
                    Double total = (v1*v2)/100;

                    resultado.setText(""+total);
                    Toast.makeText(MainActivity.this, "Concluido", Toast.LENGTH_LONG).show();
                } catch (Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();
                }
            }
        });

        limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try{

                    valor1.setText("");
                    valor2.setText("");

                    resultado.setText("");

                    Toast.makeText(MainActivity.this, "Apagado!", Toast.LENGTH_LONG).show();

                }catch(Exception E){
                    Toast.makeText(MainActivity.this, "Houve um erro! Tente novamente!", Toast.LENGTH_LONG).show();

                }
            }
        });
    }
}
