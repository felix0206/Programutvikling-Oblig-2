public class Lampe {

    private LampeStatus status = new Lampe_Av();

    //Trykk på kontrolleren
    public void KnappeTrykk(){
        status = status.endreLys();
    }

    public void printStatus(){
        System.out.println(status.getStatus());
    }

}
