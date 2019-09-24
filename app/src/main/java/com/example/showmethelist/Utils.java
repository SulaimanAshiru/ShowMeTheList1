package com.example.showmethelist;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    static List<Person> getList() {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Name: Michael", "Jordan", "Email: mj23@bulls.com", "Phone Number: 2123452321", ""));
        people.add(new Person("Name: Stephen", "Curry",  "Email: sc30@warriors.com", "Phone Number: 2128562135",  ""));
        people.add(new Person("Name: Lebron",  "James",  "Email: lj23@heat.com", "Phone Number: 2124569878", ""));
        people.add(new Person("Name: Allen",   "Iverson", "Email: ai03@sixers.com", "Phone Number: 2123697898", ""));
        people.add(new Person("Name: Joel",    "Embiid", "Email: je21@sixers.com", "Phone Number: 2127417894", ""));
        people.add(new Person("Name: Klay",    "Thompson", "Email: kt11@warriors.com", "Phone Number: 2128523659", ""));
        people.add(new Person("Name: Andre",   "Igoudala", "Email: ai09@sixers.com", "Phone Number: 2122232563", ""));
        people.add(new Person("Name: Shaq",    "Oneal",   "Email: so32@heat.com", "Phone Number: 2122232568", ""));
        people.add(new Person("Name: Dwayne",  "Wade", "Email: dw09@heat.com", "Phone Number: 2122232893", ""));
        people.add(new Person("Name: Kevin",   "Durant", "Email: kd32@nets.com", "Phone Number: 2122278563", ""));

        return people;
    }


}
