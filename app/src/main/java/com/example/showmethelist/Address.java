package com.example.showmethelist;

import java.security.PublicKey;

public class Address {
    private String doubleLongitude;
    private String doubleLatitude;
    private String city;
    private String zip;
    private String country;
    private String streetAddress;

    public Address (String doubleLongitude, String doubleLatitude, String city, String zip, String country, String streetAddress) {
        this.doubleLongitude = doubleLongitude;
        this.doubleLatitude = doubleLatitude;
        this.city = city;
        this.zip = zip;
        this.country = country;
        this.streetAddress = streetAddress;
    }

    public String getDoubleLongitude () { return doubleLongitude; }
    public void setDoubleLongitude(String doubleLongitude) {this.doubleLongitude = doubleLongitude;}


    public String getDoubleLatitude() { return doubleLatitude;  }
    public void setDoubleLatitude(String doubleLatitude) { this.doubleLatitude = doubleLatitude; }


    public String getCity() { return city;}
    public void setCity(String city) { this.city = city; }


    public String getCountry() { return country; }
    public void setCountry(String country) { this.country = country; }


    public String getStreetAddress() { return streetAddress; }
    public void setStreetAddress(String streetAddress) { this.streetAddress = streetAddress; }

}
