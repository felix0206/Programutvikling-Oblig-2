package OppgaveTre3;

public class OppgTre3Main {
    public static void main(String[] args) {
        System.out.println("Oppgave 3.3: ");
        Firkant F1 = new Firkant("Kvadrat");
        Firkant F2 = new Firkant("Tetragon");
        Firkant F3 = new Firkant("Parallellogram");
        Sirkel F4 = new Sirkel("Sirkel");

        FormKategori Firkanter = new FormKategori(F1, F2, F3);
        FormKategori Sirkler = new FormKategori(F4);

        System.out.println("Kategorien (Firkant) inneholder følgende: " + Firkanter.getForm());
        System.out.println("Kategorien (Sirkel) inneholder følgende: " + Sirkler.getForm());

        System.out.println();

        OppgTre3 enRamme = new OppgTre3(F2);
        System.out.println(enRamme);
        System.out.println(F2);

        System.out.println();
        OppgTre3 enAnnenRamme = new OppgTre3 (F4);
        System.out.println(enAnnenRamme);
        System.out.println(F4);
    }
}
