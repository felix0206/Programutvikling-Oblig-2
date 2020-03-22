package OppgaveTre3;

public class Ramme extends Shapes {
    private Shapes ramme;

    public Ramme(Shapes ramme) {
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

