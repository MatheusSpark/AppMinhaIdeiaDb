package devandroid.matheus.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import java.util.ArrayList;
import java.util.List;
import devandroid.matheus.appminhaideiadb.datamodel.ProdutoDataModel;
import devandroid.matheus.appminhaideiadb.datasource.AppDataBase;
import devandroid.matheus.appminhaideiadb.model.Produto;

public class ProdutoController extends AppDataBase implements ICrud<Produto> {
    ContentValues dadosDoObjeto;
    public ProdutoController(Context context) {
        super(context);
    }

    @Override
    public boolean incluir(Produto obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadosDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());
        //Enviando os dados para a classe AppDataBase
        return insert(ProdutoDataModel.TABELA, dadosDoObjeto);
    }

    @Override
    public List<Produto> listar() {
        List<Produto> lista = new ArrayList<>();
        return lista;
    }
    @Override
    public boolean alterar(Produto obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        dadosDoObjeto.put(ProdutoDataModel.NOME, obj.getNome());
        dadosDoObjeto.put(ProdutoDataModel.FORNECEDOR, obj.getFornecedor());
        //Enviando os dados para a classe AppDataBase
        return true;
    }

    @Override
    public boolean deletar(Produto obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ProdutoDataModel.ID, obj.getId());
        //Enviando os dados para a classe AppDataBase
        return true;
    }
}
