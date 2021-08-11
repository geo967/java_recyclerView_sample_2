package com.example.recyclerview2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<ItemList> list=new ArrayList<>();
    RecyclerView recycler;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);




        for(int i=0;i<30;i++){
            list.add(new ItemList(i));
        }

        recycler=findViewById(R.id.my_recycler);
        recycler.setHasFixedSize(true);

        LinearLayoutManager layoutManager=new LinearLayoutManager(this);
        layoutManager.setOrientation(RecyclerView.VERTICAL);

        recycler.setLayoutManager(layoutManager);
        AdapterClass adpt=new AdapterClass(this.list);
        recycler.setAdapter(adpt);
    }
}