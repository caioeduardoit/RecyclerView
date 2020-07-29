package com.example.recyclerview.activity.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.model.Carro;

import java.util.List;

public class AdapterCarros extends RecyclerView.Adapter<AdapterCarros.MyViewHolder> {
    private List<Carro> listaCarros;

    public AdapterCarros(List<Carro> lista) {
        this.listaCarros = lista;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_lista, parent, false);
        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Carro carro = listaCarros.get(position);

        holder.txtModelo.setText(carro.getModelo());
        holder.txtMarca.setText(carro.getMarca());
        holder.txtAno.setText(carro.getAno());
    }

    @Override
    public int getItemCount() {
        return listaCarros.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView txtModelo, txtMarca, txtAno;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            txtModelo = itemView.findViewById(R.id.txtModelo);
            txtMarca = itemView.findViewById(R.id.txtMarca);
            txtAno = itemView.findViewById(R.id.txtAno);
        }
    }
}
