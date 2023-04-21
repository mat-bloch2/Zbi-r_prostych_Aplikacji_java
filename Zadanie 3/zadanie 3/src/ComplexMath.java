public class ComplexMath
{
    private ComplexMath() {}

    public static Complex add(Complex <? extends Number> c1, Complex<? extends Number> c2)
    {
        var real1 = c1.getReal();
        var real2 = c2.getReal();
        var imag1 = c1.getImaginary();
        var imag2 = c2.getImaginary();

        if ( real1 instanceof Double || real2 instanceof Double )
        {
            return new Complex<Double>(real1.doubleValue() + real2.doubleValue(),imag1.doubleValue() + imag2.doubleValue());
        }
        else if ( real1 instanceof Float || real2 instanceof Float )
        {
            return new Complex<Float>(real1.floatValue() + real2.floatValue(),imag1.floatValue() + imag2.floatValue());
        }
        else if ( real1 instanceof Long  || real2 instanceof Long )
        {
            return new Complex<Long>(real1.longValue() + real2.longValue(),imag1.longValue() + imag2.longValue());
        }
        else
        {
            return new Complex<Integer>(real1.intValue() + real2.intValue(), imag1.intValue() + imag2.intValue());
        }

    }



    public static Complex add(Complex <? extends Number> c1,Number c2)
    {
        var real1 = c1.getReal();
        var real2 = c2;
        var imag1 = c1.getImaginary();

        if ( real1 instanceof Double || real2 instanceof Double )
        {
            return new Complex<Double>(real1.doubleValue() + real2.doubleValue(),imag1.doubleValue() );
        }
        else if ( real1 instanceof Float || real2 instanceof Float )
        {
            return new Complex<Float>(real1.floatValue() + real2.floatValue(),imag1.floatValue() );
        }
        else if ( real1 instanceof Long  || real2 instanceof Long )
        {
            return new Complex<Long>(real1.longValue() + real2.longValue(),imag1.longValue() );
        }
        else
        {
            return new Complex<Integer>(real1.intValue() + real2.intValue(), imag1.intValue());
        }

    }

    public static Complex sub(Complex <? extends Number> c1, Complex<? extends Number> c2)
    {
        var real1 = c1.getReal();
        var real2 = c2.getReal();
        var imag1 = c1.getImaginary();
        var imag2 = c2.getImaginary();

        if ( real1 instanceof Double || real2 instanceof Double )
        {
            return new Complex<Double>(real1.doubleValue() - real2.doubleValue(),imag1.doubleValue() - imag2.doubleValue());
        }
        else if ( real1 instanceof Float || real2 instanceof Float )
        {
            return new Complex<Float>(real1.floatValue() - real2.floatValue(),imag1.floatValue() - imag2.floatValue());
        }
        else if ( real1 instanceof Long  || real2 instanceof Long )
        {
            return new Complex<Long>(real1.longValue() - real2.longValue(),imag1.longValue() - imag2.longValue());
        }
        else
        {
            return new Complex<Integer>(real1.intValue() - real2.intValue(), imag1.intValue() - imag2.intValue());
        }

    }

    public static Complex multiply(Complex <? extends Number> c1, Complex<? extends Number> c2)
    {
        var real1 = c1.getReal();
        var real2 = c2.getReal();

        Complex wynik= new Complex(c1.getReal(),c2.getImaginary());
        wynik.multiply(c2);

        if ( real1 instanceof Double || real2 instanceof Double )
        {
            return new Complex<Double>(wynik.getReal().doubleValue(),wynik.getImaginary().doubleValue());
        }
        else if ( real1 instanceof Float || real2 instanceof Float )
        {
            return new Complex<Float>(wynik.getReal().floatValue() ,wynik.getImaginary().floatValue());
        }
        else if ( real1 instanceof Long  || real2 instanceof Long )
        {
            return new Complex<Long>(wynik.getReal().longValue(),wynik.getImaginary().longValue());
        }
        else
        {
            return new Complex<Integer>(wynik.getReal().intValue(), wynik.getImaginary().intValue());
        }

    }
    public static Complex multiply(Complex <? extends Number> c1,Number c2)
    {
        var real1 = c1.getReal();
        var real2 = c2;
        var imag1 = c1.getImaginary();

        if ( real1 instanceof Double || real2 instanceof Double )
        {
            return new Complex<Double>(real1.doubleValue() * c2.doubleValue(),imag1.doubleValue()* c2.doubleValue() );
        }
        else if ( real1 instanceof Float || real2 instanceof Float )
        {
            return new Complex<Float>(real1.floatValue() * c2.floatValue(),imag1.floatValue() * c2.floatValue());
        }
        else if ( real1 instanceof Long  || real2 instanceof Long )
        {
            return new Complex<Long>(real1.longValue() * c2.longValue(),imag1.longValue()* c2.longValue() );
        }
        else
        {
            return new Complex<Integer>(real1.intValue() * c2.intValue(), imag1.intValue() * c2.intValue());
        }
    }

    public static Complex changeType(Complex <? extends Number> c1,Number c2)
    {
        var real1 = c1.getReal();
        var real2 = c2;
        var imag1 = c1.getImaginary();

        if ( c2 instanceof Double )
        {
            return new Complex<Double>(real1.doubleValue() ,imag1.doubleValue());
        }
        else if ( c2 instanceof Float )
        {
            return new Complex<Float>(real1.floatValue() ,imag1.floatValue());
        }
        else if ( c2 instanceof Long )
        {
            return new Complex<Long>(real1.longValue() ,imag1.longValue() );
        }
        else
        {
            return new Complex<Integer>(real1.intValue() , imag1.intValue());
        }

    }












}