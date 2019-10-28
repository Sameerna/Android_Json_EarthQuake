package com.example.android.quakereport;

public class Earthquakes {
    private Double Magnitude;
    private String Location;
    private long mTimeInMilliseconds;
    private String mUrl;

    public Earthquakes( Double magnitude,String location,long millisec,String url){
        Magnitude = magnitude;
        Location  =  location;
        mTimeInMilliseconds= millisec;
        mUrl = url;
    }
    public Double getMagnitude(){return Magnitude;}
    public String getLocation(){return Location;}
    public long getTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
    public String getUrl() {
        return mUrl;
    }
}
