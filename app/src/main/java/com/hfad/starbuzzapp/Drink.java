package com.hfad.starbuzzapp;

/**
 * Created by asifur on 12/10/17.
 */

public class Drink {
    private String name;
    private String description;
    private int imageResourceId;

    //drink is an array of Drinks
    public static final Drink[] drinks ={
      new Drink("Lattece","A couple of spresso shots with streamed milk",R.drawable.capicuno),
      new Drink("Capucino","Essspresso, hotmilk, stream of milk",R.drawable.capicuno),
      new Drink("Filter","Highest quality beans roasted and brewed fresh",R.drawable.filter)
    };

    //each drink has a name,description and resource id

    private Drink(String name,String description,int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }

    public String getName(){
        return name;
    }

    public String getDescription(){
        return description;
    }

    public int getImageResourceId(){
        return imageResourceId;
    }

    public String toString(){
        return this.name;
    }

}
