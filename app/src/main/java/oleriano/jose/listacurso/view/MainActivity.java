package oleriano.jose.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import oleriano.jose.listacurso.R;
import oleriano.jose.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("José Roberto");
        pessoa.setSobreNome("Oleriano");
        pessoa.setNomeCurso("Android");
        pessoa.setTelefoneContato("44-999999999");
    }
}