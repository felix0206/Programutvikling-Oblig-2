
//Oppgave 3.2

public interface LampeStatus {

    LampeStatus endreLys();
    String getStatus();
}

class Lampe_Av implements LampeStatus{

    @Override
    public LampeStatus endreLys() {
        return new Lampe_Grønn();
    }

    @Override
    public String getStatus() {
        return "Av";
    }
}

class Lampe_Grønn implements LampeStatus{

    @Override
    public LampeStatus endreLys() {
        return new  Lampe_Oransje();
    }

    @Override
    public String getStatus() {
        return "Grønn";
    }
}

class Lampe_Oransje implements LampeStatus{

    @Override
    public LampeStatus endreLys() {
        return new Lampe_Rød();
    }

    @Override
    public String getStatus() {
        return "Oransje";
    }
}

class Lampe_Rød implements LampeStatus{

    @Override
    public LampeStatus endreLys() {
        return new Lampe_Av();
    }

    @Override
    public String getStatus() {
        return "Rød";
    }
}
