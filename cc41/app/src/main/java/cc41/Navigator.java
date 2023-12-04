package cc41.app.src.main.java.cc41;

import java.util.LinkedList;

public class Navigator {
    private LinkedList<String> locations;
   private int currentLocation;
    public Navigator() {
        this.locations = new LinkedList<>();
        currentLocation=-1;
    }

    public LinkedList<String> getLocations() {
        return locations;
    }

    public String getCurrentLocation() {
        return locations.get(currentLocation);
    }

    public void addLocation(String desiredLocation){
        locations.add(desiredLocation);
        currentLocation++;
    }
    public String back(){
        if (currentLocation==0)
            return null;
        currentLocation--;
        String previousLocation=locations.get(currentLocation);
        return previousLocation;
    }
    public String next(){
        if (currentLocation==locations.size()-1)
            return null;
currentLocation++;
String nextLocation=locations.get(currentLocation);
        return nextLocation;
    }
}
