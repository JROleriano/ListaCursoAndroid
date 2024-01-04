package oleriano.jose.listacurso.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import oleriano.jose.listacurso.R;
import oleriano.jose.listacurso.model.Pessoa;

public class MainActivity extends AppCompatActivity {

    Pessoa pessoa;
    Pessoa outraPessoa;

    String dadosPessoa;

    String dadosOutraPessoa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        pessoa = new Pessoa();
        pessoa.setPrimeiroNome("José Roberto");
        pessoa.setSobreNome("Oleriano");
        pessoa.setNomeCurso("Android");
        pessoa.setTelefoneContato("44-999999999");

        outraPessoa = new Pessoa();
        outraPessoa.setPrimeiroNome("Ana Jessica");
        outraPessoa.setSobreNome("Costa");
        pessoa.setNomeCurso("Android");
        pessoa.setTelefoneContato("44-999999998");

        dadosPessoa = "Primeiro Nome: ";
        dadosPessoa += pessoa.getPrimeiroNome();
        dadosPessoa += "Sobrenome: ";
        dadosPessoa += pessoa.getSobreNome();
        dadosPessoa += "Nome do Curso: ";
        dadosPessoa += pessoa.getNomeCurso();
        dadosPessoa += "Telefone de Contato: ";
        dadosPessoa += pessoa.getTelefoneContato();

        dadosOutraPessoa = "Primeiro Nome: ";
        dadosOutraPessoa += outraPessoa.getPrimeiroNome();
        dadosOutraPessoa += "Sobrenome: ";
        dadosOutraPessoa += outraPessoa.getSobreNome();
        dadosOutraPessoa += "Nome do Curso: ";
        dadosOutraPessoa += outraPessoa.getNomeCurso();
        dadosOutraPessoa += "Telefone de Contato: ";
        dadosOutraPessoa += outraPessoa.getTelefoneContato();


        Log.i("POOAndroid", "Object pessoa: "+ pessoa.toString());
        Log.i("POOAndroid", "Object outraPessoa: "+ outraPessoa.toString());

    }
}