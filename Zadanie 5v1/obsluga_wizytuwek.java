import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.lang.reflect.Array;

class obsluga_wizytuwek extends WindowAdapter{
    private final wizytuwki bazawizytuwek=new wizytuwki();
    private  Menu menu =new Menu();

    public obsluga_wizytuwek()
    {
    menu.search.addActionListener( wyszukiwanie_po_nazwisku(menu.komendy));
    menu.read.addActionListener(odczytywanie_z_pliku());
    menu.save.addActionListener(zapisywanie_do_pliku());
    menu.create.addActionListener(tworzeniewizytówki(menu.komendy));
    menu.view.addActionListener(wypiszwizytuwki());
    menu.f.addWindowListener(this);
    }

    public ActionListener wypiszwizytuwki()
    {
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.wypisz_wizytuwki(bazawizytuwek.WypiszWszystkieWizytuwki());
            }
        };
    }
    public ActionListener tworzeniewizytówki(TextField textField)
    {
        return  new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String[] daneWzytuwki=textField.getText().split(" ");
                bazawizytuwek.dodajWizytuwke(daneWzytuwki[0],daneWzytuwki[1],daneWzytuwki[2],daneWzytuwki[3]);
            }
        };

    }
    public ActionListener zapisywanie_do_pliku()
    {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                bazawizytuwek.ZapiszWizytuwkeDoPliku();
                menu.zapytaniaZapisuPLiku();

            }
        };


    }
    public ActionListener odczytywanie_z_pliku()
    {

        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.ZapytaniaOdczytuPliku();
                bazawizytuwek.odczytajWizytuwke();
            }
        };

    }
    public ActionListener wyszukiwanie_po_nazwisku(TextField dane )
    {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                menu.zapytaniawyszukiwania_po_nazwisku();

                menu.wypisz_wizytuwki(wyszukiwaniedanych.wyszukiwaniePowzorcu(dane.getText(),1,bazawizytuwek.WypiszWszystkieWizytuwki()));
            }
        };

    }

    public void windowClosing(WindowEvent e)
    {
        menu.f.dispose();
    }

}