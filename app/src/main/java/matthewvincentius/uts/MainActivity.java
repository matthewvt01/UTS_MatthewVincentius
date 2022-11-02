package matthewvincentius.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
private EditText et_nama, et_nomor;
private CheckBox cb_fb, cb_ig, cb_web;
private Button btn_daftar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_nama = findViewById(R.id.et_nama);
        et_nomor = findViewById(R.id.et_nomor);
        cb_fb = findViewById(R.id.cb_fb);
        cb_ig = findViewById(R.id.cb_ig);
        cb_web = findViewById(R.id.cb_web);

        btn_daftar = findViewById(R.id.btn_daftar);
        btn_daftar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String nama, nomor;
                String facebook, instagram, website;

                nama = et_nama.getText().toString();
                nomor = et_nomor.getText().toString();
                facebook = cb_fb.getText().toString();
                instagram = cb_ig.getText().toString();
                website = cb_web.getText().toString();


                if (nama.trim().equals("")){
                    et_nama.setError("Wajib Isi Nama!");
                }
                else if (nomor.trim().equals("")){
                    et_nomor.setError(("Nomor Pendaftaran Wajib Diisi!"));
                }
                else if (!cb_fb.isChecked()&&!cb_ig.isChecked()&&!cb_web.isChecked()){
                    Toast.makeText(getApplicationContext(), "Pilih Salah Satu Sumber Informasi!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent intent = new Intent(MainActivity.this, UTS.class);
                    intent.putExtra("varNama", nama);
                    intent.putExtra("varNomor", nomor);
                    intent.putExtra("varFb", facebook);
                    intent.putExtra("varIg", instagram);
                    intent.putExtra("varWeb", website);
                    startActivity(intent);
                }

            }
        });

    }
}