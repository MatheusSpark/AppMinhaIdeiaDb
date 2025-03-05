package devandroid.matheus.appminhaideiadb.view;

import android.content.Context;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import devandroid.matheus.appminhaideiadb.R;
import devandroid.matheus.appminhaideiadb.controller.ClienteController;
import devandroid.matheus.appminhaideiadb.controller.ProdutoController;
import devandroid.matheus.appminhaideiadb.model.Cliente;
import devandroid.matheus.appminhaideiadb.model.Produto;

public class MainActivity extends AppCompatActivity {
    Cliente cliente;
    Produto produto;
    ClienteController clienteController;
    ProdutoController produtoController;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cliente = new Cliente();
        produto = new Produto();
        clienteController = new ClienteController(getApplicationContext());
        produtoController = new ProdutoController(getApplicationContext());
    }
}