import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        //oppgave 1.1
        OppgEn1 oppgEn1 = new OppgEn1();

        System.out.println("Oppgave 1.1: ");

        oppgEn1.sum(10);

        //oppgave 1.2
        System.out.println("\n" + "Oppgave 1.2: ");

        OppgEn2 oppgEn2 = new OppgEn2();

        System.out.println("Summen av base^exponent blir: " + oppgEn2.pow(2,3));


        //oppgave 1.3
        System.out.println("\n" + "Oppgave 1.3: ");

        OppgEn3 oppgEn3 = new OppgEn3();
        int[] arr = {1,2,3};

        oppgEn3.reverserArray(arr);

        System.out.println("Listen baklengs: " + Arrays.toString(arr));

        //oppgave 1.4
        System.out.println("\n" + "Oppgave 1.4:");

        OppgEn4 oppgEn4 = new OppgEn4();

        int[] array = {7,1,9,2};

        System.out.println("Minste tallet i listen er: "+oppgEn4.minst(array));


        //Oppg 1.5
        System.out.println("\n" + "Oppgave 1.5:");

        OppgEn5 oppgEn5 = new OppgEn5();

        System.out.println("Fant en match på posisjon: " + oppgEn5.helTall(array, 1));
        System.out.println("Hvis (-1), så var det ingen match.");


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


        System.out.println();
        System.out.println("Oppgave 3.3: ");
        Firkant F1 = new Firkant("Kvadrat");
        Firkant F2 = new Firkant("Tetragon");
        Firkant F3 = new Firkant("Parallellogram");
        Sirkel F4 = new Sirkel("Sirkel");

        FormKategori Firkanter = new FormKategori(F1, F2, F3);
        FormKategori Sirkler = new FormKategori(F4);

        System.out.println("Former i kategorien firkant: " + Firkanter.getForm());
        System.out.println("Former i kategorien sirkler: " + Sirkler.getForm());

        System.out.println();
        // Tester om rammen fungerer
        OppgTre3 enRamme = new OppgTre3(F2);
        System.out.println(enRamme);
        System.out.println(F2);

        System.out.println();
        // Tester at rammen fungerer på en annen form
        OppgTre3 enAnnenRamme = new OppgTre3 (F4);
        System.out.println(enAnnenRamme);
        System.out.println(F4);

    }


}





