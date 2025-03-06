package devandroid.matheus.appminhaideiadb.view;

import android.os.Bundle;
import android.widget.Toast;
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
        cliente.setNome("Marco Maddo");
        cliente.setEmail("marco@teste.com");
        produto = new Produto();
        produto.setNome("Notebook");
        produto.setFornecedor("Asus");
        clienteController = new ClienteController(getApplicationContext());
        produtoController = new ProdutoController(getApplicationContext());

        if (clienteController.incluir(cliente)) {
            Toast.makeText(MainActivity.this, "Cliente " + cliente.getNome() + " adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Erro ao incluir cliente: " + cliente.getNome(), Toast.LENGTH_SHORT).show();
        }
        if (produtoController.incluir(produto)) {
            Toast.makeText(MainActivity.this, "Produto " + produto.getNome() + " adicionado com sucesso!", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "Erro ao incluir cliente: " + cliente.getNome(), Toast.LENGTH_SHORT).show();
        }
    }
}