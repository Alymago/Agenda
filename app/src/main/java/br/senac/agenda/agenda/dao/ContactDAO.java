package br.senac.agenda.agenda.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.util.ArrayList;
import java.util.List;

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
        values.put("PUNCTUATION", contact.getPunctuation());

        sqLiteDatabase.insert("CONTACT", null, values);

        sqLiteDatabase.close();
    }

    public List<ContactsEntity> list(){
        sqLiteDatabase = sqLiteHelper.getReadableDatabase();

        String sql = "SELECT * FROM CONTACT;";

        List<ContactsEntity> contacts = new ArrayList<>();
        Cursor c = sqLiteDatabase.rawQuery(sql,null );

        while (c.moveToNext()){
            ContactsEntity contact = new ContactsEntity();

            contact.setId(c.getInt(c.getColumnIndex("ID")));
            contact.setName(c.getString(c.getColumnIndex("NAME")));
            contact.setPhone(c.getString(c.getColumnIndex("PHONE")));
            contact.setPunctuation(c.getDouble(c.getColumnIndex("PUNCTUATION")));
            contacts.add(contact);
        }
        return contacts;
    }
}
