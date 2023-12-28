package Objects;
import java.util.ArrayList;

public class Build {
    ArrayList<Object> actList = new ArrayList<>();

    public void addAction(Object... act) {
        for (int i = 0; i < act.length; i++) {
            actList.add(act[i]);
        }
    }
        public void run(){
        for (int i = 0; i < actList.size(); i++){
                System.out.println(actList.get(i));
            }
        }
    }
