public class ułamek<T extends Number>
{
    private T mianownik;
    private T licznik;

    public ułamek(T mianownik, T licznik) {
        this.mianownik =  mianownik;
        this.licznik = licznik;
    }

    public void add(ułamek u1)
    {
        T licznik=sprowadzanie_do_wspulnego_mianownika(u1);
        this.licznik=(T) (Number) (((Number)licznik).doubleValue() + ((Number) this.licznik).doubleValue());

    }
    public void sub(ułamek u1)
    {
        T licznik=sprowadzanie_do_wspulnego_mianownika(u1);
        this.licznik=(T) (Number) (((Number)this.licznik).doubleValue() - ((Number) licznik).doubleValue());
    }

    public void div(ułamek u1)
    {
        this.licznik=(T) (Number) (((Number)this.licznik).doubleValue() * ((Number) u1.mianownik).doubleValue());
        this.mianownik=(T) (Number) (((Number)this.mianownik).doubleValue() * ((Number) u1.licznik).doubleValue());
    }
    public void mul(ułamek u1)
    {
        this.licznik=(T) (Number) (((Number)this.licznik).doubleValue() * ((Number) u1.licznik).doubleValue());
        this.mianownik=(T) (Number) (((Number)this.mianownik).doubleValue() * ((Number) u1.mianownik).doubleValue());
    }
    private T sprowadzanie_do_wspulnego_mianownika(ułamek u1)
    {
        T tmplicznik=(T) (Number)(((Number) u1.licznik).doubleValue() *((Number)mianownik).doubleValue());
        licznik=(T) (Number)(((Number) licznik).doubleValue() *((Number)u1.mianownik).doubleValue());
        mianownik=(T) (Number)(((Number) u1.mianownik).doubleValue() * ((Number)mianownik).doubleValue());

            return  tmplicznik;
    }

    public void wyświetl()
    {
        System.out.println(licznik.toString()+ "/" + mianownik.toString());
    }
    public void skracanie_ułamka()
    {
        for(int i=this.mianownik.intValue();i>0;i--)
        {
            if(0.0 == licznik.doubleValue()%i &&  0.0 == mianownik.doubleValue()%i)
            {
                licznik = (T) (Number) (((Number) this.licznik).doubleValue() / i);
                mianownik = (T) (Number) (((Number) this.mianownik).doubleValue() / i);
            }
        }
    }


}
