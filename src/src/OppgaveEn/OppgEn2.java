package OppgaveEn;

public class OppgEn2 {

    public static int pow(int base, int exponent){

        if (exponent == 0) //hvis exponent er 0, vil svaret bli 1.
            return 1;

        if ((exponent & 1) == 1){ //hvis exponent er oddetall.
            return base * pow(base, exponent / 2) * pow(base,  exponent / 2);
        }

        return pow(base, exponent / 2) * pow(base, exponent / 2);

    }

}
