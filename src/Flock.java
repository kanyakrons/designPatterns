import java.util.ArrayList;
import java.util.Iterator;

public class Flock implements Quackable {
    ArrayList quackers = new ArrayList();
    public void add(Quackable quacker) {
        quackers.add(quacker);
    }
    public void quack() {
        Quackable quacker = (Quackable) quackers.get(0);
        if(quacker != null)
            for(int i = 0; i < 3; i++)
                quacker.quack();

        for(int i = 1; i < quackers.size(); i++){
            quacker = (Quackable) quackers.get(i);
            quacker.quack();
        }
    }
}