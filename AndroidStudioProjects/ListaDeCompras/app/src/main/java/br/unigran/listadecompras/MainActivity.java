package br.unigran.listadecompras;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    EditText Nome;
    EditText Marca;
    EditText Quant;
    ArrayList Dados;
    ListView Listagem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Nome = findViewById(R.id.id_nome);
        Marca = findViewById(R.id.id_marca);
        Quant = findViewById(R.id.id_quant);
        Dados = new ArrayList();
        ArrayAdapter adapter = new ArrayAdapter(this, androidx.appcompat.R.layout.support_simple_spinner_dropdown_item, Dados);
        Listagem.setAdapter(adapter);
    }

    public void salvar (View view){
        ListaCompra listacompra = new ListaCompra();
        listacompra.setNome(Nome.getText().toString());
        listacompra.setMarca (Marca.getText().toString());
        listacompra.setQuant (Quant.getText().toString());
        Dados.add(listacompra);
        Toast.makeText(this, "Salvo com Sucesso!!", Toast.LENGTH_SHORT).show();
    }
}