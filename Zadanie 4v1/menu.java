import java.util.Scanner;

public class menu {

    private int tab,index;
    menu()
    {
        Scanner komendy=new Scanner(System.in);
        System.out.println("wpisz lidzbe tablic");
        tab=Integer.parseInt(komendy.next());
        System.out.println("wpisz lidzbe indexu");
        index=Integer.parseInt(komendy.next());
    }

    public int getIndex() {
        return index;
    }

    public int getTab() {
        return tab;
    }
}
