public class OppgEn4 {
    static int minst(int[] array, int start, int slutt){
        int min = array[0];
        for(int i : array){
            if(array[i] < min){
                min = array[i];
            }
        }
        return minst(array, start, slutt);
    }
}
