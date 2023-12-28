package Objects;

import Enums.Status;
import Interfaces.Moving;
import Place.Place;

public class Cord implements Moving {
    private String name;
    private Place place;
    private int coordinate1;
    private int coordinate2;

    public Cord(String name, Place place, int coordinateY) {
        this.place = place;
        this.name = name;
        this.coordinate2 = coordinateY;
    }
    public String moveTheCord(int coordinate1, int coordinate2, Person k, Place p) {
        if (Math.abs(coordinate1 - coordinate2) < k.getForce() * Math.random()) {
            this.coordinate1 = p.GetCoordinate();
            this.setP(p);
            return "Karlson pulled the " + name + " to the " + p.GetPlace();
        } else {
            return "Karlson had not enough forse to get the destination";
        }
    }
    @Override
    public String moveTheObject(Person p, Object obj, Place park){
        if (p.getHeight() < Math.random()*6){
        return p.getName() + "Boy could not take the Cord";
        }
        else{
            this.coordinate2 = park.getCoordinate2();
            this.setP(park);
            return p.getName() + " " + "could take the Cord";
        }
    }
    public void setP(Place p) {
        this.place = p;
    }
}
