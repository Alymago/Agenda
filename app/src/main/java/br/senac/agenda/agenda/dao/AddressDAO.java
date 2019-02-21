package br.senac.agenda.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.senac.agenda.agenda.model.AddressEntity;


public class AddressDAO {

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;

    public AddressDAO(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }

    public void save(AddressEntity address) {
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("STREET", address.getStreet());
        values.put("NUMBER", address.getNumber());
        values.put("CITY_STATE", address.getCityState());

        sqLiteDatabase.insert("ADDRESS", null, values);

        sqLiteDatabase.close();
    }
}
