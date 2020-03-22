package OppgaveTre3;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormKategori implements Watchable {
    private List<Shapes> kategorier;  // oppretter en liste med former

    public FormKategori(Shapes... items) {
        kategorier = Arrays.asList(items);
    }

    @Override
    public String getForm() {
        return kategorier.stream().map(Shapes::getForm).collect(Collectors.joining(", "));
    }
}