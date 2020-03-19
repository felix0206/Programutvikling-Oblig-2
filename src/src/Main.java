public class Main {

    public static void main(String[] args) {

        //oppgave EN3

        OppgEn1 oppgEn1 = new OppgEn1();

        System.out.println("Oppgave 1.1: ");

        oppgEn1.sum(10);

        //oppgave EN2

        System.out.println("\n" + "Oppgave 1.2: ");

        OppgEn2 oppgEn2 = new OppgEn2();

        System.out.println("Summen av base^exponent blir: " + oppgEn2.pow(2,3));


        //oppgave EN3

        OppgEn3 oppgEn3 = new OppgEn3();

        int[] arr = {1,2,3};
        System.out.println(oppgEn3.baklengs(arr, 0, arr.length-1));
        }

        }
