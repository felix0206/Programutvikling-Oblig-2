package OppgaveTre3;

import java.util.LinkedList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;

public class MouseMovement implements Observer {

    // Startposisjon for musepekeren.
    private double x=0.0;
    private double y=0.0;

    private List<Observer> observers = new LinkedList<>();
    Observable i;

    // Getmetoder for X og Y akse.
    public double getX(){
        return x; //Returnerer X-Posisjon
    }

    public double getY() {
        return y;  //Returnerer Y-Posisjon
    }


    public void attach(Observer o) {
        observers.add(o);
    }

    public void detach(Observer o) {
        observers.remove(o);
    }


    public void oppdagMovement() {
        x += 0.1;
        y += 0.1;

        beskjedTilObservers();
    }


    private void beskjedTilObservers() {
        for(Observer o : observers) {
            o.update((Observable) o, o);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("Message board changed: " + arg);
    }
}