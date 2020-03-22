package OppgaveEn;

public class OppgEn3 {

    void reverserArray(int[] x){
        reverser(x, 0, x.length -1);
    }

    void reverser(int[] array, int start, int slutt){

        if(start<slutt){
            int tmp = array[start];
            array[start] = array[slutt];
            array[slutt] = tmp;
            reverser(array, ++start, --slutt);
            }
         }
    }





