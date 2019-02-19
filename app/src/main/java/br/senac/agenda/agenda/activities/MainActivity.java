package br.senac.agenda.agenda.activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.List;

import br.senac.agenda.agenda.R;
import br.senac.agenda.agenda.dao.ContactDAO;
import br.senac.agenda.agenda.model.ContactsEntity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView list = findViewById(R.id.listContactsListView);

        ContactDAO contactDAO= new ContactDAO(this);
        List<ContactsEntity> contacts = contactDAO.list();

        ArrayAdapter<ContactsEntity> adapter = new ArrayAdapter<ContactsEntity>(this, android.R.layout.simple_list_item_1, contacts);

        list.setAdapter(adapter);

        Button newContact = findViewById(R.id.newContactButton);

        newContact.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contact = new Intent(MainActivity.this, ContatosActivity.class);
                startActivity(contact);
            }
        });
    }
}
