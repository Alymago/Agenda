package br.senac.agenda.agenda;

import android.media.Rating;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Toast;

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
                EditText phoneEditText = findViewById(R.id.editNumberText);
                EditText emailEditText = findViewById(R.id.editEmail);

                RatingBar punctuationRatingBar = findViewById(R.id.punctuationRatingBar);

                String name = nameEditText.getText().toString();
                String phone = phoneEditText.getText().toString();
                String email = emailEditText.getText().toString();
                String punctuation = String.valueOf(punctuationRatingBar.getRating());

                Toast.makeText(ContatosActivity.this, "Contact Save! Name: " + name + " - Tel: " + phone + " - E-mail: " + email + " - Punctuation: " + punctuation, Toast.LENGTH_SHORT).show();
                finish();
            }
        });
    }
}
