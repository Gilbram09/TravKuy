package com.example.anew.Ticket;

import android.content.Intent;
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

public class ListTicket extends RecyclerView.Adapter<ListTicket.ListViewHolder> {
    private ArrayList<Ticket> listTiket;

    public ListTicket(ArrayList<Ticket> list) {
        this.listTiket = list;
    }

    @NonNull
    @Override
    public ListTicket.ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_item, parent,false);
        return new ListTicket.ListViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ListTicket.ListViewHolder holder, final int position) {
        Ticket universitas = listTiket.get(position);
        Glide.with(holder.itemView.getContext())
                .load(universitas.getPhoto())
                .apply(new RequestOptions().override(55,55))
                .into(holder.imgPhoto);
        holder.tvName.setText(universitas.getName());
        holder.tvDetail.setText(universitas.getDetail());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(view.getContext(), Detail_Tiket.class);
                intent.putExtra("universitas", (Ticket) listTiket.get(position));
                view.getContext().startActivity(intent);
            }
        });
    }






    @Override
    public int getItemCount() {
        return listTiket.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName,tvDetail;


        public ListViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            tvDetail = itemView.findViewById(R.id.tv_item_detail);
        }
    }
}