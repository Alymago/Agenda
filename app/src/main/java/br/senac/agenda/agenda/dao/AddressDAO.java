package br.senac.agenda.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

import br.senac.agenda.agenda.model.AddressEntity;
import br.senac.agenda.agenda.model.ContactsEntity;

public class AddressDAO {

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;

    public AddressDAO(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }

    public void save (AddressEntity address){
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("EMAIL", address.getEmail());
        values.put("STREET", address.getStreet());
        values.put("NUMBER", address.getNumber());
        values.put("CITY_STATE", address.getCityState());

        sqLiteDatabase.insert("ADDRESS", null, values);

        sqLiteDatabase.close();
    }

    public List<AddressEntity> list(){
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();

        String sql = "SELECT * FROM ADDRESS;";

        List<ContactsEntity> address = new ArrayList<>();
        Cursor c = sqLiteDatabase.rawQuery(sql,null );

        while (c.moveToNext()){
            AddressEntity address = new AddressEntity();

            address.setEmail(c.getString(c.getColumnIndex("NAME")));
            address.setStreet(c.getString(c.getColumnIndex("PHONE")));
            address.setNumber(c.getDouble(c.getColumnIndex("PUNCTUATION")));
            address.setCityState(address);
        }
        return address;
    }
}
