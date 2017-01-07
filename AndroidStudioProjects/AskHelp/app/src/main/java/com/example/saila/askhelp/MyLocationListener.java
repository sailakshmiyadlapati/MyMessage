package com.example.saila.askhelp;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

public class MyLocationListener implements LocationListener {
    public static String location;

    @Override
    public void onLocationChanged(Location loc) {



        String longitude = "Longitude: " +loc.getLongitude();

        String latitude = "Latitude: " +loc.getLatitude();


    /*----------to get City-Name from coordinates -------------
        String cityName=null;
        Geocoder gcd = new Geocoder(getBaseContext(),
                Locale.getDefault());

        List<Address> addresses;
        try {
            addresses = gcd.getFromLocation(loc.getLatitude(), loc
                    .getLongitude(), 1);
            if (addresses.size() > 0)
                System.out.println(addresses.get(0).getLocality());
            cityName=addresses.get(0).getLocality();
        } catch (IOException e) {
            e.printStackTrace();
        }*/

        location = longitude + "\n" + latitude;}

    public String returnLocation(){
        return location;
    }




    @Override
    public void onProviderDisabled(String provider) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onProviderEnabled(String provider) {
        // TODO Auto-generated method stub
    }

    @Override
    public void onStatusChanged(String provider,
                                int status, Bundle extras) {
        // TODO Auto-generated method stub
    }
}
