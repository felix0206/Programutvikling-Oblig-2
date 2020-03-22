package OppgaveTre3;
public class Sirkel extends Shapes{
    private String sirkel;

    public Sirkel(String sirkel) {
        this.sirkel = sirkel;
    }


    @Override
    public String toString() {
        return String.format(
                getForm());
    }

    @Override
    public String getForm() {
        return sirkel;
    }

    @Override
    public void draw() {

    }
}