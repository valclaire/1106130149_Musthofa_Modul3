package com.example.musthofakamal.mineralwater;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class DetailActivity extends AppCompatActivity {
    int count = 0;
    int angka, number;
    int counts = 6;
    TextView title, about, level;
    ImageView logo, status, plus, minus;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        getSupportActionBar().hide();
        Bundle extras = getIntent().getExtras();
        if (extras == null) {
            return;
        }
        title = (TextView) findViewById(R.id.title);
        about = (TextView) findViewById(R.id.about);
        logo = (ImageView) findViewById(R.id.image_d);

        int image = extras.getInt("image");
        String titles = getIntent().getExtras().getString("nama");
        String abouts = getIntent().getExtras().getString("komposisi");

        logo.setImageResource(image);
        title.setText(titles);
        about.setText(abouts);
        Toast.makeText(DetailActivity.this, "Air Sedikit", Toast.LENGTH_LONG).show();

        status = (ImageView) findViewById(R.id.status);
        plus = (ImageView) findViewById(R.id.plus);
        minus = (ImageView) findViewById(R.id.minus);
        level = (TextView) findViewById(R.id.satuan);
        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.plus:
                        status.setImageLevel(count);
                        count++;
                        angka = count;
                        final String hasil = String.valueOf(angka);
                        level.setText(hasil);
                        if (count >= 7) {
                            count = 6;
                            Toast.makeText(DetailActivity.this, "Air Sudah Full", Toast.LENGTH_LONG).show();
                            count = 1;
                        }
                        break;
                    default:
                        break;
                }
            }
        });
        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (view.getId()) {
                    case R.id.minus:
                        status.setImageLevel(counts);
                        counts--;
                        number = counts;
                        final String hasil = String.valueOf(number);
                        level.setText(hasil);
                        if (counts < 1) {
                            counts = 0;
                            Toast.makeText(DetailActivity.this, "Air Sedikit", Toast.LENGTH_LONG).show();
                            counts = 6;
                        }

                        break;

                    default:
                        break;

                }
            }
        });
    }
}

