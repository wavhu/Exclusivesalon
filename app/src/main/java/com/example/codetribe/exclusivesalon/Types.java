package com.example.codetribe.exclusivesalon;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class Types extends AppCompatActivity {

    int image;
    String inch;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_types);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        ArrayList<HairClass> arrayList = new ArrayList<>();

        HairClass content = new HairClass();
        HairClass content1 = new HairClass();


        arrayList.add(content);
        arrayList.add(content1);

        myAdapter contentAdapter = new myAdapter(this, arrayList);
        recyclerView.setAdapter(contentAdapter);


        content.setImage(R.drawable.bbb);
        content.setInch("8 inch");

        content1.setImage(R.drawable.fff);
        content1.setInch("10 inch");
    }

    private class myAdapter extends RecyclerView.Adapter<myAdapter.ViewHolder>{

        Context context;
        List<HairClass> contactList;

        public myAdapter(Context context, List<HairClass> contactList){
            this.context = context;
            this.contactList = contactList;
        }

        @Override
        public myAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
            View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_content, parent, false);
            myAdapter.ViewHolder viewHolder = new myAdapter.ViewHolder(view);
            return viewHolder;
        }

        @Override
        public void onBindViewHolder(myAdapter.ViewHolder holder, int position) {
            final HairClass contact = contactList.get(position);
            holder.inch.setText(contact.getInch());
            holder.image.setImageResource(contact.getImage());
        }

        @Override
        public int getItemCount() {
            return contactList.size();
        }

        public class ViewHolder extends RecyclerView.ViewHolder {
            TextView inch;
            ImageView image;
            public ViewHolder(View itemView) {
                super(itemView);
                inch = (TextView) itemView.findViewById(R.id.inch);
                image = (ImageView) itemView.findViewById(R.id.image);
            }
        }
    }
}