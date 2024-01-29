package com.sichilongo.recycleview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewContact;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewContact = findViewById(R.id.recycleContact);

        ArrayList<Contacts>contacts = new ArrayList<>();
        contacts.add(new Contacts("micheal sichilongo","MichealSichilongo@gmail.com","sichilongo"));
        contacts.add(new Contacts("kelly banda","bandaKelly@gmail.com","banda"));
        contacts.add(new Contacts("Emma williams","williamsEmma@gmail.com","williams"));
        contacts.add(new Contacts("jack sichilongo","MichealSichilongo@gmail.com","sichilongo"));
        contacts.add(new Contacts("mary nachilongo","nachilongo@gmail.com","nachilongo"));
        contacts.add(new Contacts("connie nachilongo","MichealSichilongo@gmail.com","nachilongo"));
        contacts.add(new Contacts("Easter Phiri","Phiri@gmail.com","Phiri"));
        contacts.add(new Contacts("George Chileshe","George@gmail.com","Chileshe"));
        contacts.add(new Contacts("Martha Mwale","Martha@gmail.com","Martha"));
        contacts.add(new Contacts("Staff sichilongo","MichealSichilongo@gmail.com","sichilongo"));
        contacts.add(new Contacts("Grace nancy","grace@gmail.com","grace"));
        contacts.add(new Contacts("Fredrick waters","Fredrick@gmail.com","Fredrick"));
        contacts.add(new Contacts("Benjiman sichilongo","Benjiman@gmail.com","Benjiman"));
        contacts.add(new Contacts("maria success","success@gmail.com","success"));
        contacts.add(new Contacts("Thresa banda","banda@gmail.com","banda"));
        contacts.add(new Contacts("Geo joshua","joshua@gmail.com","joshua"));

        RecycleAdapter recycleAdapter = new RecycleAdapter(this);
        recycleAdapter.setContacts(contacts);
        recyclerViewContact.setAdapter(recycleAdapter);
        recyclerViewContact.setLayoutManager(new GridLayoutManager(this,2));

    }
}