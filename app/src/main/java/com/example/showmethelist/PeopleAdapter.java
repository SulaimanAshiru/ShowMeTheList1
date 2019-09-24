package com.example.showmethelist;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class PeopleAdapter extends RecyclerView.Adapter<PeopleAdapter.PeopleViewHolder> {

    private List<Person> peopleList;

    public PeopleAdapter(List<Person> peopleList) {
        this.peopleList = peopleList;
    }

    @NonNull
    @Override
    public PeopleViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(
                R.layout.person_item,
                parent,
                false
        );
        return new PeopleViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PeopleViewHolder holder, int position) {
        Person person = peopleList.get(position);

        String firstName = person.getFirstName();
        holder.Name.setText(firstName);

        String emailAddress = person.getEmail();
        holder.Email.setText(emailAddress);

        String number = person.getPhoneNumber();
        holder.PhoneNumber.setText(number);

    }

    @Override
    public int getItemCount() {
        return peopleList.size();
    }

    class PeopleViewHolder extends RecyclerView.ViewHolder {

        TextView Name;
        TextView Email;
        TextView PhoneNumber;

        public PeopleViewHolder(@NonNull View itemView) {
            super(itemView);
            Name = itemView.findViewById(R.id.name);
            Email = itemView.findViewById(R.id.email);
            PhoneNumber = itemView.findViewById(R.id.phonenumber);
        }
    }


}
