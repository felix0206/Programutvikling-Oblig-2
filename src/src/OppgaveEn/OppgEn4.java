package OppgaveEn;

public class OppgEn4 {

    static int minTemp = Integer.MAX_VALUE;
    static int count = 0;

    public static int minst(int[] array) {

        if (array.length == 1) {
            return array[0];
        }

        if (count <= array.length - 1) {
            if (array[count] < minTemp){
                minTemp = array[count];
            }
            count++;
            minst(array);
        }

        return minTemp;
    }
}
