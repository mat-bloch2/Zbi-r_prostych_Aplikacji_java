import java.util.Scanner;

class obsluga_wizytuwek {
    private  wizytuwki bazawizytuwek=new wizytuwki();
    private  Menu menu =new Menu();
    private  Scanner komendy =new Scanner(System.in);
    private  boolean koniec_programu=false;

    public  void interakrywna_obsluga_wizytuwek() {
        while (!koniec_programu) {
            menu.wyswietl_menu();
            switch (komendy.nextLine()) {
                case "1":
                    tworzeniewizytówki();
                    break;
                case "2":
                    wypiszwizytuwki();
                    break;
                case "3":
                    wyszukiwanie_po_nazwisku();
                    break;
                case "4":
                    odczytywanie_z_pliku();
                    break;
                case "5":
                    zapisywanie_do_pliku();
                    break;
                case "k":
                    koniec_obslugi();
                    break;
                default:
                     menu.blendnakomenda();
                    break;
            }

        }
    }
    public void koniec_obslugi()
    {
        menu.menukonca();
        koniec_programu = true;
    }
    public void wypiszwizytuwki()
    {
        menu.wypisz_wizytuwki(bazawizytuwek.WypiszWszystkieWizytuwki());
        komendy.next();
    }
    public void tworzeniewizytówki()
    {
        menu.wyswietl_nemu_tworzenia_wizytuwki();
        String[] daneWzytuwki=komendy.nextLine().split(" ");
        bazawizytuwek.dodajWizytuwke(daneWzytuwki[0],daneWzytuwki[1],daneWzytuwki[2],daneWzytuwki[3]);
    }
    public void zapisywanie_do_pliku()
    {
        menu.zapytaniaZapisuPLiku();
        bazawizytuwek.ZapiszWizytuwkeDoPliku(komendy.nextLine());
    }
    public void odczytywanie_z_pliku()
    {
        menu.ZapytaniaOdczytuPliku();
        bazawizytuwek.odczytajWizytuwke(komendy.nextLine());
    }
    public void wyszukiwanie_po_nazwisku()
    {
        menu.zapytaniawyszukiwania_po_nazwisku();
        menu.wypisz_wizytuwki(wyszukiwaniedanych.wyszukiwaniePowzorcu(komendy.nextLine(),1,bazawizytuwek.WypiszWszystkieWizytuwki()));
        komendy.next();
    }
}