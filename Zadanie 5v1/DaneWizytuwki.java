public  class DaneWizytuwki {

    private String imie;
    private String nazwisko;
    private String telefon;
    private String mail;


    public DaneWizytuwki(String Imie, String Nazwisko, String NumerTelefonu, String Mail) {
        imie=Imie;
        nazwisko=Nazwisko;
        telefon=NumerTelefonu;
        mail=Mail;
    }

    public String[] wypisz()
    {
        String[] dane= new String[4];
        dane[0]=imie;
        dane[1]=nazwisko;
        dane[2]=telefon;
        dane[3]=mail;
        return dane;
    }


}
