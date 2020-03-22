package OppgaveTre3;

public class OppgTre3Main {
    public static void main(String[] args) {
        System.out.println("Oppgave 3.3: ");
        Firkant kvadrat = new Firkant("Kvadrat");
        Firkant tetragon = new Firkant("Tetragon");
        Sirkel sirkel = new Sirkel("Sirkel");

        FormKategori Firkanter = new FormKategori(kvadrat, tetragon);
        FormKategori Sirkler = new FormKategori(sirkel);

        //Lister opp formene.
        System.out.println("Kategorien (Firkant) inneholder følgende: " + Firkanter.getForm());
        System.out.println("Kategorien (Sirkel) inneholder følgende: " + Sirkler.getForm());

        System.out.println();

        OppgTre3 ramme = new OppgTre3(tetragon);
        System.out.println(ramme);
        System.out.println(tetragon);

        System.out.println();
        OppgTre3 rammeTo = new OppgTre3 (sirkel);
        System.out.println(rammeTo);
        System.out.println(sirkel);
    }
}
