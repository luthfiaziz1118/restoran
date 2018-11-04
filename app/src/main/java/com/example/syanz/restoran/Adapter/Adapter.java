package com.example.syanz.restoran.Adapter;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.syanz.restoran.DetailMenuActivity;
import com.example.syanz.restoran.R;
import com.example.syanz.restoran.model.MenuModel;

import java.util.ArrayList;
import java.util.LinkedList;

public class Adapter extends RecyclerView.Adapter<Adapter.ListMenuViewHolder> {

    //deklarasi global variabel
    private Context context;
    private final ArrayList<MenuModel> listResto;

    //konstruktor untuk menerima data adapter
    public Adapter(Context context, ArrayList<MenuModel> listResto) {
        this.context = context;
        this.listResto = listResto;
    }

    //view holder berfungsi untuk setting list item yang digunakan
    @Override
    public ListMenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        mItemView.setLayoutParams(layoutParams);

        return new ListMenuViewHolder(mItemView, this);
    }

    //bind view holder berfungsi untuk set data ke view yang ditampilkan pada list item
    @Override
    public void onBindViewHolder(ListMenuViewHolder holder, int position) {
        final MenuModel mCurrent = listResto.get(position);
        holder.namaMenu.setText(mCurrent.getNamaMenu());
        holder.hargaMenu.setText(mCurrent.getHargaMenu());
        holder.fotoMenu.setImageResource(mCurrent.getFotoMenu());

    }

    //untuk menghitung jumlah data yang ada pada list
    @Override
    public int getItemCount() {
        return listResto.size();
    }

    public class ListMenuViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private TextView namaMenu,hargaMenu,deskripsiMenu;
        private ImageView fotoMenu;
        private CardView cdView;

        final Adapter mAdapter;

        //untuk casting view yang digunakan pada list item
        public ListMenuViewHolder(View itemView, Adapter adapter) {
            super(itemView);
            cdView = itemView.findViewById(R.id.cv_Menu);
            namaMenu = itemView.findViewById(R.id.judul);
            hargaMenu = itemView.findViewById(R.id.harga);
            deskripsiMenu = itemView.findViewById(R.id.deskripsi);
            fotoMenu = itemView.findViewById(R.id.thumbnail);

            this.mAdapter = adapter;
            cdView.setOnClickListener(this);
        }

        //untuk menambah action click pada list item
        @Override
        public void onClick(View view) {
            int mPosition = getLayoutPosition();
            MenuModel element = listResto.get(mPosition);

            //intent ke main activity dengan passing data
            Intent i = new Intent(context, DetailMenuActivity.class);

            i.putExtra("nama", element.getNamaMenu());
            i.putExtra("harga", element.getHargaMenu());
            i.putExtra("deskripsi", element.getDeskripsiMenu());
            i.putExtra("foto", element.getFotoMenu());

            context.startActivity(i);
            mAdapter.notifyDataSetChanged();
        }
    }
}