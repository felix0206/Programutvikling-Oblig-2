import java.util.ArrayList;

public class OppgTo3 {

    static ArrayList<Object> liste = new ArrayList(5);

    public static boolean add(Object elem){
        if (liste.size() == 5 ){
            return false;
        }else{
            liste.add(elem);
            return true;
        }
    }

    public static Object get(int index){
        if (index > liste.size() || index < 0){
            throw new IndexOutOfBoundsException("Index er større enn arraylisten!");
        }
        else{
            return liste.get(index).toString();
        }
    }

    public static int size(){
        return liste.size();
    }
}
