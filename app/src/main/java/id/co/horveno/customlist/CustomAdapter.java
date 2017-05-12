package id.co.horveno.customlist;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

/**
 * Created by ASUS on 12/05/2017.
 */

public class CustomAdapter extends ArrayAdapter<String> {

    Activity context;
    String[] nama_buah;
    int[] gambar_buah;
    //Constructor
    public CustomAdapter(Activity applicationContext, String[] namabuah, int[] gambarbuah) {
        super(applicationContext, R.layout.list_item, namabuah);
        this.context = applicationContext;
        this.nama_buah = namabuah;
        this.gambar_buah = gambarbuah;

    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        //memnaggil layout listitemimage ke dalam layout activity listbuah image
        LayoutInflater inflater = context.getLayoutInflater();
        //untuk memanggil layout
        View view = inflater.inflate(R.layout.list_item, null, true);

        TextView namabuah = (TextView)view.findViewById(R.id.nama_buah);
        ImageView gambarbuah = (ImageView) view.findViewById(R.id.gambar_buah);

        namabuah.setText(nama_buah[position]);
        gambarbuah.setImageResource(gambar_buah[position]);

        return view;


    }
}
