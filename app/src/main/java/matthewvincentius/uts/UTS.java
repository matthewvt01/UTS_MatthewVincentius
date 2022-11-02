package matthewvincentius.uts;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CheckedTextView;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class UTS extends AppCompatActivity {
    private TextView tv_nama, tv_nomor;
    private CheckedTextView ctv_fb, ctv_ig, ctv_web;
    private Button btn_back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uts);

        tv_nama = findViewById(R.id.tv_nama);
        tv_nomor = findViewById(R.id.tv_nomor);
        ctv_fb = findViewById(R.id.ctv_fb);
        ctv_ig = findViewById(R.id.ctv_ig);
        ctv_web = findViewById(R.id.ctv_web);
        btn_back = findViewById(R.id.btn_back);

        Intent intent = getIntent();
        tv_nama.setText(intent.getStringExtra("varNama"));
        tv_nomor.setText(intent.getStringExtra("varNomor"));
        ctv_fb.setText(intent.getStringExtra("varFb"));
        ctv_ig.setText(intent.getStringExtra("varIg"));
        ctv_web.setText(intent.getStringExtra("varWeb"));
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(UTS.this, MainActivity.class);
                startActivity(intent1);
            }
        });


    }

}