public class OppgEn3 {
    public static int[] baklengs(int[] array, int start, int slutt){
        if(start<slutt){
            int temp = array[start];
            array[start]=array[slutt];
            array[slutt]=temp;
            baklengs(array, start+1, slutt-1);
        }
        return array;
    }

}
