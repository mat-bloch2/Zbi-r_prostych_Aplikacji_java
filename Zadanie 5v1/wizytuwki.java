import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class wizytuwki
{

    private List<DaneWizytuwki> Wizytuwki = new ArrayList<DaneWizytuwki>();

    private String scieszka="wizykowki.csv";

    public void wizytuwki()
    {
        odczytajWizytuwke();
    }
    public boolean dodajWizytuwke(String Imie, String Nazwisko, String NumerTelefonu, String Mail)
    {
        DaneWizytuwki dane= new DaneWizytuwki(Imie,Nazwisko,NumerTelefonu,Mail);
        return this.Wizytuwki.add(dane);
    }

    public void ZapiszWizytuwkeDoPliku()
    {
        PrintWriter zapis;
        try
        {
            zapis = new PrintWriter(scieszka);
            String[]dane;
            for (DaneWizytuwki i:Wizytuwki)
            {
                  dane=i.wypisz();
                  zapis.println(dane[0]+":"+dane[1]+":"+dane[2]+":"+dane[3]);
            }
            zapis.close();
        }
        catch (FileNotFoundException e)
        {
            throw new RuntimeException(e);
        }

    }
    public void odczytajWizytuwke()
    {
        BufferedReader odczyt ;
        try {
            odczyt =new BufferedReader(new FileReader(scieszka));
            String linia =odczyt.readLine();
            while(linia!= null )
            {
                String[] dane = linia.split(":");
                dodajWizytuwke(dane[0], dane[1], dane[2], dane[3]);
                linia =odczyt.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }

    public List<String[]> WypiszWszystkieWizytuwki()
    {
        List<String[]> dane= new ArrayList<String[]>();
        int j=0;
        for (DaneWizytuwki i:Wizytuwki) {
            dane.add(i.wypisz());
            j++;
        }
        return dane;
    }


}
