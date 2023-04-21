import java.util.List;

public class Menu {
    public void wyswietl_menu()
    {
        System.out.println("Menu");
        System.out.println("1-utwóż wizytówke");
        System.out.println("2-wyświetl wizytówki");
        System.out.println("3-wyszukaj wizykówkę z bazy po nazwisku");
        System.out.println("4-odczytaj wizytuwki z pliku");
        System.out.println("5-zapisz wizytuwki do pliku");
        System.out.println("k-koniec programu");
    }
    public void zapytaniawyszukiwania_po_nazwisku()
    {
        System.out.println("wpisz szukane nazwisko :");
    }
    public void zapytaniaZapisuPLiku()
    {
        System.out.println("W jakim pliku zapisać wizytówki ?");

    }
    public  void ZapytaniaOdczytuPliku()
    {
        System.out.println("w jakim pliku odczytać wyzytówki");
    }

    public void wyswietl_nemu_tworzenia_wizytuwki()
    {
        System.out.println("Menu");
        System.out.println("Aby utworzyć wizytówke Wpisz : Imie Nazwisko Tel. Mail");
    }
    public void wypisz_wizytuwki(List<String[]> WizytuwkiDowyswietlenia )
    {
        String [] wizytuwka;
        for(int i=0; i < WizytuwkiDowyswietlenia.size();i++)
        {
            wizytuwka=WizytuwkiDowyswietlenia.get(i);
            System.out.println("wizytówka numer : "+ String.format("%d",i +1));
            System.out.println("imie......"+wizytuwka[0]);
            System.out.println("nazwisko......"+wizytuwka[1]);
            System.out.println("telefon......"+wizytuwka[2]);
            System.out.println("mail......"+wizytuwka[3]);
        }

    }
    public void menukonca()
    {
        System.out.println("Praca programu została przerwana");
    }
    public void blendnakomenda()
    {
        System.out.println("Wpisaleś nie własciwą komendę");
    }


}
