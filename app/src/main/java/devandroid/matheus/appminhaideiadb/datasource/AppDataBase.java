package devandroid.matheus.appminhaideiadb.datasource;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import devandroid.matheus.appminhaideiadb.api.AppUtil;
import devandroid.matheus.appminhaideiadb.datamodel.ClienteDataModel;
import devandroid.matheus.appminhaideiadb.datamodel.ProdutoDataModel;

public class AppDataBase extends SQLiteOpenHelper {
    private static final String DB_NAME = "AppMinhaIdeiaDb";
    public static final int DB_VERSION = 1;
    SQLiteDatabase db;

    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.i(AppUtil.TAG, "AppDataBase: Criado");
        db = getWritableDatabase();
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(ClienteDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Cliente" + ClienteDataModel.criarTabela());
        db.execSQL(ProdutoDataModel.criarTabela());
        Log.d(AppUtil.TAG, "onCreate: Tabela Produto" + ClienteDataModel.criarTabela());
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
    }

    public boolean insert(String tabela, ContentValues dados) {
        db = getWritableDatabase();
        boolean retorno = false;
        try {
            retorno = db.insert(tabela, null, dados) > 0;
        } catch (Exception e) {
            Log.e(AppUtil.TAG, "insert: " + e.getMessage());
        }
        return retorno;
    }
}
