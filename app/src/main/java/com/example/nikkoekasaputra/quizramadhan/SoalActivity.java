package com.example.nikkoekasaputra.quizramadhan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public class SoalActivity extends AppCompatActivity {

    TextView no1, no2, no3, no4, no5, no6, no7, no8, no9, no10;
    String sNo1, sNo2, sNo3, sNo4, sNo5, sNo6, sNo7, sNo8, sNo9, sNo10;
    EditText jNo1, jNo4, jNo7, jNo10;
    RadioButton no2a, no2b, no2c, no5a, no5b, no5c, no8a, no8b, no8c;
    CheckBox no3a, no3b, no3c, no6a, no6b, no6c, no9a, no9b, no9c;
    String[] status = new String[10];
    int i, j, nilai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_soal);

        //Deklarasi dan Insialisasi Soal
        no1 = (TextView) findViewById(R.id.soalNo1);

        no2 = (TextView) findViewById(R.id.soalNo2);
        no2a = (RadioButton) findViewById(R.id.A2);
        no2b = (RadioButton) findViewById(R.id.B2);
        no2c = (RadioButton) findViewById(R.id.C2);

        no3 = (TextView) findViewById(R.id.soalNo3);
        no3a = (CheckBox) findViewById(R.id.A3);
        no3b = (CheckBox) findViewById(R.id.B3);
        no3c = (CheckBox) findViewById(R.id.C3);

        no4 = (TextView) findViewById(R.id.soalNo4);

        no5 = (TextView) findViewById(R.id.soalNo5);
        no5a = (RadioButton) findViewById(R.id.A5);
        no5b = (RadioButton) findViewById(R.id.B5);
        no5c = (RadioButton) findViewById(R.id.C5);

        no6 = (TextView) findViewById(R.id.soalNo6);
        no6a = (CheckBox) findViewById(R.id.A6);
        no6b = (CheckBox) findViewById(R.id.B6);
        no6c = (CheckBox) findViewById(R.id.C6);

        no7 = (TextView) findViewById(R.id.soalNo7);

        no8 = (TextView) findViewById(R.id.soalNo8);
        no8a = (RadioButton) findViewById(R.id.A8);
        no8b = (RadioButton) findViewById(R.id.B8);
        no8c = (RadioButton) findViewById(R.id.C8);

        no9 = (TextView) findViewById(R.id.soalNo9);
        no9a = (CheckBox) findViewById(R.id.A9);
        no9b = (CheckBox) findViewById(R.id.B9);
        no9c = (CheckBox) findViewById(R.id.C9);

        no10 = (TextView) findViewById(R.id.soalNo10);

        no1.setText("Bulan yang diwajibkannya umat Islam untuk menjalankan ibadah puasa adalah bulan ?");

        no2.setText("Siapakah Malaikat yang bertugas untuk menyampaikan wahyu dari Allah kepada Rasul-Nya ?");
        no2a.setText(" A. Israfil");
        no2b.setText(" B. Jibril");
        no2c.setText(" C. Ridwan");

        no3.setText("Berikut adalah Akhlak Terpuji yang harus dimiliki oleh umat Islam...");
        no3a.setText(" Iri");
        no3b.setText(" Tasamuh");
        no3c.setText(" Tawakkal");

        no4.setText("Yatsrib adalah nama lain dari kota ?");

        no5.setText("Lafadz 'Subhanallah' sering disebut bacaan ?");
        no5a.setText(" A. Tasbih");
        no5b.setText(" B. Tahmid");
        no5c.setText(" C. Takbir");

        no6.setText("Berikut adalah nama-nama Surga...");
        no6a.setText(" Fidaus");
        no6b.setText(" Wail");
        no6c.setText(" Naim");

        no7.setText("Berapakah jumlah Nabi dan Rasul yang wajib kita imani ?");

        no8.setText("Berikut adalah sifat wajib bagi Rasul, kecuali ?");
        no8a.setText(" A. Siddiq");
        no8b.setText(" B. Fathonah");
        no8c.setText(" C. Kidzib");

        no9.setText("Berikut adalah golongan orang yang boleh menerima zakat...");
        no9a.setText(" Fakir");
        no9b.setText(" Gharim");
        no9c.setText(" Yatim");

        no10.setText("Budak yang dimerdekakan Abu Bakar dan menjadi muazin pada zaman Rasulullah bernama ?");
        //------------------------------------------

        //deklarasi jawaban
        jNo1 = (EditText) findViewById(R.id.jawabNo1);
        jNo4 = (EditText) findViewById(R.id.jawabNo4);
        jNo7 = (EditText) findViewById(R.id.jawabNo7);
        jNo10 = (EditText) findViewById(R.id.jawabNo10);
        //------------------------------------------
    }

    public void selesaiJawab(View view){
        sNo1 = jNo1.getText().toString();
        if(sNo1.equalsIgnoreCase("ramadhan")){
            status[0] = "Benar";
        }
        else{
            status[0] = "Salah";
        }
        sNo1 = "Ramadhan";

        if(no2b.isChecked()){
            status[1] = "Benar";
        }
        else{
            status[1] = "Salah";
        }
        sNo2 = "Jibril";

        if(no3a.isChecked()){
            status[2] = "Salah";
        }
        else if(no3b.isChecked()&&no3c.isChecked()){
            status[2] = "Benar";
        }
        else {
            status[2] = "Salah";
        }
        sNo3 = "Tasamuh & Tawakkal";

        sNo4 = jNo4.getText().toString();
        if(sNo4.equalsIgnoreCase("madinah")){
            status[3] = "Benar";
        }
        else{
            status[3] = "Salah";
        }
        sNo4 = "Madinah";

        if(no5a.isChecked()){
            status[4] = "Benar";
        }
        else{
            status[4] = "Salah";
        }
        sNo5 = "Tasbih";

        if(no6b.isChecked()){
            status[5] = "Salah";
        }
        else if(no6a.isChecked()&&no6c.isChecked()){
            status[5] = "Benar";
        }
        else{
            status[5] = "Salah";
        }
        sNo6 = "Surga Firdaus & Naim";

        sNo7 = jNo7.getText().toString();
        if(sNo7.equalsIgnoreCase("25")){
            status[6] = "Benar";
        }
        else{
            status[6] = "Salah";
        }
        sNo7 = "25";

        if(no8c.isChecked()){
            status[7] = "Benar";
        }
        else{
            status[7] = "Salah";
        }
        sNo8 = "Kidzib";

        if(no9c.isChecked()){
            status[8] = "Salah";
        }
        else if(no9a.isChecked()&&no9b.isChecked()){
            status[8] = "Benar";
        }
        else{
            status[8] = "Salah";
        }
        sNo9 = "Fakir & Gharim";

        sNo10 = jNo10.getText().toString();
        if(sNo10.equalsIgnoreCase("Bilal bin Rabah")){
            status[9] = "Benar";
        }
        else{
            status[9] = "Salah";
        }
        sNo10 = "Bilal bin Rabah";

        j = 0;
        for(i=0;i<status.length;i++){
            if(status[i].equalsIgnoreCase("benar")){
                j++;
            }
        }
        nilai = j * 10;

        String sNilai = Integer.toString(nilai);

        Intent i = new Intent(SoalActivity.this, HasilActivity.class);

        //mengirim data ke kelas hasil (mempersiapkan)
        i.putExtra("no1", status[0]);
        i.putExtra("no2", status[1]);
        i.putExtra("no3", status[2]);
        i.putExtra("no4", status[3]);
        i.putExtra("no5", status[4]);
        i.putExtra("no6", status[5]);
        i.putExtra("no7", status[6]);
        i.putExtra("no8", status[7]);
        i.putExtra("no9", status[8]);
        i.putExtra("no10", status[9]);

        i.putExtra("nilai", sNilai);

        i.putExtra("j1", sNo1);
        i.putExtra("j2", sNo2);
        i.putExtra("j3", sNo3);
        i.putExtra("j4", sNo4);
        i.putExtra("j5", sNo5);
        i.putExtra("j6", sNo6);
        i.putExtra("j7", sNo7);
        i.putExtra("j8", sNo8);
        i.putExtra("j9", sNo9);
        i.putExtra("j10", sNo10);

        startActivity(i);
        finish();
    }

    public void kembali(View view){
        finish();
    }
}