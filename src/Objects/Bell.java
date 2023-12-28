package Objects;

import Enums.Status;
import Interfaces.Moving;
import Place.Place;

public class Bell implements Moving {
    private Status type;
    private String name;
    private Place place;
    private Status stat;

    public Bell(String name, Status type, Place place) {
        this.type = type;
        this.name = name;
        this.place = place;
        stat = type;
    }
    @Override
    public String moveTheObject(Person p, Object obj, Place park) {
        if (p.getHeight() + p.getForce() < park.getCoordinate2()) {
            this.setPlace(park);
            return p.getName() + " could hang the bell";
        } else {
            return p.getName() + " could not hang the bell";
        }
    }
    public void setPlace(Place p) {
        this.place = p;
    }
}
