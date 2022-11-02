package matthewvincentius.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.TextView;

public class UTS extends AppCompatActivity {
    private TextView tv_nama, tv_nomor;
    private CheckBox cb_fb, cb_ig, cb_web;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);

        tv_nama = findViewById(R.id.tv_nama);
        tv_nomor = findViewById(R.id.tv_nomor);

        cb_fb = findViewById(R.id.cb_fb);
        cb_ig = findViewById(R.id.cb_ig);
        cb_web = findViewById(R.id.cb_web);

        Intent intent = getIntent();
        tv_nama.setText(intent.getStringExtra("varNama"));
        tv_nomor.setText(intent.getStringExtra("varNomor"));
        cb_ig.setText(intent.getStringExtra("varIg"));
        cb_fb.setText(intent.getStringExtra("varFb"));
        cb_web.setText(intent.getStringExtra("varWeb"));

    }
}