public class OppgEn5 {

    static int count = 0;
    static int returnTall = -1;
    public static int helTall(int array[], int heltall){

        if (count <= array.length - 1){
            if (heltall == array[count]){
                returnTall = count;
                return count;
            }
            count++;
            helTall(array,heltall);
        }
        return returnTall;
    }

}
