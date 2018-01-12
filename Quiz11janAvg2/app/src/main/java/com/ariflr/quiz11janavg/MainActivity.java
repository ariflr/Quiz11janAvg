package com.ariflr.quiz11janavg;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    EditText etMtk;
    EditText etBahasa;
    EditText etKejuruan;
    EditText etInggris;
    Button btnSubmit;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etMtk = (EditText)findViewById(R.id.etMtk);
        etBahasa = (EditText)findViewById(R.id.etBahasa);
        etInggris = (EditText) findViewById(R.id.etInggris);
        etKejuruan = (EditText) findViewById(R.id.etKejuruan);
        txtHasil = (TextView) findViewById(R.id.txtHasil);
        btnSubmit = (Button) findViewById(R.id.btnSubmit);

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String bahasa = etBahasa.getText().toString();
                String inggris = etInggris.getText().toString();
                String mtk = etMtk.getText().toString();
                String kejuruan = etKejuruan.getText().toString();

//checking if edit text is empty
//condition if length is empty
                if(bahasa.isEmpty()){
                    //give error warning
                    etBahasa.setError("Tidak Boleh Kosong");
                }else if (kejuruan.isEmpty()){
                    etKejuruan.setError("Tidak Boleh Kosong");
                }else if (mtk.isEmpty()){
                    etMtk.setError("Tidak Boleh Kosong");
                }else if (inggris.isEmpty()){
                    etInggris.setError("Tidak Boleh Kosong");
                }else {

                    //change value from string to int
                    int ainggris = Integer.parseInt(inggris);
                    int aindo = Integer.parseInt(bahasa);
                    int akomputer = Integer.parseInt(kejuruan);
                    int amatematika = Integer.parseInt(mtk);

                    //condition if length & width isnt empty
                    int ratarata = (aindo + ainggris + akomputer + amatematika) / 4;

                    if ((ratarata >= 0 ) && (ratarata <= 40)){
                        txtHasil.setText("Rata Rata Anda Nilai D : " + ratarata);

                    }else if ((ratarata >= 41 ) && (ratarata <= 65)){
                        txtHasil.setText("Rata Rata Anda Nilai C : " + ratarata);
                    } else if ((ratarata >= 66 ) && (ratarata <= 80)){
                    txtHasil.setText("Rata Rata Anda Nilai B : " + ratarata);
                    }else if ((ratarata >= 81 ) && (ratarata <= 100)){
                        txtHasil.setText("Rata Rata Anda Nilai A : " + ratarata);
                    }else if (ratarata >= 100){
                        txtHasil.setText("Your Average IS OverLoad :D");
                    }

}
            }
        });


    }
}
