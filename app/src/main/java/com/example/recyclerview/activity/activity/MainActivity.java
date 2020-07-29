package com.example.recyclerview.activity.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.example.recyclerview.R;
import com.example.recyclerview.activity.RecyclerItemClickListener;
import com.example.recyclerview.activity.adapter.AdapterCarros;
import com.example.recyclerview.activity.model.Carro;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rcvCarros;
    private List<Carro> listaCarros = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rcvCarros = findViewById(R.id.rcvCarros);

        //listagem de carros
        this.criarCarros();

        //configurar adaptador
        AdapterCarros adapter = new AdapterCarros(listaCarros);

        //Configurar RecyclerView
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(getApplicationContext());
        rcvCarros.setLayoutManager(layoutManager);
        rcvCarros.setHasFixedSize(true);
        rcvCarros.addItemDecoration(new DividerItemDecoration(this, LinearLayout.VERTICAL));
        rcvCarros.setAdapter(adapter);

        //adiciona evento de click
        rcvCarros.addOnItemTouchListener(new RecyclerItemClickListener(getApplicationContext(), rcvCarros, new RecyclerItemClickListener.OnItemClickListener() {
            @Override
            public void onItemClick(View view, int position) {
                Carro carro = listaCarros.get(position);
                Toast.makeText(getApplicationContext(), carro.getModelo(), Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onLongItemClick(View view, int position) {
                Carro carro = listaCarros.get(position);
                Toast.makeText(getApplicationContext(), carro.getModelo() + " foi adicionado como favorito!", Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

            }
        }));
    }

    public void criarCarros() {
        Carro carro = new Carro("350Z", "Nissan", "2003");
        listaCarros.add(carro);

        carro = new Carro("RCZ", "Peugeot", "2018");
        listaCarros.add(carro);

        carro = new Carro("Shelby GT350R", "Ford", "2020");
        listaCarros.add(carro);

        carro = new Carro("BRZ tS STI", "Subaru", "2018");
        listaCarros.add(carro);

        carro = new Carro("370Z Nismo", "Nissan", "2020");
        listaCarros.add(carro);

        carro = new Carro("TT RS", "Audi", "2020");
        listaCarros.add(carro);

        carro = new Carro("M2", "BMW", "2020");
        listaCarros.add(carro);
    }
}