package fr.exceptions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Country {

    private String name;

    public Country (String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }
    public void setName(String newName){
        this.name = newName;
    }

    public static Comparator<Country> sortByName = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    public static Comparator<Country> sortByNameInversed = new Comparator<Country>() {
        @Override
        public int compare(Country o1, Country o2) {
            return o2.getName().compareTo(o1.getName());
        }
    };


}
