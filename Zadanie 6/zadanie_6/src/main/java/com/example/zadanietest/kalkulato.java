package com.example.zadanietest;

public class kalkulato {
    double number;
    double scala;
    double cursor;
    boolean dot;
    public kalkulato()
    {
        number=0.0;
        scala=1;
        cursor=10;
        dot=false;
    }
    public void add_nr(Short nr)
    {
        this.number*=cursor;
        this.number+=nr*scala;
        if(dot)
        {
            scala*=0.1;
        }

    }
    public void add_dot()
    {
        if(!dot) {
            scala = 0.1;
            dot=true;
            cursor=1;
        }
    }
    public void add(double number)
    {
        this.number+=number;
    }
    public void substaction(double number)
    {
        this.number-=number;
    }
    public void quotient( double number)
    {
        this.number/=number;
    }
    public void product(double number)
    {
        this.number*=number;
    }
    public double print_number()
    {
        return this.number;
    }
    public void sqrt()
    {
        this.number=Math.sqrt(this.number);
    }
    public void pow()
    {
        this.number=Math.pow(this.number,2);
    }
    public void negation()
    {
        this.number=-number;
    }
}
