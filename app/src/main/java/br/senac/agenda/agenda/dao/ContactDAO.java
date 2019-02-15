package br.senac.agenda.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.sqlite.SQLiteDatabase;

import br.senac.agenda.agenda.model.ContactsEntity;

public class ContactDAO {

    private SQLiteHelper sqLiteHelper;
    private SQLiteDatabase sqLiteDatabase;

    public ContactDAO(Context context) {
        this.sqLiteHelper = new SQLiteHelper(context);
    }

    public void save (ContactsEntity contact){
        sqLiteDatabase = sqLiteHelper.getWritableDatabase();

        ContentValues values = new ContentValues();
        values.put("NAME", contact.getName());
        values.put("PHONE", contact.getPhone());
        values.put("PUNCTUACTION", contact.getPontuaction());

        sqLiteDatabase.insert("CONTACT", null, values);

        sqLiteDatabase.close();
    }
}
