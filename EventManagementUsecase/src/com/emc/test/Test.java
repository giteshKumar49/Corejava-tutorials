package com.emc.test;

import com.emc.entities.Event;
import com.emc.entities.Organizer;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Date d = new Date();
        Organizer organizer = new Organizer(1234,"John Doe");
        Event event = new Event(101,
                "Iphone 16 launch",
                "Grand launch of Iphones",
                d,
                d,
                true);

        System.out.println("event = " + event);


    }
}
