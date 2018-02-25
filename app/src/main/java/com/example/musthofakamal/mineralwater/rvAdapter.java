package com.example.musthofakamal.mineralwater;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.example.musthofakamal.mineralwater.DetailActivity;

import java.util.List;

/**
 * Created by Musthofa Kamal on 2/25/2018.
 */

public class rvAdapter extends RecyclerView.Adapter<rvAdapter.MinumanViewHolder>{
    private List <Minuman> minuman;
    private Context context;

    public rvAdapter(List<Minuman> minuman) {
        this.minuman = minuman;
        }

    public class MinumanViewHolder extends RecyclerView.ViewHolder  {
    public ImageView image;
    public TextView nama, detail, komposisi;
        public MinumanViewHolder(View view) {
            super(view);
            context = itemView.getContext();
            image = (ImageView)itemView.findViewById(R.id.image);
            nama = (TextView)view.findViewById(R.id.nama);
            detail = (TextView)view.findViewById(R.id.detail);
            komposisi = (TextView)view.findViewById(R.id.komposisi);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    int posisi = getAdapterPosition();
                    Minuman klikMenu = minuman.get(posisi);
                    Intent intent = new Intent(context, DetailActivity.class);
                    intent.putExtra("image", minuman.get(posisi).getImage());
                    intent.putExtra("nama", minuman.get(posisi).getNama());
                    intent.putExtra("detail", minuman.get(posisi).getDetail());
                    intent.putExtra("komposisi", minuman.get(posisi).getKomposisi());
                    context.startActivity(intent);
                }
            });
        }
    }

    @Override
    public rvAdapter.MinumanViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_minuman, parent, false);

        return new MinumanViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(rvAdapter.MinumanViewHolder holder, int position) {
        holder.image.setImageResource(minuman.get(position).getImage());
        holder.nama.setText(minuman.get(position).getNama());
        holder.detail.setText(minuman.get(position).getDetail());
        holder.komposisi.setText(minuman.get(position).getKomposisi());
    }

    @Override
    public int getItemCount() {
        return minuman.size();
    }

}
