package com.example.networking;

@SuppressWarnings("WeakerAccess")
public class Mountain {

    private String name;
    private String location;
    private int height;


    public Mountain() {
        name="No Name";
        location="No Location";
        height=-1;
    }

    public Mountain(String name, String location, int height) {
        this.name = name;
        this.location = location;
        this.height= height;
    }


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    @Override
    public String toString(){
        return name;
    }
}