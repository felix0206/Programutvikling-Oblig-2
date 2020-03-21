public class Firkant extends Shapes {

    private String firkant;

    public Firkant(String firkant) {
        this.firkant = firkant;
    }

    @Override
    public String toString() {
        return String.format(getForm());
    }

    @Override
    public String getForm() {
        return firkant;
    }


    @Override
    public void draw() {

    }
}