public class Main {

    public static void main(String[] args) {

        Oppg1 oppg1 = new Oppg1();

        System.out.println("Oppgave1: ");

        oppg1.sum(10);

        System.out.println("\n" + "Oppgave2: ");

        Oppg2 oppg2 = new Oppg2();

        System.out.println("Summen av base^exponent blir: " + oppg2.pow(2,3));

    }

}
