package com.example.recycler;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recycler.R;

import java.util.ArrayList;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class adapter extends RecyclerView.Adapter<adapter.viewHolder> {
    ArrayList<person>persons;

    public adapter() {
        persons=new ArrayList<>();
        persons.add(new person("ahmed",R.drawable.ic_baseline_person_24));
        persons.add(new person("aya",R.drawable.ic_launcher_foreground));
        persons.add(new person("ibrahim",R.drawable.ic_baseline_person_24));
        persons.add(new person("ali",R.drawable.ic_launcher_background));
    }


    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new viewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.oneitemperson,parent,false));
    }

    @Override
    public int getItemCount() {
        return persons.size();
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int position ) {
        person p=persons.get(position);
        viewHolder.name_person.setText(p.getName());
        viewHolder.image_person.setImageResource(p.getImage());
    }

    class viewHolder extends RecyclerView.ViewHolder {
        TextView name_person;
        ImageView image_person;
    public viewHolder(@NonNull View itemView) {
        super(itemView);
        image_person=itemView.findViewById(R.id.image_person);
        name_person=itemView.findViewById(R.id.name_person);

    }
    }



}
