package Objects;
import Enums.Status;

public class Game {
    private static Status type;
    private static String name;
    public Game(String name, Status type) {
        this.type = type;
        this.name = name;
    }
    public Status getType(){
        return type;
    }
    public String getName(){
        return name;
    }

}
