package br.senac.agenda.agenda.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

import br.senac.agenda.agenda.R;
import br.senac.agenda.agenda.model.AddressEntity;
import br.senac.agenda.agenda.model.ContactsEntity;

public class ContatosActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contatos);

        Button saveContactButton = findViewById(R.id.saveContactButton);

        saveContactButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText nameEditText = findViewById(R.id.editNameText);
                EditText phoneEditText = findViewById(R.id.editPhoneText);
                EditText emailEditText = findViewById(R.id.editEmailText);
                EditText streetEditText = findViewById(R.id.editStreetText);
                EditText numberEditText = findViewById(R.id.editNumberText);
                EditText cityEditText = findViewById(R.id.editCityText);


                RatingBar punctuationRatingBar = findViewById(R.id.punctuationRatingBar);

                ContactsEntity contact = new ContactsEntity(nameEditText.getText().toString(),
                        phoneEditText.getText().toString(),
                        emailEditText.getText().toString(),
                        Double.valueOf(punctuationRatingBar.getRating()));

                AddressEntity address = new AddressEntity(streetEditText.getText().toString(),
                        numberEditText.getText().toString(),
                        cityEditText.getText().toString());

                Toast.makeText(ContatosActivity.this, "Contact Save! Name: " + contact + "Address: " + address, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
