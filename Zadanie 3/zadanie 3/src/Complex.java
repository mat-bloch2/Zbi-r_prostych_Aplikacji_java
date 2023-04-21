import static java.lang.Math.sqrt;

public class Complex<T extends Number> extends Number
{
    private T real;
    private T imaginary;

    public Complex()
    {
        this.real = (T) Integer.valueOf(0);
        this.imaginary = (T) Integer.valueOf(0);
    }

    public Complex(T real, T imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    // SETTERY I GETTERY
    public void setImaginary(T imaginary)
    {
        this.imaginary = imaginary;
    }

    public Number getImaginary()
    {
        return imaginary;
    }

    public void setReal(T real)
    {
        this.real = real;
    }

    public Number getReal()
    {
        return real;
    }

    // Nadpisane METODY z klasy bazowej
    @Override
    public int intValue()
    {
        return this.real.intValue();
    }

    @Override
    public long longValue()
    {
        return this.real.longValue();
    }

    @Override
    public float floatValue()
    {
        return this.real.floatValue();
    }

    @Override
    public double doubleValue()
    {
        return this.real.doubleValue();
    }

    public String toString()
    {
        return this.real.toString() + "+" + this.imaginary.toString() + "i";
    }

    public void add(Complex<? extends Number> compVal)
    {
        imaginary=(T)(Number) (compVal.imaginary.doubleValue() + this.imaginary.doubleValue());
        real=(T)(Number)(compVal.real.doubleValue() + this.real.doubleValue());
    }

    public void add(Number compVal)
    {
        real = (T) (Number) (compVal.doubleValue() + this.real.doubleValue());
    }
    public T module()
    {
        double tmp= real.doubleValue()+imaginary.doubleValue();
     T modulo=(T)(Number)(sqrt(tmp));
     return modulo;
    }
    public void multiply(Complex<? extends Number> compVal)
    {
        double ima_ima=compVal.imaginary.doubleValue() * this.imaginary.doubleValue();
        double real_real=compVal.real.doubleValue() * this.real.doubleValue();
        double real_ima=compVal.real.doubleValue() * this.imaginary.doubleValue();
        double ima_real=compVal.imaginary.doubleValue() * this.real.doubleValue();

        this.real=(T)(Number)(real_real-ima_ima);
        this.imaginary=(T)(Number)(ima_real+real_ima);
    }

    public void multiply(Number c )
    {
        imaginary=(T)(Number) (c.doubleValue() * this.imaginary.doubleValue());
        real=(T)(Number)(c.doubleValue() * this.real.doubleValue());
    }

}