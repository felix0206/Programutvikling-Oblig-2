package OppgaveTre3;

import java.util.List;

public abstract class Shapes implements Watchable {
    public abstract void draw();

    private List<Shapes> alleFormer;

    private double xPosisjon;
    private double yPosisjon;


}