package devandroid.matheus.appminhaideiadb.controller;

import android.content.ContentValues;
import android.content.Context;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import devandroid.matheus.appminhaideiadb.api.AppUtil;
import devandroid.matheus.appminhaideiadb.datamodel.ClienteDataModel;
import devandroid.matheus.appminhaideiadb.datasource.AppDataBase;
import devandroid.matheus.appminhaideiadb.model.Cliente;

public class ClienteController extends AppDataBase implements ICrud<Cliente> {
    ContentValues dadosDoObjeto;

    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
    @Override
    public boolean incluir(Cliente obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadosDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());
        //Enviando os dados para a classe AppDataBase
        return insert(ClienteDataModel.TABELA, dadosDoObjeto);
    }
    @Override
    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<>();
        return lista;
    }

    @Override
    public boolean alterar(Cliente obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ClienteDataModel.ID, obj.getId());
        dadosDoObjeto.put(ClienteDataModel.NOME, obj.getNome());
        dadosDoObjeto.put(ClienteDataModel.EMAIL, obj.getEmail());
        //Enviando os dados para a classe AppDataBase
        return true;
    }

    @Override
    public boolean deletar(Cliente obj) {
        dadosDoObjeto = new ContentValues();
        //Key, valor
        dadosDoObjeto.put(ClienteDataModel.ID, obj.getId());
        //Enviando os dados para a classe AppDataBase
        return true;
    }
}
