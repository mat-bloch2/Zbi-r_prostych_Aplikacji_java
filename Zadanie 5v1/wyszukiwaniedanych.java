import java.util.ArrayList;
import java.util.List;

public class wyszukiwaniedanych {

    public static List<String[]> wyszukiwaniePowzorcu(String wzorzec,int indeks,List<String[]> dane ) {

        List<String[]> wyszukane=new ArrayList<String[]>();
        for (int i = 0; i < dane.size(); i++)
        {

            if (wzorzec.equals(dane.get(i)[indeks]))
            {
                wyszukane.add(dane.get(i));

            }
        }
        return wyszukane;

    }
}
