package devandroid.matheus.appminhaideiadb.datasource;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import devandroid.matheus.appminhaideiadb.api.AppUtil;

public class AppDataBase extends SQLiteOpenHelper {
    private static final String DB_NAME = "AppMinhaIdeiaDb";
    public static final int DB_VERSION = 1;
    public AppDataBase(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
        Log.i(AppUtil.TAG, "AppDataBase: Criado");
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
