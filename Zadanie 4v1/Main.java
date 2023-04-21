public class Main {

    public static void main(String[] args) {

        menu m=new menu();
        gereratorTab tab=new gereratorTab(m.getIndex(), m.getTab());
        sumatablicy sum1=new sumatablicy(tab.getTab(),0,m.getTab()/2);
        sumatablicy sum2=new sumatablicy(tab.getTab(),m.getTab()/2,m.getTab());
        sum2.start();
        sum1.start();
    }
}
