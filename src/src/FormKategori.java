import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FormKategori implements Watchable {
    // oppretter en liste med former
    private List<Shapes> kategorier;

    // de to funksjonene nedenfor er modifisert ut i fra forelesers notater
    public FormKategori(Shapes... items) {
        kategorier = Arrays.asList(items);
    }

    @Override
    public String getForm() {
        return kategorier.stream().map(Shapes::getForm).collect(Collectors.joining(", "));
    }
}