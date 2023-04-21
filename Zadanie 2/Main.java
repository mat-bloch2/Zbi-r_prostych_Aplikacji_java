public class Main {


    public static void main(String args[])
    {
     ułamek u1=new ułamek(2,3);
     ułamek u2=new ułamek(2,3);
     u2.add(u1);
     u2.wyświetl();
     u2.sub(u1);
     u2.wyświetl();
     u2.skracanie_ułamka();
     u2.wyświetl();
     u1.mul(u2);
     u1.wyświetl();
     u1.skracanie_ułamka();
     u1.wyświetl();
     Complex lidzba= new Complex<Integer>(2,5);
     Complex lidzba2= new Complex<Integer>(3,5);
     ułamek uC=new ułamek<Complex>(lidzba,lidzba2);
        uC.wyświetl();
        uC.add(u2);
        uC.wyświetl();

    }
}
