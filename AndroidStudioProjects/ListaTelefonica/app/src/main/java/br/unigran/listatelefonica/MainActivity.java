package br.unigran.listatelefonica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    EditText nome;
    EditText telefone;
    EditText datanasc;
    ListView listagem;
    List<Contatos> dados;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nome = findViewById(R.id.id_nome);
        telefone = findViewById(R.id.id_telefone);
        datanasc = findViewById(R.id.id_data_nasc);
        listagem = findViewById(R.id.id_list);
        dados = new ArrayList();


    }
}