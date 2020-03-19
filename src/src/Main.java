public class Main {

    public static void main(String[] args) {

        OppgEn1 oppgEn1 = new OppgEn1();

        System.out.println("Oppgave1: ");

        oppgEn1.sum(10);

        System.out.println("\n" + "Oppgave2: ");

        OppgEn2 oppgEn2 = new OppgEn2();

        System.out.println("Summen av base^exponent blir: " + oppgEn2.pow(2,3));

    }

}
