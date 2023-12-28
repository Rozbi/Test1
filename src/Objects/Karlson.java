package Objects;

import Enums.Status;
import Interfaces.Playable;
import Place.*;

public class Karlson extends Person implements Playable {
    private String name;
    private Status stat;
    public Karlson(String name, Status type, int force, int height, Place place) {
        super(name, type, force, height, place);
        this.stat = type;
        this.name = name;
    }

    private Bell b;
    private Bell ring = null;


    public String describe() {
        return "Karlson has created the ring with a bell";
    }


    public String create(String name, Status type, Place place) {
        Bell bell = new Bell(name, type, place);
        this.b = bell;
        this.describe();
        return type.getStat() + " " + name + " was created " + "under the " + place.GetPlace();
    }
    private int pleasure;

    @Override
    public String play(int point, Status stat, Game g) {
        pleasure = (int) (Math.random() * point);
        if (pleasure > 15) {
            return name + " " + "flew away, but promised to come back";
        } else {
        }
        return name + " " + "came back quickly";
    }

    @Override
    public String changeStat(Person p) {
        stat = Status.NORMAL;
        return stat.getStat();
    }
}
