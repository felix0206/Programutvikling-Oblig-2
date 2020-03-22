package OppgaveTo;

public class OppgToMain {

    public static void main(String[] args) {
        //Oppg 2.1
        System.out.println("\n" + "Oppgave 2.1: ");

        Integer[] nyttArray = {1, 2, 3};

        OppgTo1 oppgTo1 = new OppgTo1();
        System.out.print("Arrayet inneholder: ");
        oppgTo1.printArray(nyttArray);
        System.out.println("");

        //Oppg 2.2
        System.out.println("\n" + "Oppgave 2.2: ");

        OppgTo2 oppgTo2 = new OppgTo2();
        System.out.println("Oprinnelige arrayet: ");
        oppgTo1.printArray(nyttArray);
        System.out.println("\n"+"Arrayet reversert: ");
        oppgTo2.reverserArray(nyttArray);


        //oppg 2.3
        System.out.println("\n" + "Oppgave 2.3: ");

        OppgTo3 oppgTo3 = new OppgTo3();

        oppgTo3.add(1);
        oppgTo3.add(2);
        oppgTo3.add(3);

        System.out.println("Tallet på indeksen som er gitt er: " + oppgTo3.get(2));

        System.out.println("Antall elementer er: " + oppgTo3.size());
    }
}
