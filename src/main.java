import Enums.Status;
import Objects.*;
import Place.*;
import Objects.Bell;
import Objects.Cord;

public class main {
    /*
    под карнизом своего домика Карлсон прибил колокольчик -- из тех, что подвязывают коровам, -- а шнур от него протянул к окну Малыша.
     Конечно, это было колоссально, Малыш тоже так думал. И не только из-за игры в привидение.
     Раньше ему подолгу приходилось ждать, пока не появится Карлсон.
     А теперь достаточно было дернуть за шнурок, и он тут как тут.
     */
    public static void main(String args[]) {
        Window window = new Window(0, 10, "window");
        Cornice corn = new Cornice(20, 5, "cornice");
        Game game = new Game("game", Status.GHOST);
        Home home = new Home(0, 0, "home");
        Parket parket = new Parket(5, 0, "parket");
        Build build = new Build();
        Karlson karlson = new Karlson("Karlson", Status.NORMAL, 100, 20, window);
        Boy boy = new Boy("Boy", Status.NORMAL, 5, 10, home);
        Cord cord = new Cord("cord", home, 6);
        Bell b = new Bell("Bell", Status.NORMAL, corn);

        build.addAction(karlson.create("Bell", Status.NORMAL, parket),
                karlson.describe(),
                b.moveTheObject(karlson, cord, corn),
                cord.moveTheCord(-10, 6, karlson, window),
                boy.changeStat(boy),
                boy.play(20, Status.GHOST, game),
                boy.wait(boy),
                cord.moveTheObject(boy, cord, parket),
                karlson.play(15, Status.NORMAL, game));

        build.run();



        }

    }