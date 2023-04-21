import java.util.List;
import java.awt.*;

public class Menu  extends  Frame {

    public Frame f = new Frame();
    TextField komendy;
    Button create;
    Button view;
    TextArea ekran;
    Button search;
    Button read;
    Button save;
        Menu()
        {
            f.setSize(600,600);
            f.setTitle("Wizytówki");
            f.setLayout(null);
            f.setVisible(true);
            komendy=new TextField();
            komendy.setBounds(50,500,450,20);
            ekran=new TextArea();
            ekran.setBounds(50,100,300,350);
            ekran.setEditable(false);
            create=new Button("utwóż wizytówke");
            create.setBounds(400,100,170,50);
            view=new Button("wyświetl wizytówki");
            view.setBounds(400,170,170,50);
            search=new Button("wyszukaj po nazwisku");
            search.setBounds(400,240,170,50);
            read=new Button("odczytaj wizytuwki z pliku");
            read.setBounds(400,310,170,50);
            save=new Button("zapisz wizytuwki do pliku");
            save.setBounds(400,380,170,50);
            f.add(create);
            f.add(view);
            f.add(search);
            f.add(read);
            f.add(save);
            f.add(komendy);
            f.add(ekran);
        }
    public void zapytaniawyszukiwania_po_nazwisku()
    {
        ekran.setText("wyszukane wizytówki:");
    }
    public void zapytaniaZapisuPLiku()
    {
        ekran.setText("wizykówki zapisane...");

    }
    public  void ZapytaniaOdczytuPliku()
    {
        ekran.setText("wizykówki odczytane ...");
    }

    public void wyswietl_nemu_tworzenia_wizytuwki()
    {
        ekran.setText("Aby utworzyć wizytówke Wpisz : Imie Nazwisko Tel. Mail");
    }
    public void wypisz_wizytuwki(List<String[]> WizytuwkiDowyswietlenia )
    {
        String [] wizytuwka;
        String allcards=new String();
        for(int i=0; i < WizytuwkiDowyswietlenia.size();i++)
        {
            wizytuwka=WizytuwkiDowyswietlenia.get(i);
            allcards+="wizytówka numer : "+ String.format("%d",i +1)+"\n";
            allcards+="imie......"+wizytuwka[0]+"\n";
            allcards+="nazwisko......"+wizytuwka[1]+"\n";
            allcards+="telefon......"+wizytuwka[2]+"\n";
            allcards+="mail......"+wizytuwka[3]+"\n";
        }
        ekran.setText(allcards);
    }
    public void blendnakomenda()
    {
        ekran.setText("Wpisaleś nie własciwą komendę");
    }


}
