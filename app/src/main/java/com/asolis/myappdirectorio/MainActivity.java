package com.asolis.myappdirectorio;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<DatosVO> listaVO =new ArrayList<>();
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.directorioId);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        this.insertarDatos();

        AdaptadorRecycler adaptadorRecycler= new AdaptadorRecycler(listaVO);
        recyclerView.setAdapter(adaptadorRecycler);
    }

    public void insertarDatos() {
        listaVO.add(new DatosVO("Marie Solis","6666-9901",R.drawable.ic_rostro01));
        listaVO.add(new DatosVO("Angel Solis","6666-9902",R.drawable.ic_rostro02));
        listaVO.add(new DatosVO("Ariana Solis","6666-9903",R.drawable.ic_rostro03));
        listaVO.add(new DatosVO("Estuardo Luna","6666-9904",R.drawable.ic_rostro04));
        listaVO.add(new DatosVO("Juan Polosky","6666-9905",R.drawable.ic_rostro05));
        listaVO.add(new DatosVO("Anaalu Dávila","6666-9906",R.drawable.ic_rostro06));
        listaVO.add(new DatosVO("Otiviri","6666-9907",R.drawable.ic_rostro07));
        listaVO.add(new DatosVO("Juancha Leon","6666-9908",R.drawable.ic_rostro08));
        listaVO.add(new DatosVO("el tyson","6666-9909",R.drawable.ic_rostro07));
        listaVO.add(new DatosVO("la lupe","6666-9910",R.drawable.ic_rostro10));


    }
}