
public class Main {

    public static void main(String[] args) {

        //Oppg 3.2
        System.out.println("\n" + "Oppgave 3.2: ");

        Lampe lampe = new Lampe();
        lampe.KnappeTrykk();
        lampe.printStatus(); //Grønn
        lampe.KnappeTrykk();
        lampe.printStatus(); //Oransje
        lampe.KnappeTrykk();
        lampe.printStatus(); //Rød
        lampe.KnappeTrykk();
        lampe.printStatus(); //Av


    }


}





