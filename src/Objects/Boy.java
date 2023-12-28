package Objects;
import Place.*;
import Enums.Status;
import Interfaces.Playable;

public class Boy extends Person implements Playable {
    private Status stat;

    public Boy(String name, Status type, int force, int height, Place place) {
        super(name,type, force, height, place);
        this.stat = type;
    }
    public String describe1() {
        return this.getName() + " " + this.stat.getStat();
    }
    public String GiveNewStat(Person p) {
        point = (int) (point + 10 * Math.random());
        if (point > 2) {
            this.stat = Status.THINKING;
            return this.describe1();
        } else {
            this.stat = Status.NORMAL;
            return this.describe1();
        }
    }
    int point = 0;

    @Override
    public String play(int point, Status stat, Game g) {
        point = (int) (Math.random() * 20);
        if (point > 15) {
            this.stat = Status.THINKING;
        } else {
            this.stat = Status.NORMAL;
        }
        return "Thinking not only because of the " + g.getType().getStat()+ " " + g.getName();
    }
    public String wait(Boy b){
        this.stat = Status.WAITING;
        try {
                Thread.sleep((long) (Math.random() * 8000));
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        this.stat = Status.NORMAL;
        return "Boy is waiting";
    }

}

