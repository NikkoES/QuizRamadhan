package com.example.nikkoekasaputra.quizramadhan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.widget.TextView;
import android.view.View;

public class HasilActivity extends AppCompatActivity {

    TextView no1, no2, no3, no4, no5, no6, no7, no8, no9, no10;
    TextView jb1, jb2, jb3, jb4, jb5, jb6, jb7, jb8, jb9, jb10;
    TextView tvNilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hasil);

        Intent intent = getIntent();

        //Deklarasi dan Insialisasi Soal
        no1 = (TextView) findViewById(R.id.soalNo1);
        no2 = (TextView) findViewById(R.id.soalNo2);
        no3 = (TextView) findViewById(R.id.soalNo3);
        no4 = (TextView) findViewById(R.id.soalNo4);
        no5 = (TextView) findViewById(R.id.soalNo5);
        no6 = (TextView) findViewById(R.id.soalNo6);
        no7 = (TextView) findViewById(R.id.soalNo7);
        no8 = (TextView) findViewById(R.id.soalNo8);
        no9 = (TextView) findViewById(R.id.soalNo9);
        no10 = (TextView) findViewById(R.id.soalNo10);

        jb1 = (TextView) findViewById(R.id.jwb1);
        jb2 = (TextView) findViewById(R.id.jwb2);
        jb3 = (TextView) findViewById(R.id.jwb3);
        jb4 = (TextView) findViewById(R.id.jwb4);
        jb5 = (TextView) findViewById(R.id.jwb5);
        jb6 = (TextView) findViewById(R.id.jwb6);
        jb7 = (TextView) findViewById(R.id.jwb7);
        jb8 = (TextView) findViewById(R.id.jwb8);
        jb9 = (TextView) findViewById(R.id.jwb9);
        jb10 = (TextView) findViewById(R.id.jwb10);

        tvNilai = (TextView) findViewById(R.id.nilai);

        final String st1 = intent.getStringExtra("no1");
        final String st2 = intent.getStringExtra("no2");
        final String st3 = intent.getStringExtra("no3");
        final String st4 = intent.getStringExtra("no4");
        final String st5 = intent.getStringExtra("no5");
        final String st6 = intent.getStringExtra("no6");
        final String st7 = intent.getStringExtra("no7");
        final String st8 = intent.getStringExtra("no8");
        final String st9 = intent.getStringExtra("no9");
        final String st10 = intent.getStringExtra("no10");

        final String nilai = intent.getStringExtra("nilai");

        final String jwb1 = intent.getStringExtra("j1");
        final String jwb2 = intent.getStringExtra("j2");
        final String jwb3 = intent.getStringExtra("j3");
        final String jwb4 = intent.getStringExtra("j4");
        final String jwb5 = intent.getStringExtra("j5");
        final String jwb6 = intent.getStringExtra("j6");
        final String jwb7 = intent.getStringExtra("j7");
        final String jwb8 = intent.getStringExtra("j8");
        final String jwb9 = intent.getStringExtra("j9");
        final String jwb10 = intent.getStringExtra("j10");

        no1.setText("Bulan yang diwajibkannya umat Islam untuk menjalankan ibadah puasa adalah bulan ?");
        no2.setText("Siapakah Malaikat yang bertugas untuk menyampaikan wahyu dari Allah kepada Rasul-Nya ?");
        no3.setText("Berikut adalah Akhlak Terpuji yang harus dimiliki oleh umat Islam...");
        no4.setText("Yatsrib adalah nama lain dari kota ?");
        no5.setText("Lafadz 'Subhanallah' sering disebut bacaan ?");
        no6.setText("Berikut adalah nama-nama Surga...");
        no7.setText("Berapakah jumlah Nabi dan Rasul yang wajib kita imani ?");
        no8.setText("Berikut adalah sifat wajib bagi Rasul, kecuali ?");
        no9.setText("Berikut adalah golongan orang yang boleh menerima zakat...");
        no10.setText("Budak yang dimerdekakan Abu Bakar dan menjadi muazin pada zaman Rasulullah bernama ?");

        tvNilai.setText(nilai);

        jb1.setText("Jawaban : "+st1+"\n"+"("+jwb1+")");
        jb2.setText("Jawaban : "+st2+"\n"+"("+jwb2+")");
        jb3.setText("Jawaban : "+st3+"\n"+"("+jwb3+")");
        jb4.setText("Jawaban : "+st4+"\n"+"("+jwb4+")");
        jb5.setText("Jawaban : "+st5+"\n"+"("+jwb5+")");
        jb6.setText("Jawaban : "+st6+"\n"+"("+jwb6+")");
        jb7.setText("Jawaban : "+st7+"\n"+"("+jwb7+")");
        jb8.setText("Jawaban : "+st8+"\n"+"("+jwb8+")");
        jb9.setText("Jawaban : "+st9+"\n"+"("+jwb9+")");
        jb10.setText("Jawaban : "+st10+"\n"+"("+jwb10+")");


    }

    public void kembali(View view){
        finish();
    }
}