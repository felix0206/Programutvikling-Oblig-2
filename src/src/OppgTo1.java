public class OppgTo1 {
    public static <array> void printArray(array[] liste){

        System.out.print("{ ");
        for(array i : liste){
            System.out.printf("%s ", i);

        }
        System.out.print("}");
    }
}
