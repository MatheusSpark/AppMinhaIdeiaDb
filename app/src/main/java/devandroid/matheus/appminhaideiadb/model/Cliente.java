package devandroid.matheus.appminhaideiadb.model;


import android.util.Log;

import devandroid.matheus.appminhaideiadb.api.AppUtil;
import devandroid.matheus.appminhaideiadb.controller.ICrud;

//implementando a interface em uma classe
public class Cliente implements ICrud {
    private String nome;
    private String email;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public void incluir() {
        Log.i(AppUtil.TAG, "incluir Cliente");
    }

    @Override
    public void listar() {
        Log.i(AppUtil.TAG, "listar Clientes");
    }

    @Override
    public void alterar() {
        Log.i(AppUtil.TAG, "alterar Cliente");
    }

    @Override
    public void deletar() {
        Log.i(AppUtil.TAG, "excluir Cliente");
    }
}
