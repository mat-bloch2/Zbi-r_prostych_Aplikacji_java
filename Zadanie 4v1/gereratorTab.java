import java.lang.reflect.Array;
import java.util.Random;

public class gereratorTab {

    private Random generator=new Random();
    private int[][] Tab;
    gereratorTab(int index,int tab) {
         this.Tab = new int[tab][];
        for (int i = 0; i < tab; i++)
        {
            Tab[i]=new int [index];
            for(int j=0;j<index;j++)
            {
                Tab[i][j]=generator.nextInt();
            }
        }
    }

    public int[][] getTab() {

        return Tab;
    }
}
