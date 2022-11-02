package matthewvincentius.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

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

            }
        });

    }
}