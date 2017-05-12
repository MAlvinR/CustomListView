package id.co.horveno.customlist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ImageView gambar_buah;
    TextView nama_buah;
    String namabuah[] = {
            "Durian",
            "Apel",
            "Strawberry",
            "Alpukat",
            "Manggis"
    };
    int gambarbuah[] = {
            R.drawable.duriani,
            R.drawable.apel1,
            R.drawable.strawberrya,
            R.drawable.alpukat1,
            R.drawable.manggisi
    };
    ListView listview;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Deklarasi ListView
        listview = (ListView)findViewById(R.id.list_view);

        CustomAdapter customAdapter = new CustomAdapter(this,namabuah, gambarbuah);
        listview.setAdapter(customAdapter);
    }
}
