package OppgaveTo;

public class OppgTo2 {
    public static <array> void reverserArray(array[] liste) {

        System.out.print("{ ");

        for (int i = liste.length - 1; i >= 0; i--)
            System.out.printf("%s ", liste[i]);

        System.out.print("}");
    }
}
