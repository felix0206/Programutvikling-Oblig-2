
public class OppgTre3 extends Shapes {
    private Shapes ramme;

    public OppgTre3(Shapes ramme) {
        this.ramme = ramme;
    }


    @Override
    public String toString() {
        return String.format("ramme start | " +
                ramme.getForm() + " | ramme slutt.");
    }


    @Override
    public void draw() {

    }

    @Override
    public String getForm() {
        return null;
    }
}