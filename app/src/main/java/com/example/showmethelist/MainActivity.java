package com.example.showmethelist;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity {
    private RecyclerView rvPeople;
    private PeopleAdapter peopleAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rvPeople = findViewById(R.id.rv_people);

        //Finish setting up recyclerView
        rvPeople.setLayoutManager(new LinearLayoutManager(this));
        rvPeople.setHasFixedSize(true);

        //Init people adapter
        peopleAdapter = new PeopleAdapter(Utils.getList());
        rvPeople.setAdapter(peopleAdapter);
    }

    // TODO: Step 1: Add RecyclerView Dependency to gradle
    // TODO: Step 2: Add RecyclerView to Activity's layout file (should fill up the parent)

    // TODO: Step 3: Create a new layout file called "person_item" in here (make height 250dp)
    // TODO: Step 3 cont: you will create a view that takes Person name, email, image, phone number. (kind of like a contact card)

    // TODO: Step 4: Declare and Init RecyclerView in Activity
    // TODO: Step 5: COMMIT AND PUSH

    // TODO: Step 6: Create RecyclerView Adapter (We will do this together but you can try it out)

}

