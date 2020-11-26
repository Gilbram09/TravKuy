package com.example.anew.Wisata;

import android.content.Intent;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.example.anew.R;

import java.util.ArrayList;

public class ListWisata  extends RecyclerView.Adapter<ListWisata.ListViewHolder> {
    private ArrayList<parcelable> listwisata;

    public ListWisata(ArrayList<parcelable> list) {
        this.listwisata = list;
    }



    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.row_item, viewGroup, false);
        return new ListViewHolder(view);
    }


    @Override
    public void onBindViewHolder(@NonNull ListViewHolder holder, final int position) {
        parcelable universitas = listwisata.get(position);
        Glide.with(holder.itemView.getContext())
                .load(universitas.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.tvName.setText(universitas.getName());
        holder.tvDetail.setText(universitas.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Detail_Wisata.class);
                intent.putExtra("universitas", (Parcelable) listwisata.get(position));
                view.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listwisata.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName, tvDetail;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }

}