package br.senac.agenda.agenda.dao;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class SQLiteHelper extends SQLiteOpenHelper {

    private static final String DB_NAME = "agenda.senac.db";

    private static final Integer DB_VERSION = 1;

    private final String DB_CREATE = "CREATE TABLE CONTACT (" +
            "ID INTEGER PRIMARY KEY AUTOINCREMENT, " +
            "NAME TEXT, " +
            "PHONE TEXT, " +
            "EMAIL TEXT, " +
            "PUNCTUACTION REAL)";

    public SQLiteHelper(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        db.execSQL(DB_CREATE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }

}