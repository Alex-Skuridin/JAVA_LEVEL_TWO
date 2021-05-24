package ru.alex.java2.dz3;

import java.util.*;


public class Phonebook {
    Map<String, List<String>> contacts = new HashMap();


    public void add(String name, String phoneNumber) {
        List<String> phone = contacts.get(name);
        if (phone!= null) {
            contacts.get(name).add(phoneNumber);
        } else {
            List<String> phones = new ArrayList<>();
            phones.add(phoneNumber);
            contacts.put(name, phones);
        }
    }

    public void get(String name) {
        List<String> phone = contacts.get(name);
        if (phone!= null) {
            System.out.println(name);
            System.out.println(phone);
        } else {
            System.out.println(name + " - Number not found");
        }

    }
}
