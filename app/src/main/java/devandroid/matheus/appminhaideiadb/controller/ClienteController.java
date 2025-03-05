package devandroid.matheus.appminhaideiadb.controller;

import android.content.Context;
import android.util.Log;

import devandroid.matheus.appminhaideiadb.api.AppUtil;
import devandroid.matheus.appminhaideiadb.datasource.AppDataBase;

public class ClienteController extends AppDataBase {

    public ClienteController(Context context) {
        super(context);
        Log.d(AppUtil.TAG, "ClienteController: Conectado");
    }
}
