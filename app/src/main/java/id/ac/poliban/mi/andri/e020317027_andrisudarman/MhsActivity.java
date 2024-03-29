package id.ac.poliban.mi.andri.e020317027_andrisudarman;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MhsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mhs);

        EditText etYourNim = findViewById(R.id.etNim);
        EditText etYourNama = findViewById(R.id.etNama);
        EditText etYourAlamat = findViewById(R.id.etAlamat);
        EditText etYourTelp = findViewById(R.id.etTelp);
        Button btSend = findViewById(R.id.btSend);


        btSend.setOnClickListener(v -> {
            Intent intent = new Intent();
            String dataNim = etYourNim.getText().toString();
            String dataNama = etYourNama.getText().toString();
            String dataAlamat = etYourAlamat.getText().toString();
            String dataTelp = etYourTelp.getText().toString();

            intent.putExtra("datanim", dataNim);
            intent.putExtra("datanama", dataNama);
            intent.putExtra("dataalamat", dataAlamat);
            intent.putExtra("datatelp", dataTelp);

            setResult(Activity.RESULT_OK, intent);
            finish();
        });
    }
}
