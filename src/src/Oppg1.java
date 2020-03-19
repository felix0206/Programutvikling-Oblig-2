public class Oppg1 {

    public static int sum = 0;

    static void sum(int x){

            if (x >=0){
                sum+=x;
                x--;
                sum(x);
        }
            if (x == 0)
            System.out.println(sum);
    }

}
