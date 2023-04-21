import static java.lang.Thread.sleep;

public class sumatablicy extends Thread {


    private int P,K;
    private int[][] tab;

    sumatablicy(int[][] tab,int P,int K)
    {
        this.tab=tab;
        this.P=P;
        this.K=K;
    }

    public void run() {
        int suma;
        for(int i=P;i<K;i++)
        {
            suma=0;
            for (int j=0;j<tab[i].length;j++)
            {
                suma+=tab[i][j];
            }
            System.out.println("Suma tablicy["+ i +"]="+ suma);
        }
    }
}
